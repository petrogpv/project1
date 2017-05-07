package com.project.model.flowers;

import java.util.Date;
import java.util.List;

/**
 * Created by Ярослав on 07.05.2017.
 */
public class RedRose extends Flower {

    public RedRose(){}

    public RedRose(double budDiameter, double stemLength, boolean isSpiked, List<FlowerColors> colors, double price, Date cutoffDay) {
        super(budDiameter, stemLength, isSpiked, colors, price, cutoffDay);
    }
}
