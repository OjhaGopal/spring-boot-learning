package com.introduction.gopal.FIrstModule.beans;

/**
 * ============================================================
 * TOPIC: Bean Scopes — Demo Runner
 * ============================================================
 *
 * PDF Page 7: Bean Scopes
 *
 * | Scope       | Instances          | Use case                           |
 * |-------------|--------------------|------------------------------------|
 * | singleton   | ONE per app        | Services, Repositories (stateless)  |
 * | prototype   | NEW every time     | Stateful objects, per-request data  |
 * | request     | ONE per HTTP req   | Web apps only                       |
 * | session     | ONE per session    | Shopping cart, user preferences     |
 * | application | ONE per context    | Global config                       |
 *
 * Run this demo and observe:
 *  ✅ Singleton:  counter1 == counter2 → TRUE  (same object, shared state)
 *  ✅ Prototype:  req1    == req2      → FALSE (different objects, different timestamps)
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanScopesDemo {

    // Both fields receive the SAME singleton instance
    @Autowired
    private SingletonCounter counter1;

    @Autowired
    private SingletonCounter counter2;

    // ApplicationContext lets us manually request beans (needed for prototype)
    @Autowired
    private ApplicationContext context;

    public void demonstrateScopes() {
        System.out.println("\n========== BEAN SCOPES DEMO ==========");

        // --- Singleton Demo ---
        System.out.println("\n--- Singleton Scope ---");
        counter1.increment();
        counter1.increment();
        counter1.describe();  // count = 2

        // counter2 is the SAME object — they share count!
        counter2.describe();  // count = 2 (not 0!)
        System.out.println("counter1 == counter2? " + (counter1 == counter2));  // true

        // --- Prototype Demo ---
        System.out.println("\n--- Prototype Scope ---");
        // Must use ApplicationContext.getBean() to get a new prototype instance each time
        PrototypeRequest req1 = context.getBean(PrototypeRequest.class);
        PrototypeRequest req2 = context.getBean(PrototypeRequest.class);

        req1.describe();
        req2.describe();
        System.out.println("req1 == req2? " + (req1 == req2));  // false!

        System.out.println("======================================\n");
    }
}
