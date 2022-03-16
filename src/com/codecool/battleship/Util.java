package com.codecool.battleship;

import static java.lang.System.exit;

public class Util {
    private final Display display;
    public Battleship battleship;

    public Util(Display display) {
        this.display = display;
    }

    public void credits() {
        display.displayCredits();
        pressAnyKeyToContinue();
        display.displayMenu();
    }

    public void pressAnyKeyToContinue() {
        display.printMessage("Press Enter key to continue...");
        try {
            System.in.read();
        } catch (Exception IO) {
        }
    }

    public void exitGame() {
        display.printMessage("Exit");
        exit(0);
    }
}
