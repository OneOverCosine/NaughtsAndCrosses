package org.example;

import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputManager {

    public static String getInput(InputStream input, String message) {
        // might have inputInfo rather than message. Could contain message, errorMessage, and Pattern (as a String)...

        System.out.printf(message);
        Scanner in = new Scanner(input);
        String userInput = in.nextLine();
        if (isValid(userInput)) return userInput;
        return "Invalid input";
    }

    private static boolean isValid(String userInput) {
        Pattern pattern = Pattern.compile("(?<![0-9]|[a-z])[0-3]|[xXoO](?![0-9]|[a-z])"); // will update later
        Matcher matcher = pattern.matcher(userInput);
        return matcher.find();
    }
}
