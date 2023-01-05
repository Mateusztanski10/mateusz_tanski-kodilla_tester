package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class TestingDataForPersonClassTestSuite {

    private Person person = new Person;

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.TestingDataForPersonClass#dataForPersonClass")
    public void shouldDisplayBMIResults(int expected) {
        assertEquals(expected, person.getBMI());
    }
}