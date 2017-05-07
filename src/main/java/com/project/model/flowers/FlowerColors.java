package com.project.model.flowers;

/**
 * Created by Ярослав on 07.05.2017.
 */
public enum FlowerColors {
    RED("red"), ORANGE("orange"), BLUE("blue"), WHITE("green"),
    GREEN("green"), YELLOW("yellow"), PINK("pink");

    private String color;

    FlowerColors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
