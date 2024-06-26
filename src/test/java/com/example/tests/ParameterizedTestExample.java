package com.example.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTestExample {

    @ParameterizedTest
    @CsvSource({
            "1, 1, 2",
            "2, 3, 5",
            "5, 8, 13"
    })
    void additionTest(int a, int b, int expected) {
        assertEquals(expected, a + b, () -> a + " + " + b + " should equal " + expected);
    }
}
