package com.example.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    void additionTest() {
        int result = 5 + 3;
        assertEquals(8, result, "5 + 3 should equal 8");
    }
}

