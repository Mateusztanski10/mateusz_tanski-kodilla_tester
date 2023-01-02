package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.ParameterizedTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {

    static UserValidator userValidator;

    @BeforeAll
    public static void setUp() {
        userValidator = new UserValidator();
    }

    @Test
    @ParameterizedTest
    @ValueSource(strings = {"Dawid.Kowalski@gmail.com", "Damian.Nowak@op.pl"})
    public void shouldReturnTrueIfEmailIsProperlyWritten(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @Test
    @ParameterizedTest
    @ValueSource(strings = {"Arkadiusz Milik", "Grzegorz Krychowiak"})
    public void shouldReturnTrueIfNamesAreProperlyWritten(String name) {
        boolean result = userValidator.validateUsername(name);
        assertTrue(result);
    }
}