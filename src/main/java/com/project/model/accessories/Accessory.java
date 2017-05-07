package com.project.model.accessories;

/**
 * Created by Ярослав on 07.05.2017.
 */
public class Accessory {

    private AccessoryType type;

    private double price;

    public Accessory() {}

    public Accessory(AccessoryType type, double price) {
        this.type = type;
        this.price = price;
    }

    public AccessoryType getType() {
        return type;
    }

    public void setType(AccessoryType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{type: " + type + ", price: " + price + "}";
    }
}
