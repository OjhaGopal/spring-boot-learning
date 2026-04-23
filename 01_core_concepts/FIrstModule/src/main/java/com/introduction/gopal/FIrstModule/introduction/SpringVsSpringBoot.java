package com.introduction.gopal.FIrstModule.introduction;

/**
 * ============================================================
 * TOPIC: Spring Framework vs Spring Boot
 * ============================================================
 *
 * PDF Page 10: "Let's go into Technicals"
 *
 * | Feature                  | Spring Framework       | Spring Boot                  |
 * |--------------------------|------------------------|------------------------------|
 * | Primary feature          | Dependency Injection   | Auto-configuration           |
 * | Server setup             | Manual (you configure) | Embedded (Tomcat built-in)   |
 * | Boilerplate code         | Lots                   | Minimal (starter packages)   |
 * | In-memory DB             | Not provided           | H2 supported out of the box  |
 * | Getting started          | Many dependencies      | One starter dependency       |
 *
 * ============================================================
 * TOPIC: Recommended Learning Path (PDF Page 11)
 * ============================================================
 *
 * Minimum Spring Knowledge BEFORE moving to Spring Boot:
 *  ✅ IoC and Dependency Injection: @Component, @Autowired, constructor injection
 *  ✅ Bean Management: @Configuration, @Bean
 *  ✅ Spring Context: What is ApplicationContext?
 *  ✅ Spring MVC Basics: @Controller, @RestController, @RequestMapping
 *
 * Then Spring Boot Topics:
 *  → Spring Boot Auto-Configuration
 *  → Starter Dependencies
 *  → Properties and YAML config
 *  → Spring Boot DevTools and Actuator
 */

import org.springframework.stereotype.Component;

@Component
public class SpringVsSpringBoot {

    public void compare() {
        System.out.println("\n========== Spring Framework vs Spring Boot ==========");
        System.out.println();
        System.out.printf("%-30s %-30s %-30s%n", "Feature", "Spring Framework", "Spring Boot");
        System.out.println("-".repeat(90));
        System.out.printf("%-30s %-30s %-30s%n", "Primary Feature",     "Dependency Injection",     "Auto-configuration");
        System.out.printf("%-30s %-30s %-30s%n", "Server Setup",        "Manual configuration",     "Embedded (Tomcat/Jetty)");
        System.out.printf("%-30s %-30s %-30s%n", "Boilerplate Code",    "Lots",                     "Minimal (starters)");
        System.out.printf("%-30s %-30s %-30s%n", "In-Memory Database",  "Not provided",             "H2 built-in support");
        System.out.printf("%-30s %-30s %-30s%n", "Dependency Setup",    "Many manual deps",         "One starter dependency");
        System.out.println("=".repeat(90));
    }

    public void printLearningPath() {
        System.out.println("\n========== Recommended Learning Path ==========");
        System.out.println("✅ FIRST — Core Spring (what this module covers):");
        System.out.println("   1. IoC and DI: @Component, @Autowired, constructor injection ← YOU ARE HERE");
        System.out.println("   2. Bean Management: @Configuration, @Bean");
        System.out.println("   3. ApplicationContext (IoC Container)");
        System.out.println("   4. Spring MVC: @RestController, @RequestMapping");
        System.out.println();
        System.out.println("→ THEN — Spring Boot:");
        System.out.println("   5. Auto-Configuration");
        System.out.println("   6. Starter Dependencies");
        System.out.println("   7. application.properties / YAML");
        System.out.println("   8. DevTools & Actuator");
        System.out.println("===============================================\n");
    }
}
