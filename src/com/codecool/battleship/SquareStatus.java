package com.codecool.battleship;

public enum SquareStatus {
    WATER("\uD83C\uDF0A"),
    SHIP("\uD83D\uDEA2"),
    HIT("\u2620\uFE0F"),
    MISSED("\uD83D\uDCA9");

    private final String symbol;

    SquareStatus(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }
}
