package com.project.model.flowers;

import java.util.Date;
import java.util.List;

/**
 * Created by Ярослав on 07.05.2017.
 *
 * Class that represents wild flower
 *
 * @author Yaroslav Baranov
 **/
public class WildFlower extends Flower {
    private boolean havingBuld;

    public WildFlower() {
    }

    public WildFlower(String name, double budDiameter, double stemLength, boolean isSpiked, List<FlowerColors> colors,
                      double price, double hoursAfterCutOff, boolean havingBuld) {
        super(name, budDiameter, stemLength, isSpiked, colors, price, hoursAfterCutOff);
        this.havingBuld = havingBuld;
    }

    public boolean isHavingBuld() {
        return havingBuld;
    }

    public void setHavingBuld(boolean havingBuld) {
        this.havingBuld = havingBuld;
    }
}
