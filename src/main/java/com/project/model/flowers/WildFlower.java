package com.project.model.flowers;

import java.util.Date;
import java.util.List;

/**
 * Created by Ярослав on 07.05.2017.
 */
public class WildFlower extends Flower {
    private boolean havingBuld;

    public WildFlower() {
    }

    public WildFlower(double budDiameter, double stemLength, boolean isSpiked, List<FlowerColors> colors,
                      double price, Date cutoffDay, boolean havingBuld) {
        super(budDiameter, stemLength, isSpiked, colors, price, cutoffDay);
        this.havingBuld = havingBuld;
    }

    public boolean isHavingBuld() {
        return havingBuld;
    }

    public void setHavingBuld(boolean havingBuld) {
        this.havingBuld = havingBuld;
    }
}
