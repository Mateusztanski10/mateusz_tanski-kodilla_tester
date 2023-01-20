package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    static private Person person;

    @BeforeAll
    static public void setUp() {
        person = new Person(1.90, 80.8);
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework#DataForPersonTestClass.dataForTesting")
    public void shouldDisplayProperBmiResult(double input, String expected) {
        assertEquals(expected, person.getBMI(input));
    }
}