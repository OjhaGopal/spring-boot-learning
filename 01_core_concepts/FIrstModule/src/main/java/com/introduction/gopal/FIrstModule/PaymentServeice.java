package com.introduction.gopal.FIrstModule;

/**
 * ============================================================
 * Your very first Spring Bean! 🎉
 * ============================================================
 * This was the first class you created while learning Spring.
 *
 * @Component  → registers this class as a Spring-managed Bean
 *
 * Without Spring: OrderService would do `new PaymentServeice()` (tight coupling)
 * With Spring:    OrderService uses @Autowired PaymentServeice (loose coupling)
 *
 * This class lives in the root package intentionally —
 * see `introduction/TightCouplingProblem.java` for the full before/after story.
 * ============================================================
 */

import org.springframework.stereotype.Component;

@Component
public class PaymentServeice {

    public void pay() {
        System.out.println("[PaymentServeice] ✅ Payment done! (Your first Spring Bean in action)");
    }
}
