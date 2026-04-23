package com.introduction.gopal.FIrstModule.beans;

/**
 * ============================================================
 * TOPIC 3: Bean Lifecycle
 * ============================================================
 *
 * Every Spring Bean goes through this lifecycle:
 *
 *  1. Bean Created       → Spring instantiates the object
 *  2. Dependency Injected → Spring injects @Autowired dependencies
 *  3. Bean Initialised   → @PostConstruct method is called
 *  4. Bean is used       → Your application uses it normally
 *  5. Bean Destroyed     → @PreDestroy method is called before shutdown
 *
 * Key annotations:
 *  @PostConstruct → Runs ONCE after bean is created + dependencies injected
 *  @PreDestroy    → Runs ONCE just before the bean is destroyed (app shutdown)
 *
 * Common use-cases:
 *  @PostConstruct → Open DB connections, warm up caches, validate config
 *  @PreDestroy    → Close connections, flush buffers, release resources
 */

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycleDemo {

    // Step 1: Spring calls the constructor first
    public BeanLifecycleDemo() {
        System.out.println("[LIFECYCLE] Step 1: Bean CREATED — constructor called");
    }

    // Step 3: Called automatically by Spring after dependencies are injected
    @PostConstruct
    public void onStartup() {
        System.out.println("[LIFECYCLE] Step 3: Bean INITIALISED — @PostConstruct called");
        System.out.println("[LIFECYCLE]   → Good place to: open connections, load cache, validate config");
    }

    // Step 4: Normal usage
    public void doWork() {
        System.out.println("[LIFECYCLE] Step 4: Bean is BEING USED — doWork() called");
    }

    // Step 5: Called automatically by Spring just before app shuts down
    @PreDestroy
    public void onShutdown() {
        System.out.println("[LIFECYCLE] Step 5: Bean DESTROYED — @PreDestroy called");
        System.out.println("[LIFECYCLE]   → Good place to: close connections, flush data, release resources");
    }
}
