package de.fnortheim.didemo;

import de.fnortheim.didemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        // Bean with @Controller annotation is createg by Spring context and can be used without manually creating a new instance
        MyController myController = (MyController) ctx.getBean("myController");
        myController.hello();
    }

}
