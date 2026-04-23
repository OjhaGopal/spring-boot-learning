package com.introduction.gopal.FIrstModule.beans;

/**
 * ============================================================
 * TOPIC: Bean Scopes — Singleton
 * ============================================================
 *
 * SINGLETON (default): Spring creates ONE instance and reuses it everywhere.
 * Use for: Services, Repositories — anything stateless.
 *
 * If two classes both @Autowired SingletonCounter,
 * they get the EXACT SAME object.
 */

import org.springframework.stereotype.Component;

@Component
// @Scope("singleton") ← default, no need to write explicitly
public class SingletonCounter {

    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void describe() {
        System.out.println("[SCOPE] SingletonCounter — same instance always. Count = " + count);
    }
}
