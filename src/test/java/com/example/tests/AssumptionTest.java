package com.example.tests;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssumptionTest {

    @Test
    void testOnlyOnCiServer() {
        // Виконати тест тільки якщо системна властивість `ci-server` дорівнює `true`
        Assumptions.assumeTrue("true".equals(System.getProperty("ci-server")));
        // Деякі твердження для перевірки
        assertEquals(2, 1 + 1);
    }

    @Test
    void testOnlyOnDeveloperMachine() {
        // Виконати тест тільки якщо системна властивість `ci-server` дорівнює `false`
        Assumptions.assumeFalse("true".equals(System.getProperty("ci-server")));
        // Деякі твердження для перевірки
        assertEquals(3, 2 + 1);
    }

    @Test
    void testInAllEnvironments() {
        // Виконати тест в будь-якому середовищі
        Assumptions.assumingThat("true".equals(System.getProperty("ci-server")),
                () -> {
                    // Виконується тільки якщо умова істинна
                    assertEquals(2, 1 + 1);
                });
        // Виконується завжди
        assertEquals(3, 2 + 1);
    }
}
