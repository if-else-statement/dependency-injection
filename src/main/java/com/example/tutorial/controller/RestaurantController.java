package com.example.tutorial.controller;

import com.example.tutorial.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greeting")
    public String meetCustomer() {
        String mealToOffer = "Seafood Risotto"; // default option

        // Some code here to extract the most appropriate meal to offer

        System.out.println("Number of objects of a GreetingService class created: " + greetingService.getInstanceCount());

        return greetingService.greetACustomer() + " Would you like to try some " + mealToOffer  + " today?";
    }

    // Some other endpoints will be defined here
}
