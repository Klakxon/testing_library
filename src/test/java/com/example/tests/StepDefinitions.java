package com.example.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    private int num1;
    private int num2;
    private int result;

    @Given("I have numbers {int} and {int}")
    public void i_have_numbers_and(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @When("I add them")
    public void i_add_them() {
        result = num1 + num2;
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expectedResult) {
        assertEquals(expectedResult, result);
    }
}

