package com.example.tutorial.controller;

import com.example.tutorial.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spa")
public class SpaController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greeting")
    public String meetCustomer() {
        String treatmentToOffer = "Swedish Massage";  // default option

        // Some code here to extract the most appropriate treatment to offer

        return greetingService.greetACustomer() + " Would you like to try a " + treatmentToOffer  + " today?";
    }
}
