package de.fnortheim.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * created by sebastian on Mar, 2019
 */
@Service
@Primary //makes it the default injection target when GreetingService is injected without further differentiation
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from primary greeting service";
    }
}
