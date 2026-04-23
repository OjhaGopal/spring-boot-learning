package com.introduction.gopal.FIrstModule.beans;

/**
 * ============================================================
 * TOPIC: How to create Beans — Method 1: Stereotype Annotations
 * ============================================================
 *
 * Spring provides stereotype annotations, all of which register a Bean.
 * They differ only in their *semantic meaning* (which layer they belong to):
 *
 *  @Component   → Generic bean (use when no specific layer applies)
 *  @Service     → Business logic layer
 *  @Repository  → Data access layer (also adds DB exception translation)
 *  @Controller  → Web/MVC layer (returns views)
 *  @RestController → Web layer (returns JSON/data, not views)
 *
 * All of these are picked up automatically by Spring's component scan
 * because @SpringBootApplication includes @ComponentScan.
 *
 * See also: BeanConfigDemo.java — for @Bean in @Configuration (Method 2)
 */

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// ---- @Component: generic, no specific layer ----
@Component
class GenericHelper {
    public String help() {
        return "I am a generic @Component bean";
    }
}

// ---- @Service: business logic ----
@Service
class OrderService {
    public String processOrder() {
        return "I am a @Service bean — I handle business logic";
    }
}

// ---- @Repository: database access ----
@Repository
class ProductRepository {
    public String fetchProducts() {
        return "I am a @Repository bean — I talk to the database";
    }
}
