package com.kodilla.parametrized_tests.homework2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine;
    private Set<Integer> numbers;
    @BeforeEach
    public void setUp() {
        gamblingMachine = new GamblingMachine();
        numbers = new HashSet<>();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/allNumbersForGamblingMachine.csv")
    public void shouldEqualsMyNumbersWithComputerNumbers(String input) throws InvalidNumbersException {
        String[] strings = input.split(" ");

        for(String string : strings) {
            numbers.add(Integer.valueOf(string));
        }
        //assertDoesNotThrow(()-> gamblingMachine.howManyWins(numbers));
        assertTrue(gamblingMachine.howManyWins(numbers) > 0);
    }
}