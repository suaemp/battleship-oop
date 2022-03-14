package com.codecool.battleship;

import java.util.List;

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

    public void menuInteraction(){
//        display.displayMenu();
        board.createWater();
        board.createBoard();
        checkUserInput();
//        board.createWater();
//        board.createBoard();
        display.displayBoard(board);
    }

    public void checkUserInput() {
        switch (input.getScanner().nextInt()) {
            case 1 -> System.out.println("WIKA JEST SPOOKO");
            case 2 -> getShipPlacement();
            case 3 -> System.out.println("WIKA JEST i");
            case 4 -> {
                System.out.println("Exit");
                exit(0);
            }
        }
    }

    public void getShipPlacement(){
        List<Integer> coordinates = input.getShipPlacement(ShipType.CARRIER);
        Square square = board.getWater()[coordinates.get(0)][coordinates.get(1)];
        Ship ship1 = new Ship(square);
        display.displayBoard(board);
        player1.addShip(ship1);

    }
}
