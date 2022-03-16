package com.codecool.battleship;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

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

        if (shipType.getAction() > 1){
            display.printMessage("Choose direction: \n1. Up\n2. Right\n3. Down\n4. Left\n");
            int direction = getScanner().nextInt();

            switch (direction){
                case 1:
                    return getShipCords();
                case 2:

                case 3:

                case 4:

            }
        }

        return Arrays.asList(row, col);

    }
}
