package com.kodilla.selenium.homework;

public class CheckingDifferentPhrasesApplication {
    public static void main(String[] args) {
        CheckingDifferentPhrases differentPhrases = new CheckingDifferentPhrases();
        differentPhrases.sendPhrases("Notebook");
        differentPhrases.close();
    }
}
