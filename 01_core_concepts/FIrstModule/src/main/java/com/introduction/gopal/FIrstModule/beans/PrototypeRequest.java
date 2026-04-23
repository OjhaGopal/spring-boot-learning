package com.introduction.gopal.FIrstModule.beans;

/**
 * ============================================================
 * TOPIC: Bean Scopes — Prototype
 * ============================================================
 *
 * PROTOTYPE: Spring creates a BRAND NEW instance every time it is requested.
 * Use for: Stateful objects, user-specific data, request data.
 *
 * Important: With @Autowired, Spring injects prototype beans only ONCE
 * at startup. To get a truly new instance each time, use ApplicationContext.getBean().
 */

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // same as @Scope("prototype")
public class PrototypeRequest {

    private final long createdAt;

    public PrototypeRequest() {
        this.createdAt = System.currentTimeMillis();
    }

    public void describe() {
        System.out.println("[SCOPE] PrototypeRequest — NEW instance created at: " + createdAt);
    }
}
