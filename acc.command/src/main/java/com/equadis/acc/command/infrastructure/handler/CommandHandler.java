package com.equadis.acc.command.infrastructure.handler;

import com.equadis.acc.command.api.commands.account.OpenAccountCommand;

public interface CommandHandler {
    void handle(OpenAccountCommand openAccountCommand);
}
