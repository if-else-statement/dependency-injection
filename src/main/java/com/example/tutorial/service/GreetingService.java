package com.example.tutorial.service;

import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class GreetingService {

    private static int instanceCount = 0;

    public GreetingService() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public String greetACustomer() {
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();

        String greeting;

        if (hour >= 0 && hour < 12) {
            greeting = "Good morning!";
        } else if (hour >= 12 && hour < 18) {
            greeting = "Good afternoon!";
        } else {
            greeting = "Good evening!";
        }
        return greeting;
    }
}
