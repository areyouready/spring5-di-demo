package de.fnortheim.didemo.controllers;

import de.fnortheim.didemo.services.GreetingServiceImpl;

/**
 * created by sebastian on Mar, 2019
 *
 * Anti Pattern
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
