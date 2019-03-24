package de.fnortheim.didemo.controllers;

import de.fnortheim.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by sebastian on Mar, 2019
 */
public class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_WORLD, this.setterInjectedController.sayHello());
    }

}