package de.fnortheim.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * created by sebastian on Mar, 2019
 */
@Service
@Primary
@Profile({"de", "default"}) //default makes this the fallback if no profile is selected in application.properties
public class PrimaryGermanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Primärer Grußdienst";
    }
}
