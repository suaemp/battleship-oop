package com.codecool.battleship;

public enum ShipType {
    // This will call enum constructor with one int argument
    CARRIER(1, 4),
    CRUISER(2, 3),
    BATTLESHIP(3, 2),
    SUBMARINE(4, 1),
    DESTROYER(5, 1);
//    ShipType.CARRIER.getAction();

    // declaring private variable for getting values
    private final int length;
    private final int quantity;

    // getter method
    public int getAction()
    {
        return this.length;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    // enum constructor - cannot be public or protected
    ShipType(int length, int quantity)
    {
        this.length = length;
        this.quantity = quantity;
    }
}
