package com.kodilla.selenium.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingDifferentPhrasesTestSuite {

    CheckingDifferentPhrases differentPhrases;

    @BeforeEach
    public void setUp() {
        differentPhrases = new CheckingDifferentPhrases();
    }

    @Test
    public void checkingWhatWillBeTheOutscoreIfYouWriteNotebookIn() {
        String phrase = "Notebook";
    }

    @Test
    public void checkingWhatWillBeTheOutscoreIfYouWriteSchoolIn() {
        String phrase2 = "School";
    }

    @Test
    public void checkingWhatWillBeTheOutscoreIfYouWriteBrandIn() {
        String phrase3 = "Brand";
    }

    @Test
    public void checkingWhatWillBeTheOutscoreIfYouWriteBusinessIn() {
        String phrase4 = "Business";
    }

    @Test
    public void checkingWhatWillBeTheOutscoreIfYouWriteGamingIn() {
        String phrase5 = "Gaming";
    }

    @Test
    public void checkingWhatWillBeTheOutscoreIfYouWritePowerfulIn() {
        String phrase6 = "Powerful";
    }

    @AfterEach
    public void testDown() {
        differentPhrases.close();
    }
}