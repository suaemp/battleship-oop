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

    public List<Integer> getShipPlacement() {
        String coordinates = getScanner().next();
        return Arrays.asList(1,1);

    }
}
