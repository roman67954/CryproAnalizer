package ru.javarush.novikov.cryptoanalizer.constants;

public class Constans {
    private static final String rus = "ЙЦУКЕНГШЩЗХЪЭЖДЛОРПАВЫФЯЧСМИТЬБЮ";
    private static final String eng = "QWERTYUIOPLKJHGFDSAZXCVBNM";
    private static final String cypher = "0123456789";
    private static final String z = "!@#$%^&*()[]{}";
    public static final String ALPHABET = rus + eng + rus.toLowerCase() + eng.toLowerCase() + cypher + z;
}
