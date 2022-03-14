package com.codecool.battleship;

import java.util.Arrays;
import java.util.List;
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


    public List<Integer> getShipPlacement(ShipType shipType) {
        Display display = new Display();
        display.printMessage("You are placing a " + shipType + " ship. Ships of this type left to place: " + shipType.getQuantity());
        display.printMessage("Type coordinates (ex. C5) to place " + shipType.toString().toLowerCase(Locale.ROOT) + " ship: ");

        String coordinates = getScanner().next();
        return Arrays.asList(1,1);

    }
}
