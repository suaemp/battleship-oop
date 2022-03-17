package com.codecool.battleship;

import static java.lang.System.exit;

public class Util {
    private final Display display;



    public Util(Display display) {
        this.display = display;
//        this.battleship =new Battleship();
    }

//    public void credits(Battleship battleship) {
//        display.displayCredits();
//        pressAnyKeyToContinue();
//       battleship.menuInteraction();
//    }

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
