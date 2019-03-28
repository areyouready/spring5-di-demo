package de.fnortheim.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * created by sebastian on Mar, 2019
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
        ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("LifeCycleConstructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post construct annotated method was called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Predestroy annotated method was called");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory was called");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName was called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy was called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet was called");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext was called");
    }

    public void beforeInit() {
        System.out.println("beforeInit was called");
    }

    public void afterInit() {
        System.out.println("afterInit was called");
    }
}
