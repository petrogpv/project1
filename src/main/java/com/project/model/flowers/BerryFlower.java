package com.project.model.flowers;

import java.util.Date;
import java.util.List;

/**
 * Created by Ярослав on 07.05.2017.
 *
 * Class that represents berry flower
 *
 * @author Yaroslav Baranov
 **/
public class BerryFlower extends Flower {

    private int numberOfBerries;

    public BerryFlower() {}

    public BerryFlower(String name, double budDiameter, double stemLength, boolean isSpiked, List<FlowerColors> colors,
                       double price, double hoursAfterCutOf, int numberOfBerries) {
        super(name, budDiameter, stemLength, isSpiked, colors, price, hoursAfterCutOf);
        this.numberOfBerries = numberOfBerries;
    }

    public int getNumberOfBerries() {
        return numberOfBerries;
    }

    public void setNumberOfBerries(int numberOfBerries) {
        this.numberOfBerries = numberOfBerries;
    }
}
