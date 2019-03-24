package de.fnortheim.didemo.controllers;

import de.fnortheim.didemo.services.GreetingService;

/**
 * created by sebastian on Mar, 2019
 */
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
