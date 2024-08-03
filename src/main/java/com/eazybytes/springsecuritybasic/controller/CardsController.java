package com.eazybytes.springsecuritybasic.controller;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class CardsController {

    @GetMapping("/myCards")
    public ResponseEntity<String> getCardsDetails(){
        return ResponseEntity.ok("Here are the cards details from the DB");
    }
}
