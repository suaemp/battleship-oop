package com.codecool.battleship;

public class Display {
    private final Input input;
    private Board board;

    public Display() {
        this.board = new Board();
        this.input = new Input();
    }

    public void displayMenu() {
        for (int i = 1; i <= 3; i++) {
            String option = "";
            if (i == 1)
                option = ". Start Game";
            if (i == 2)
                option = ". Credits";
            if (i == 3)
                option = ". Exit";
            printMessage((i) + option);
        }
    }



    public void displayBoard(Board board) {
        System.out.println("              BOARD");
        System.out.println();
        printBoardSigns();
        for (int i = 0; i < 10; i++) {
            if (i >= 9) {
                System.out.print((i + 1) + " | ");
            } else {
                System.out.print((i + 1) + "  | ");
            }

            for (int j = 0; j < 10; j++) {

                System.out.print(board.getWater()[i][j]);
            }
            System.out.println();

        }
    }

    public void displayCredits() {
        printMessage("Made by Wika & Wika");

    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    //    TODO: change to sztywny board
    private void printBoardSigns() {
        System.out.print("     ");
        char[] abc = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        for (int j = 0; j < 10; j++) {
            System.out.print(abc[j] + "  ");

        }
        System.out.println();
    }

    public void clearConsole() {
        try {
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system

            if (operatingSystem.contains("Windows")) {
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
