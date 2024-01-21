package infrastructure;

import com.equadis.acc.command.api.commands.BaseCommand;

public interface CommandDispatcher {
    void send(BaseCommand baseCommand);
}
