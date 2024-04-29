package ru.javarush.novikov.cryptoanalizer.commands;

import ru.javarush.novikov.cryptoanalizer.entity.Result;

public interface Action {
    Result execute(String[] parameters);
}
