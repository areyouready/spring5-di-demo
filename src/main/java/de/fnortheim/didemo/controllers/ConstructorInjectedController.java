package de.fnortheim.didemo.controllers;

import de.fnortheim.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * created by sebastian on Mar, 2019
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    // COnstructor injection does not need @Autowired anymore
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
