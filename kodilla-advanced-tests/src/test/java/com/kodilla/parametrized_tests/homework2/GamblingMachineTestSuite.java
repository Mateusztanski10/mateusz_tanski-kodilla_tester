package com.kodilla.parametrized_tests.homework2;

import com.kodilla.parametrized_tests.ParameterizedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @Test
    @ParameterizedTest
    @CsvFileSource(resources = "/allNumbersForGamblingMachine.csv")
    public void shouldEqualsMyNumbersWithComputerNumbers(int input, int expected) {
        assertEquals(expected, gamblingMachine.howManyWins(input);
    }

}