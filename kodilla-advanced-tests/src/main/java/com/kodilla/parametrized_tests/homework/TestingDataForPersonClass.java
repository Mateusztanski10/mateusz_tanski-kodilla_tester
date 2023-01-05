package com.kodilla.parametrized_tests.homework;

import com.sun.jdi.connect.Connector;

import java.util.stream.Stream;

public class TestingDataForPersonClass {
    static Stream<Arguments> dataForPersonClass() {
        return Stream.of(
                Arguments.of(4),
                Arguments.of(15),
                Arguments.of(17),
                Arguments.of(22),
                Arguments.of(27),
                Arguments.of(33),
                Arguments.of(37),
                Arguments.of(42),
                Arguments.of(47),
                Arguments.of(55)
        );
    }
}
