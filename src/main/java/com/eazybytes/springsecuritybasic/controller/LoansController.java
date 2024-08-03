package com.eazybytes.springsecuritybasic.controller;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class LoansController {

    @GetMapping("/myLoans")
    public ResponseEntity<String> getLoansDetails(){
        return ResponseEntity.ok("Here are the Loans details from the DB");
    }
}
