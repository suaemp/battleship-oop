package com.codecool.battleship;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Square> squareList;

    public Ship(List<Square> squares) {
        this.squareList = squares;
        for (Square square : squares) {
            square.setStatus(SquareStatus.SHIP);
        }

    }

}
