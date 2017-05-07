package com.project.flowers;

import java.util.Date;
import java.util.List;

/**
 * Created by Ярослав on 07.05.2017.
 */
public abstract class Flower {

    private double budDiameter;

    private double stemLength;

    private boolean isSpiked;

    private List<FlowerColors> colors;

    private double price;

    private Date cutoffDay;

    public Flower() {}

    public Flower(double budDiameter, double stemLength, boolean isSpiked, List<FlowerColors> colors, double price, Date cutoffDay) {
        this.budDiameter = budDiameter;
        this.stemLength = stemLength;
        this.isSpiked = isSpiked;
        this.colors = colors;
        this.price = price;
        this.cutoffDay = cutoffDay;
    }

    public double getBudDiameter() {
        return budDiameter;
    }

    public void setBudDiameter(double budDiameter) {
        this.budDiameter = budDiameter;
    }

    public double getStemLength() {
        return stemLength;
    }

    public void setStemLength(double stemLength) {
        this.stemLength = stemLength;
    }

    public boolean isSpiked() {
        return isSpiked;
    }

    public void setSpiked(boolean isSpiked) {
        this.isSpiked = isSpiked;
    }

    public List<FlowerColors> getColors() {
        return colors;
    }

    public void setColors(List<FlowerColors> colors) {
        this.colors = colors;
    }
}
