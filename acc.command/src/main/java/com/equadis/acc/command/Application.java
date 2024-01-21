package com.equadis.acc.command;

import com.equadis.acc.command.api.commands.account.OpenAccountCommand;
import com.equadis.acc.command.infrastructure.dispatcher.CommandDispatcher;
import com.equadis.acc.command.infrastructure.handler.CommandHandler;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	@Autowired
	private CommandDispatcher commandDispatcher;

	@Autowired
	private CommandHandler commandHandler;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void registerHandlers() {
		commandDispatcher.registerHandler(OpenAccountCommand.class, commandHandler::handle);
	}
}
