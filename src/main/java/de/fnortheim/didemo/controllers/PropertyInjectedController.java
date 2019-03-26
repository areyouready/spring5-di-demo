package de.fnortheim.didemo.controllers;

import de.fnortheim.didemo.services.GreetingService;
import de.fnortheim.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * created by sebastian on Mar, 2019
 *
 * Anti Pattern
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl; //bean name is used to define right implementation to inject (works with reflection)

    @Autowired
    public GreetingService primaryGreetingService;

    public String sayHello() {
        primaryGreetingService.sayGreeting();
        return greetingServiceImpl.sayGreeting();
    }


}
