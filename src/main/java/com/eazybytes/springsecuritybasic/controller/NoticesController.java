package com.eazybytes.springsecuritybasic.controller;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class NoticesController {

    @GetMapping("/notices")
    public ResponseEntity<String> getNoticesDetails(){
        return ResponseEntity.ok("Here are the Notices details from the DB");
    }
}
