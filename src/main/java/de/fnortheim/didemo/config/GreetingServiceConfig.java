package de.fnortheim.didemo.config;

import de.fnortheim.didemo.services.GreetingRepository;
import de.fnortheim.didemo.services.GreetingServiceFactory;
import de.fnortheim.didemo.services.PrimarySpanishGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * created by sebastian on Apr, 2019
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) { // spring injects the repository automatically
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Profile("es")
    @Primary
    PrimarySpanishGreetingService primarySpanishGreetingService(GreetingRepository greetingRepository) {
        return new PrimarySpanishGreetingService(greetingRepository);
    }
}
