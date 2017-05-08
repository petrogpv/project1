package com.project.model.flowers;

import java.util.ArrayList;
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

    private double hoursAfterCutoff;

    public Flower() {
        colors = new ArrayList<>();
    }

    public Flower(double budDiameter, double stemLength, boolean isSpiked, List<FlowerColors> colors,
                  double price, double hoursAfterCutoff) {
        this.budDiameter = budDiameter;
        this.stemLength = stemLength;
        this.isSpiked = isSpiked;
        this.colors = colors;
        this.price = price;
        this.hoursAfterCutoff = hoursAfterCutoff;
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

    public double getHoursAfterCutoff() {
        return hoursAfterCutoff;
    }

    public void setHoursAfterCutoff(double hoursAfterCutoff) {
        this.hoursAfterCutoff = hoursAfterCutoff;
    }

    @Override
    public String toString() {
        return "{bud diameter: " + budDiameter +
               ", stem length: " + stemLength +
               ", isSpiked: " + isSpiked +
               ", colors: " + colors.stream().map(FlowerColors::toString).collect(Collectors.joining(", ")) +
               ", price: " + price +
               ", hours after cutoff: " + hoursAfterCutoff +
               "}";
    }
}
