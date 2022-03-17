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

        List<Integer> coordinatesNew = checkInputLength(coordinates);

        if (checkUserInput(coordinates)) {
            if (shipType.getAction() > 1) {
                display.printMessage("Choose direction: \n1. Up\n2. Right\n3. Down\n4. Left\n");
                int direction = getScanner().nextInt();

                switch (direction) {
                    case 1:
                        return getShipUpCords(coordinatesNew.get(1), coordinatesNew.get(0), shipType.getAction());
                    case 2:
                        return getShipRightCords(coordinatesNew.get(1), coordinatesNew.get(0), shipType.getAction());
                    case 3:
                        return getShipDownCords(coordinatesNew.get(1), coordinatesNew.get(0), shipType.getAction());
                    case 4:
                        return getShipLeftCords(coordinatesNew.get(1), coordinatesNew.get(0), shipType.getAction());
                }
            } else {
                return Arrays.asList(coordinatesNew.get(0), coordinatesNew.get(1));
            }
        }
        System.out.println("Something wrong, try again...");
        return getShipPlacement(shipType, display);
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

    private List<Integer> checkInputLength(String coordinates) {
        if (coordinates.length() == 2) {
            int col = Character.getNumericValue(coordinates.charAt(0)) - 10;
            int row = Character.getNumericValue(coordinates.charAt(1)) - 1;
            return Arrays.asList(row, col);
        } else if (coordinates.length() == 3) {
            int col = Character.getNumericValue(coordinates.charAt(0)) - 10;
            int isFirstDigit = Character.getNumericValue(coordinates.charAt(1));
            char isSecondDigit = coordinates.charAt(2);
            String twoDigits = String.valueOf(isFirstDigit) + String.valueOf(isSecondDigit);
            int row = Integer.parseInt(twoDigits) - 1;
            return Arrays.asList(row, col);
        }


        return Arrays.asList();
    }

    private boolean checkUserInput(String coordinates) {
        boolean letterMatch = Character.toString(coordinates.charAt(0)).matches("^[a-kA-K]*$");
        switch (coordinates.length()) {

            case 2:
                if (letterMatch) {
                    if (Character.toString(coordinates.charAt(1)).matches("^[1-9]*$")) {
                        return true;
                    }
                    return false;
                }
                return false;
                
            case 3:
                String twoDigits = String.valueOf(coordinates.charAt(1)) + String.valueOf(coordinates.charAt(2));
                int row = Integer.parseInt(twoDigits);
                if (letterMatch) {
                    if (row > 0 && row <= 10) {
                        return true;
                    }
                    return false;
                }
                return false;
            default:
                return false;
        }
    }
}
