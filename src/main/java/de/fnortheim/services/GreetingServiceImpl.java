package de.fnortheim.services;

import org.springframework.stereotype.Service;

/**
 * created by sebastian on Mar, 2019
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_WORLD = "Hello world";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
