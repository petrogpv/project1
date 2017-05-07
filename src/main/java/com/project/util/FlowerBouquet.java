package com.project.util;

import com.project.accessories.Accessory;
import com.project.flowers.Flower;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ярослав on 07.05.2017.
 */
public class FlowerBouquet implements Bouquet {

    private List<Flower> flowers;

    private List<Accessory> accessories;

    private SortStrategy sortStrategy;

    public FlowerBouquet() {
        flowers = new ArrayList<Flower>();
        accessories = new ArrayList<Accessory>();
    }

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

    public static Builder newBuilder() {
        return new FlowerBouquet().new Builder();
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Accessory> accessories) {
        this.accessories = accessories;
    }

    public class Builder {

        private Builder(){}

        public Builder addFlower(Flower flower) {
            FlowerBouquet.this.flowers.add(flower);
            return this;
        }

        public Builder addAccessory(Accessory accessory) {
            FlowerBouquet.this.accessories.add(accessory);
            return this;
        }

        public FlowerBouquet build() {
            return FlowerBouquet.this;
        }
    }
}
