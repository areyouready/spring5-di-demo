package de.fnortheim.didemo.controllers;

import de.fnortheim.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * created by sebastianbasner on Mar, 2019
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello World from MyController");

        return greetingService.sayGreeting();
    }
}
