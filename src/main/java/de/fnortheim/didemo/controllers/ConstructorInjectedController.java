package de.fnortheim.didemo.controllers;

import de.fnortheim.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * created by sebastian on Mar, 2019
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    // Constructor injection does not need @Autowired anymore
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
