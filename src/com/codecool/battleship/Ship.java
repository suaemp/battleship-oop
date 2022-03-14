package com.codecool.battleship;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Square> squareList;

    public Ship(Square square) {
        List<Square> field = new ArrayList<>();
        field.add(square);
        this.squareList = field;
        square.setStatus(SquareStatus.SHIP);

    }

}
