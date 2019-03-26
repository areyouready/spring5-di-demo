package de.fnortheim.didemo;

import de.fnortheim.didemo.controllers.MyController;
import de.fnortheim.didemo.controllers.ConstructorInjectedController;
import de.fnortheim.didemo.controllers.PropertyInjectedController;
import de.fnortheim.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        // Bean with @Controller annotation is createg by Spring context and can be used without manually creating a new instance
        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println(myController.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
