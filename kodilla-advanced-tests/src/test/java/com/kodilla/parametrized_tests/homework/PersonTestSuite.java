package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DataForPersonTestClass#dataForTesting")
    public void shouldDisplayProperBmiResult(Person person, String expected) {
        assertEquals(expected, person.getBMI());
    }
}