package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {

    static UserValidator userValidator;

    @BeforeAll
    public static void setUp() {
        userValidator = new UserValidator();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Dawid.Kowalski@gmail.com", "Damian.Nowak@op.pl"})
    public void shouldReturnTrueIfEmailIsProperlyWritten(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Arkadiusz Milik", "Grzegorz Krychowiak"})
    public void shouldReturnTrueIfNamesAreProperlyWritten(String name) {
        boolean result = userValidator.validateUsername(name);
        assertTrue(result); // jak zmieniam na assertFalse(result) to na dole pokazuje się Expected: false, Actual: true, na odwrót
    }
}