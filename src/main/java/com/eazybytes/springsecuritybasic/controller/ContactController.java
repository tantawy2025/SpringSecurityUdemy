package com.eazybytes.springsecuritybasic.controller;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class ContactController {

    @GetMapping("/contact")
    public ResponseEntity<String> getContactInquiryDetails(){
        return ResponseEntity.ok("Inquiry details are saved to the DB");
    }
}
