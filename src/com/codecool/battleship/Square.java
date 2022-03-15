package com.codecool.battleship;


public class Square {
    private final int row, col;
    private SquareStatus squareStatus;

    public Square(int i, int j, SquareStatus squareStatus) {
        this.row = i;
        this.col = j;
        this.squareStatus = squareStatus;
    }


    @Override
    public String toString() {
        return squareStatus.getSymbol() + "  ";
    }

    public void setStatus(SquareStatus ship) {
        this.squareStatus = ship;
    }
}
