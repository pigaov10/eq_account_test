package com.equadis.acc.command.domain.service;

import org.springframework.stereotype.Service;

@Service
public class OpenCheckingAccountService {

    public boolean checkInitialBalance(double balance) {
        return balance == 0;
    }
}
