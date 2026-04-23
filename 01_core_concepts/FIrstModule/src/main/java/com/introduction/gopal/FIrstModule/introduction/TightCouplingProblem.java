package com.introduction.gopal.FIrstModule.introduction;

/**
 * ============================================================
 * TOPIC: The Problem — Tight Coupling (Before Spring)
 * ============================================================
 *
 * PDF: "3 Major Problems with this code"
 *
 * Problem 1 — Tight Coupling:
 *   OrderService creates PaymentService itself using `new`.
 *   If you want to switch to StripePaymentService, you must
 *   edit and recompile OrderService.
 *
 * Problem 2 — Hard to Test:
 *   You can't replace PaymentService with a mock for testing.
 *
 * Problem 3 — Scattered Object Creation:
 *   Every class creates its own objects using `new`, spreading
 *   object lifecycle logic throughout the entire app.
 */
public class TightCouplingProblem {

    // ❌ BAD: PaymentService is hardcoded inside OrderService
    static class RazorpayPaymentService {
        public void pay() {
            System.out.println("[Tight Coupling] Paid via Razorpay");
        }
    }

    static class StripePaymentService {
        public void pay() {
            System.out.println("[Tight Coupling] Paid via Stripe");
        }
    }

    // ❌ OrderService is TIGHTLY COUPLED to RazorpayPaymentService
    // To switch to Stripe, you'd have to come in here and change the code
    static class OrderService {
        // `new` = tight coupling — OrderService DECIDES which payment provider to use
        private RazorpayPaymentService paymentService = new RazorpayPaymentService();

        public void placeOrder() {
            System.out.println("[Tight Coupling] Placing order...");
            paymentService.pay();
            // ❌ Want to use Stripe? You must edit this class!
        }
    }

    public static void demonstrate() {
        System.out.println("\n--- Problem: Tight Coupling ---");
        OrderService orderService = new OrderService();
        orderService.placeOrder();
        System.out.println("Problem: To use Stripe, we must edit OrderService itself!");
    }
}
