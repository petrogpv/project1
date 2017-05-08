package com.project.model.flowers;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ярослав on 07.05.2017.
 */
public class Flower {

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCutoffDay() {
        return cutoffDay;
    }

    public void setCutoffDay(Date cutoffDay) {
        this.cutoffDay = cutoffDay;
    }

    @Override
    public String toString() {
        return "{bud diameter: " + budDiameter +
               ", stem length: " + stemLength +
               ", isSpiked: " + isSpiked +
               ", colors: " + colors.stream().map(FlowerColors::toString).collect(Collectors.joining(", ")) +
               ", price: " + price +
               ", cutoff date: " + cutoffDay +
               "}";
    }
}
