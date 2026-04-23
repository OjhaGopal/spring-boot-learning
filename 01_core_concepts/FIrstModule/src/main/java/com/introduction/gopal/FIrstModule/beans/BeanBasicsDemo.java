package com.introduction.gopal.FIrstModule.beans;

/**
 * ============================================================
 * TOPIC 1: What is a Spring Bean?
 * ============================================================
 *
 * A Spring Bean is simply a Java object that is:
 *  - Instantiated by Spring (you don't call `new`)
 *  - Configured by Spring
 *  - Managed throughout its lifecycle by Spring
 *
 * Without Spring, you'd do:
 *      Engine engine = new Engine();     <-- YOU manage the object
 *
 * With Spring:
 *      @Autowired Engine engine;         <-- SPRING manages the object
 *
 * This is called Inversion of Control (IoC).
 */

import org.springframework.stereotype.Component;

// @Component tells Spring: "Hey, manage this class as a Bean"
@Component
public class BeanBasicsDemo {

    public void describe() {
        System.out.println("==============================================");
        System.out.println("  I am a Spring Bean!");
        System.out.println("  - Spring created me (not 'new BeanBasicsDemo()')");
        System.out.println("  - Spring configured me");
        System.out.println("  - Spring manages my entire lifecycle");
        System.out.println("==============================================");
    }
}
