package com.equadis.acc.command.infrastructure.handler.impl;

import com.equadis.acc.command.api.commands.account.OpenAccountCommand;
import com.equadis.acc.command.infrastructure.handler.CommandHandler;
import org.springframework.stereotype.Component;

@Component
public class CheckingAccountCommandHandler implements CommandHandler {
    @Override
    public void handle(OpenAccountCommand openAccountCommand) {
    }
}
