package ru.javarush.novikov.cryptoanalizer;

import ru.javarush.novikov.cryptoanalizer.entity.Result;

public class ConsoleRunner {
    public static void main(String[] args) {
        Application application = new Application();
        Result result = application.run(args);
        System.out.println(result);
    }
}

// int key = 123; // <<< args
// String text = "привет компот!"; // <<< args
// String result = "..........";  // <<< args
// 53 минут ролика.