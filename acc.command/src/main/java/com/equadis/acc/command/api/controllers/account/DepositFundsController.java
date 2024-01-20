package com.equadis.acc.command.api.controllers.account;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping(path = "/api/v1/depositFunds")
public class DepositFundsController {
    private final Logger logger = Logger.getLogger(DepositFundsController.class.getName());

    @PutMapping(path = "/{id}")
    public ResponseEntity<Object> depositFunds() {
        return ResponseEntity.ok().body("Deposit Funds");
    }
}
