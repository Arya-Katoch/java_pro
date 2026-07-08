package com.banking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * BankingSystemApplicationTests
 * ─────────────────────────────
 * Basic smoke test to verify the Spring application context loads successfully.
 *
 * @SpringBootTest — Loads the FULL Spring application context for integration testing.
 *   It boots up the entire application (minus the web server) and verifies
 *   all beans are configured correctly, all dependencies are resolved, etc.
 *
 * If this test passes, it means:
 * ✅ All Spring configurations are valid
 * ✅ All beans can be created
 * ✅ Database connection works
 * ✅ No circular dependencies exist
 */
@SpringBootTest
class BankingSystemApplicationTests {

    @Test
    void contextLoads() {
        // If the context loads without exceptions, this test passes.
        // It's a simple but powerful "smoke test".
    }
}
