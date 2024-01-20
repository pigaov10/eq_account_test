package com.equadis.acc.command.api.controllers.account;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping(path = "/api/v1/openCheckingAccount")
public class OpenCheckingAccountController {
    private final Logger logger = Logger.getLogger(OpenCheckingAccountController.class.getName());

    @PostMapping
    public ResponseEntity<Object> openCheckingAccount() {
        return ResponseEntity.ok().body("Open Account Controller");
    }
}
