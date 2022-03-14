package com.codecool.battleship;

import java.util.Arrays;

public class Board {

    private Square[][] water;
    private int waterSize;
    private SquareStatus squareStatus;



    public boolean isPlacementOk() {
        return true;
    }

    public void setWaterSize(int waterSize) {
        this.waterSize = waterSize;
    }

    public int getWaterSize() {
        return waterSize;
    }

    public void createWater() {
        this.water = new Square[10][10];
    }

    public Square[][] getWater() {
        return water;
    }


    public void createBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                water[i][j] = new Square(i, j, SquareStatus.WATER);
            }
        }
    }

    @Override
    public String toString() {
        return "Board{" +
                "water=" + Arrays.toString(water) +

                '}';
    }


}
