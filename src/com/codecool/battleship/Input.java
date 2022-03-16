package com.codecool.battleship;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.System.exit;

public class Input {
    private final Scanner scanner;
    private Board board;
    private ShipType shipType;
    private Display display;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    // row - X axis, col - Y axis
    public List<Integer> getShipPlacement() {
        String coordinates = getScanner().next();

        if (checkUserInput(coordinates)) {
            int col = Character.getNumericValue(coordinates.charAt(0)) - 10;
            int rowFirstDigit = Character.getNumericValue(coordinates.charAt(1));
            switch (coordinates.length()) {
                case 2:
                    return Arrays.asList(rowFirstDigit - 1, col);
                case 3:
                    int rowSecondDigit = Character.getNumericValue(coordinates.charAt(2));
                    String addedDigits = String.valueOf(rowFirstDigit) + String.valueOf(rowSecondDigit);
                    int row = Integer.parseInt(addedDigits);
                    System.out.println(row);
                    return Arrays.asList(row - 1, col);
            }

        }
        System.out.println("Something wrong, try again...");

        return getShipPlacement();

    }


    public boolean checkUserInput(String coordinates) {
        char isCharValid = coordinates.charAt(0);
        char isFirstDigitValid = coordinates.charAt(1);

        switch (coordinates.length()) {
            case 2:
                if (Character.toString(isCharValid).matches("^[a-uA-U]*$")) {
                    if (Character.toString(isFirstDigitValid).matches("^[1-9]*$")) {
                        return true;
                    }
                    return false;
                }
                return false;
            case 3:
                char isSecondDigitValid = coordinates.charAt(2);
                String twoDigits = String.valueOf(isFirstDigitValid) + String.valueOf(isSecondDigitValid);
                int row = Integer.parseInt(twoDigits);
                if (Character.toString(isCharValid).matches("^[a-uA-U]*$")) {
                    if (row > 0 && row <= 10) {
                        return true;
                    }
                    return false;
                }
                return false;
            default:
                System.out.println("Something wrong, try again...");
                return false;
        }
    }
}


