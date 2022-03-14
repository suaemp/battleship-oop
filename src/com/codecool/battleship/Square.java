package com.codecool.battleship;


public class Square {
    private final int row, col;
    private final SquareStatus squareStatus;

    public Square(int i, int j, SquareStatus squareStatus) {
        this.row = i;
        this.col = j;
        this.squareStatus = squareStatus;
    }


    @Override
    public String toString() {
        if (squareStatus == SquareStatus.WATER) {
            return squareStatus.getSymbol() + " ";
        } else {
            return "x";
        }
    }
}
