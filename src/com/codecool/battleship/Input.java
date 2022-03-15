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

// row - X axis, col - Y axis
    public List<Integer> getShipPlacement() {
        String coordinates = getScanner().next();
        int col = Character.getNumericValue(coordinates.charAt(0)) - 10;
        int row = Character.getNumericValue(coordinates.charAt(1)) - 1;


        return Arrays.asList(row, col);

    }
}
