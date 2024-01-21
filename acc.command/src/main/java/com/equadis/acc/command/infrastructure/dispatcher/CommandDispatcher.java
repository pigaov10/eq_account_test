package com.equadis.acc.command.infrastructure.dispatcher;

import com.equadis.acc.command.api.commands.BaseCommand;
import com.equadis.acc.command.api.commands.CommandHandlerMethod;

public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);
    void send(BaseCommand baseCommand);
}
