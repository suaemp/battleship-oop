package com.codecool.battleship;

public class Display {
    private final Input input;
    private Board board;

    public Display() {
        this.board = new Board();
        this.input = new Input();
    }

    public void displayMenu() {
        System.out.println("1. Start Game");
        System.out.println("2. Options");
        System.out.println("3. Credits");
        System.out.println("4. Exit");


    }

    public void displayBoard(Board board) {
        System.out.println("              BOARD");
        System.out.println();
        printBoardSigns();
        for (int i = 0; i <10; i++) {
            if (i >= 9) {
                System.out.print((i+1) + " | ");
            } else {
                System.out.print((i+1) + "  | ");
            }

            for (int j = 0; j < 10; j++) {

                System.out.print(board.getWater()[i][j]);
            }
            System.out.println();

        }
    }
    public void printMessage(String message){
        System.out.println(message);
    }

//    TODO: change to sztywny board
    private void printBoardSigns() {
        System.out.print("     ");
        char[] abc = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int j = 0; j < 9; j++){
            System.out.print(abc[j]+"  ");

        }System.out.println();}

}
