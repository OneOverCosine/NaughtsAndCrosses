package org.example;

public class Game {
    public void mainMenu() {
        String choice = "";
        while (!"2".equals(choice)) {
            choice = InputManager.getInput(System.in, "=== Naughts and Crosses ===%n1. Play%n2. Exit%n");

            switch (choice) {
                case "1":
                    System.out.println("Play the game...");
                    break;
                case "2":
                    System.out.println("Closing game");
                    break;
                default:
                    System.out.println(choice);
            }
        }
    }
}
