package com.codecool.battleship;

public enum SquareStatus {
    WATER("~"),
    SHIP("X"),
    HIT("H"),
    MISSED("M");

    private final String symbol;

    SquareStatus(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }
}
