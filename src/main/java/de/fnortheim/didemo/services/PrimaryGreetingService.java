package de.fnortheim.didemo.services;

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

    private final GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {

        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
