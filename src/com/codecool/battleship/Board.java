package com.codecool.battleship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public List<Square> getSquares(List<Integer> coordinates) {
        List<Square> squares = new ArrayList<>();
        for (int i = 0; i < coordinates.size(); i+=2) {
        squares.add(water[coordinates.get(i)][coordinates.get(i+1)]);
        }
        return squares;

    }

    @Override
    public String toString() {
        return "Board{" +
                "water=" + Arrays.toString(water) +

                '}';
    }


}
