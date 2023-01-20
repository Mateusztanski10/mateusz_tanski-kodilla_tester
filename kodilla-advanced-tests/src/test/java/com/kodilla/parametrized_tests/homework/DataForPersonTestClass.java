package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DataForPersonTestClass {

    private static Stream<Arguments> dataForTesting() {
        return Stream.of(
                Arguments.of(new Person(1.80, 80.1)),
                Arguments.of(new Person(1.92, 94.3)),
                Arguments.of(new Person(1.59, 60.4)),
                Arguments.of(new Person(1.99, 53.6)),
                Arguments.of(new Person(2.05, 150.5)),
                Arguments.of(new Person(1.44, 44.2)),
                Arguments.of(new Person(2.15, 60.4)),
                Arguments.of(new Person(1.75, 75.6)),
                Arguments.of(new Person(1.60, 90.4)),
                Arguments.of(new Person(1.89, 120.5))
        );
    }
}
