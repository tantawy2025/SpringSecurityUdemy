package com.eazybytes.springsecuritybasic.controller;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class BalanceController {

    @GetMapping("/myBalance")
    public ResponseEntity<String> getBalanceDetails(){
        return ResponseEntity.ok("Here are the balance details from the DB");
    }
}
