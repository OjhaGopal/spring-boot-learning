package com.introduction.gopal.FIrstModule.beans;

/**
 * ============================================================
 * TOPIC: How to create Beans — Method 2: @Bean in @Configuration
 * ============================================================
 *
 * When you can't add @Component to a class (e.g., a third-party library class),
 * use @Bean inside a @Configuration class to manually define a bean.
 *
 * Example: Registering a custom WelcomeFormatter as a Spring Bean.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// A plain Java class — imagine this is from an external library (no @Component possible)
class WelcomeFormatter {
    private final String prefix;

    public WelcomeFormatter(String prefix) {
        this.prefix = prefix;
    }

    public String format(String name) {
        return prefix + ", " + name + "!";
    }
}

// @Configuration = this class defines beans via @Bean methods
@Configuration
public class BeanConfigDemo {

    // @Bean = Spring calls this method and registers the returned object as a Bean
    @Bean
    public WelcomeFormatter welcomeFormatter() {
        return new WelcomeFormatter("Hello");  // Spring manages this object from now on
    }
}
