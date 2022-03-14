package com.codecool.battleship;

public class Battleship {
    private final Display display;
    private final Input input;
    private final Board board;

    public Battleship() {
        this.display = new Display();
        this.input = new Input();
        this.board = new Board();
    }

    public void menuInteraction(){
//        display.displayMenu();
        input.checkUserInput();
        board.createWater();
        board.createBoard();
        display.displayBoard(board);
    }
}
