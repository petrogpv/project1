package com.project.model.flowers;

import java.util.Date;
import java.util.List;

/**
 * Created by Ярослав on 07.05.2017.
 */
public class BerryFlower extends Flower {

    private int numberOfBerries;

    public BerryFlower() {}

    public BerryFlower(double budDiameter, double stemLength, boolean isSpiked, List<FlowerColors> colors,
                       double price, Date cutoffDay, int numberOfBerries) {
        super(budDiameter, stemLength, isSpiked, colors, price, cutoffDay);
        this.numberOfBerries = numberOfBerries;
    }

    public int getNumberOfBerries() {
        return numberOfBerries;
    }

    public void setNumberOfBerries(int numberOfBerries) {
        this.numberOfBerries = numberOfBerries;
    }
}
