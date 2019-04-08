package de.fnortheim.services;

import org.springframework.stereotype.Service;

/**
 * created by sebastian on Mar, 2019
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from constructor injection";
    }
}
