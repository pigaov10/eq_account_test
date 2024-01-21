package infrastructure.impl;

import com.equadis.acc.command.api.commands.BaseCommand;
import infrastructure.CommandDispatcher;

public class CheckingAccountCommandDispatcher implements CommandDispatcher {
    @Override
    public void send(BaseCommand baseCommand) {
        System.out.println("implement code");
    }
}
