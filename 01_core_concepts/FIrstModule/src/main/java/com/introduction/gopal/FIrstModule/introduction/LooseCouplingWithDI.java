package com.introduction.gopal.FIrstModule.introduction;

/**
 * ============================================================
 * TOPIC: The Solution — Loose Coupling with Interfaces + Spring DI
 * ============================================================
 *
 * PDF: "Spring Framework to the Rescue 🚀"
 *
 * Fix for all 3 problems:
 *
 * Problem 1 Fix — Loose Coupling:
 *   OrderService depends on an INTERFACE (PaymentService), not a concrete class.
 *   You can switch implementations without touching OrderService.
 *
 * Problem 2 Fix — Easy to Test:
 *   In tests, just inject a MockPaymentService — no code changes needed.
 *
 * Problem 3 Fix — Centralized Object Creation:
 *   Spring's IoC container creates and manages all objects.
 *   No `new` scattered across the codebase.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// ✅ Define a common interface — OrderService only knows about this
interface PaymentService {
    void pay();
}

// ✅ Implementation 1: Razorpay
@Component("razorpay")
class RazorpayPaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("[Loose Coupling] ✅ Paid via Razorpay");
    }
}

// ✅ Implementation 2: Stripe — can swap in without touching OrderService
@Component("stripe")
class StripePaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("[Loose Coupling] ✅ Paid via Stripe");
    }
}

// ✅ OrderService only knows about the PaymentService INTERFACE
// Spring injects the right implementation automatically (Dependency Injection)
@Service
public class LooseCouplingWithDI {

    // Spring injects the correct PaymentService here — OrderService doesn't decide!
    // Use @Qualifier to choose which implementation to inject
    @Autowired
    @org.springframework.beans.factory.annotation.Qualifier("razorpay")
    private PaymentService paymentService;

    public void placeOrder() {
        System.out.println("\n--- Solution: Loose Coupling with DI ---");
        System.out.println("✅ OrderService doesn't know or care which payment provider is used.");
        System.out.println("   Spring injects the right one automatically!");
        paymentService.pay();
        System.out.println("To switch to Stripe: just change @Qualifier(\"stripe\") — zero logic changes!");
    }
}
