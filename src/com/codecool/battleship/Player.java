package com.codecool.battleship;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Ship> shipList;

    public Player(String name) {
        this.name = name;
        this.shipList = new ArrayList<>();
    }

    public void addShip(Ship ship) {
        shipList.add(ship);
    }

    public boolean isAlive() {
        return true;
    }

    public int getShipList() {
        return shipList.size();
    }
}
