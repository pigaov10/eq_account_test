package com.equadis.acc.command.api.controllers.account;

import com.equadis.acc.command.api.commands.account.OpenAccountCommand;
import infrastructure.CommandDispatcher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping(path = "/api/v1/openCheckingAccount")
public class OpenCheckingAccountController {
    private final Logger logger = Logger.getLogger(OpenCheckingAccountController.class.getName());

    private final CommandDispatcher commandDispatcher;

    public OpenCheckingAccountController(CommandDispatcher commandDispatcher) {
        this.commandDispatcher = commandDispatcher;
    }

    @PostMapping
    public ResponseEntity<OpenAccountCommand> openCheckingAccount(@RequestBody OpenAccountCommand openAccountCommand) {
        logger.info("balance is:" + openAccountCommand);
        commandDispatcher.send(openAccountCommand);
        return ResponseEntity.ok().body(openAccountCommand);
    }
}
