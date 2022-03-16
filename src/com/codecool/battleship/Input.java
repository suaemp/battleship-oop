package com.codecool.battleship;

import java.util.*;

import static java.lang.System.exit;

public class Input {
    private final Scanner scanner;
    private Board board;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    // row - X axis, col - Y axis
    public List<Integer> getShipPlacement(ShipType shipType, Display display) {
        String coordinates = getScanner().next();
        int col = Character.getNumericValue(coordinates.charAt(0)) - 10;
        int row = Character.getNumericValue(coordinates.charAt(1)) - 1;

        if (shipType.getAction() > 1) {
            display.printMessage("Choose direction: \n1. Up\n2. Right\n3. Down\n4. Left\n");
            int direction = getScanner().nextInt();

            switch (direction) {
                case 1:
                    return getShipUpCords(col, row, shipType.getAction());
                case 2:
                    return getShipRightCords(col, row, shipType.getAction());
                case 3:
                    return getShipDownCords(col, row, shipType.getAction());
                case 4:
                    return getShipLeftCords(col, row, shipType.getAction());
            }
        }

        return Arrays.asList(row, col);

    }

    private List<Integer> getShipUpCords(int col, int row, int length) {
        List<Integer> coordinates = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            coordinates.add(row - i);
            coordinates.add(col);
        }
        return coordinates;

    }

    private List<Integer> getShipRightCords(int col, int row, int length) {
        List<Integer> coordinates = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            coordinates.add(row);
            coordinates.add(col + i);
        }
        return coordinates;

    }

    private List<Integer> getShipDownCords(int col, int row, int length) {
        List<Integer> coordinates = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            coordinates.add(row + i);
            coordinates.add(col);
        }
        return coordinates;

    }

    private List<Integer> getShipLeftCords(int col, int row, int length) {
        List<Integer> coordinates = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            coordinates.add(row);
            coordinates.add(col - i);
        }
        return coordinates;

    }
}
