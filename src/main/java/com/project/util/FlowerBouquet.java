package com.project.util;

import com.project.accessories.Accessory;
import com.project.flowers.Flower;

import java.util.List;

/**
 * Created by Ярослав on 07.05.2017.
 */
public class FlowerBouquet implements Bouquet {

    private List<Flower> flowers;

    private List<Accessory> accessories;

    private SortStrategy sortStrategy;

    @Override
    public void sort() {

    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public List<Flower> getFlowersFromStemDiapason(double bottomLimit, double topLimit) {
        return null;
    }
}
