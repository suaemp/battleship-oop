package com.codecool.battleship;

public class Main {

    public static void main(String[] args) {

        Battleship battleship = new Battleship();

        battleship.menuInteraction();


/*
        how to get to enum types values:

        SquareStatus[] shipSymbols = SquareStatus.values();
        for (ShipType shipLength : shipsLengths) {
            // use getter method to get the value
            System.out.println("name: " + shipLength.name() +
                    "; length: " + shipLength.getAction() +
                    "; quantity: " + shipLength.getQuantity());
        }

        for (SquareStatus shipLength : shipSymbols) {
            // use getter method to get the value
            System.out.println("name: " + shipLength.name() +
                    "; symbol: " + shipLength.getSymbol());}
*/
    }
}
