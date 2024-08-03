package com.eazybytes.springsecuritybasic.controller;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class AccountController {

    @GetMapping("/myAccounts")
    public ResponseEntity<String> getAccountDetails(){
        return ResponseEntity.ok("Here are the account details from the DB");
    }
}
