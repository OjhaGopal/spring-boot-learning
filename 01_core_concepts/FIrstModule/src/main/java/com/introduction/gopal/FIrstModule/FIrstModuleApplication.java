package com.introduction.gopal.FIrstModule;

/**
 * ============================================================
 * Spring Boot Learning — 01: Core Concepts
 * ============================================================
 *
 * Based on 2 PDFs:
 *
 * [PDF 1] introduction_to_spring_framework.pdf
 *   → The Problem: Tight Coupling, Hard to Test, Scattered Object Creation
 *   → The Solution: Spring IoC + Dependency Injection
 *   → Spring Framework vs Spring Boot comparison
 *   → Recommended learning path
 *
 * [PDF 2] beans_in_spring_framework.pdf
 *   → What is a Spring Bean?
 *   → How to create Beans (@Component, @Service, @Repository, @Bean)
 *   → Bean Lifecycle (@PostConstruct, @PreDestroy)
 *   → Bean Scopes (singleton, prototype, request, session, application)
 *
 * Package structure:
 *   introduction/  ← PDF 1 concepts
 *   beans/         ← PDF 2 concepts
 * ============================================================
 */

import com.introduction.gopal.FIrstModule.beans.BeanBasicsDemo;
import com.introduction.gopal.FIrstModule.beans.BeanLifecycleDemo;
import com.introduction.gopal.FIrstModule.beans.BeanScopesDemo;
import com.introduction.gopal.FIrstModule.introduction.LooseCouplingWithDI;
import com.introduction.gopal.FIrstModule.introduction.SpringVsSpringBoot;
import com.introduction.gopal.FIrstModule.introduction.TightCouplingProblem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FIrstModuleApplication implements CommandLineRunner {

    // --- PDF 1: Introduction demos ---
    @Autowired private SpringVsSpringBoot springVsSpringBoot;
    @Autowired private LooseCouplingWithDI looseCouplingWithDI;

    // --- PDF 2: Beans demos ---
    @Autowired private BeanBasicsDemo beanBasicsDemo;
    @Autowired private BeanLifecycleDemo beanLifecycleDemo;
    @Autowired private BeanScopesDemo beanScopesDemo;

    // --- Your original first bean ---
    @Autowired private PaymentServeice paymentServeice;

    public static void main(String[] args) {
        SpringApplication.run(FIrstModuleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("\n╔══════════════════════════════════════════════════╗");
        System.out.println("║   Spring Core Concepts — Learning Demo            ║");
        System.out.println("╚══════════════════════════════════════════════════╝");

        // ── PDF 1: Introduction to Spring Framework ──────────────────────
        System.out.println("\n📘 PDF 1: Introduction to Spring Framework");

        System.out.println("\n[1/5] The Problem — Tight Coupling (before Spring):");
        TightCouplingProblem.demonstrate();  // static demo, no Spring needed

        System.out.println("\n[2/5] The Solution — Loose Coupling with Spring DI:");
        looseCouplingWithDI.placeOrder();

        System.out.println("\n[3/5] Spring Framework vs Spring Boot:");
        springVsSpringBoot.compare();
        springVsSpringBoot.printLearningPath();

        // ── PDF 2: Beans in Spring Framework ─────────────────────────────
        System.out.println("\n📗 PDF 2: Beans in Spring Framework");

        System.out.println("\n[4/5] What is a Spring Bean?");
        beanBasicsDemo.describe();

        System.out.println("\n[4/5] Your very first bean — PaymentServeice:");
        paymentServeice.pay();

        System.out.println("\n[4/5] Bean Lifecycle (@PostConstruct already ran at startup):");
        beanLifecycleDemo.doWork();
        System.out.println("       @PreDestroy will run on app shutdown.");

        System.out.println("\n[5/5] Bean Scopes:");
        beanScopesDemo.demonstrateScopes();

        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║   All demos complete! Scroll up to read output.  ║");
        System.out.println("╚══════════════════════════════════════════════════╝\n");
    }
}
