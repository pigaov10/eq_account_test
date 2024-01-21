package com.equadis.acc.command.api.commands.account;

import com.equadis.acc.command.api.commands.BaseCommand;
import lombok.Data;


@Data
public class OpenAccountCommand extends BaseCommand {
    private double balance;
}
