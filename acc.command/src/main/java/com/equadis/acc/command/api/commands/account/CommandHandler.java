package com.equadis.acc.command.api.commands.account;

import com.equadis.acc.command.api.commands.account.impl.OpenAccountCommand;

public interface CommandHandler {
    void handle(OpenAccountCommand command);
}
