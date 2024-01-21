package com.equadis.acc.command.infrastructure.dispatcher.impl;

import com.equadis.acc.command.api.commands.BaseCommand;
import com.equadis.acc.command.api.commands.CommandHandlerMethod;
import com.equadis.acc.command.infrastructure.dispatcher.CommandDispatcher;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Component
public class CheckingAccountCommandDispatcher implements CommandDispatcher {

    private final Map<Class<? extends BaseCommand>, List<CommandHandlerMethod>> routes = new HashMap<>();

    @Override
    public <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler) {
        var handlers = routes.computeIfAbsent(type, c -> new LinkedList<>());
        handlers.add(handler);
    }

    @Override
    public void send(BaseCommand baseCommand) {
        System.out.println("implement code");
    }
}
