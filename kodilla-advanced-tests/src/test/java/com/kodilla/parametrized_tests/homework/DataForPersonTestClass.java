package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DataForPersonTestClass {

    private static Stream<Arguments> dataForTesting() {
        return Stream.of(
                Arguments.of(new Person(1.80, 80.1), "Normal (healthy weight)"),
                Arguments.of(new Person(1.92, 94.3), "Overweight"),
                Arguments.of(new Person(1.59, 60.4), "Normal (healthy weight)"),
                Arguments.of(new Person(1.99, 53.6), "Very severely underweight"),
                Arguments.of(new Person(2.05, 150.5), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.44, 44.2), "Normal (healthy weight)"),
                Arguments.of(new Person(2.15, 60.4), "Very severely underweight"),
                Arguments.of(new Person(1.75, 75.6), "Normal (healthy weight)"),
                Arguments.of(new Person(1.60, 90.4), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.89, 120.5), "Obese Class I (Moderately obese)")
        );
    }
}
