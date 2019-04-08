package de.fnortheim.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * created by sebastian on Mar, 2019
 */
@Service
@Primary //makes it the default injection target when GreetingService is injected without further differentiation
@Profile("en")
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from primary greeting service";
    }
}
