package com.codecool.battleship;

import java.util.List;
import java.util.Locale;

import static java.lang.System.exit;

public class Battleship {
    private final Display display;
    private final Input input;
    private final Board board;
    private Player player1;
    private Player player2;


    public Battleship() {
        this.display = new Display();
        this.input = new Input();
        this.board = new Board();
        this.player1 = new Player("Piotr");
        this.player2 = new Player("Wika");

    }

    public void menuInteraction() {
        display.displayMenu();
        board.createWater();
        board.createBoard();
        checkUserInput();
//        board.createWater();
//        board.createBoard();
        display.displayBoard(board);
    }

    public void checkUserInput() {
        switch (input.getScanner().nextInt()) {
            case 1 -> setShipsOnWater();
            case 2 -> credits();
            case 3 -> exitGame();
        }
    }

    private void credits() {
        display.displayCredits();
        pressAnyKeyToContinue();
        menuInteraction();
    }

    private void pressAnyKeyToContinue() {
        display.printMessage("Press Enter key to continue...");
        try {
            System.in.read();
        } catch (Exception IO) {
        }
    }

    private void exitGame() {
        display.printMessage("Exit");
        exit(0);
    }

    public void setShipsOnWater() {
        for (ShipType shipType : ShipType.values()) {
            for (int counter = 0; counter < shipType.getQuantity(); counter++) {
                display.printMessage("You are placing a " + shipType + " ship. Ships of this type left to place: "
                        + (shipType.getQuantity() - counter));
                display.printMessage("Type coordinates (ex. C5) to place "
                        + shipType.toString().toLowerCase(Locale.ROOT) + " ship: ");
                List<Integer> coordinates = input.getShipPlacement(shipType, display);

                Square square = board.getWater()[coordinates.get(0)][coordinates.get(1)];
                Ship ship = new Ship(square);
                display.displayBoard(board);
                player1.addShip(ship);
            }
        }
    }
}
