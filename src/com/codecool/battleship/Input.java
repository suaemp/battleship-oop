package com.codecool.battleship;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.exit;

public class Input {
    private final Scanner scanner;
    private Board board;
    private ShipType shipType;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    // TODO: WYJEBAĆ SOUTY Z DOŁU I ZAMIENIC NA METODY XD
    public void checkUserInput() {
        switch (getScanner().nextInt()) {
            case 1 -> System.out.println("WIKA JEST SPOOKO");
            case 2 -> getShipPlacement(ShipType.CARRIER);
            case 3 -> System.out.println("WIKA JEST i");
            case 4 -> {
                System.out.println("Exit");
                exit(0);
            }
        }
    }

    public void getShipPlacement(ShipType shipType) {
        Display display = new Display();
        display.printMessage("You are placing a " + shipType + " ship. Ships of this type left to place: " + shipType.getQuantity());
        display.printMessage("Type coordinates (ex. C5) to place " + shipType.toString().toLowerCase(Locale.ROOT) + " ship: ");

        String coordinates = getScanner().next();

    }
}
