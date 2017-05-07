package com.project;

import com.project.model.accessories.Accessory;
import com.project.model.accessories.AccessoryType;
import com.project.model.flowers.Flower;
import com.project.model.flowers.RedRose;
import com.project.model.bouquet.FlowerBouquet;

public class Main {

    public static void main(String[] args) {
        FlowerBouquet.Builder builder = FlowerBouquet.newBuilder();

        Flower f1 = new RedRose();
        Flower f2 = new RedRose();
        Accessory a1 = new Accessory() {
            @Override
            public AccessoryType getType() {
                return super.getType();
            }
        };

        builder.addFlower(f1)
               .addFlower(f2)
               .addAccessory(a1);

        FlowerBouquet flowerBouquet = builder.build();
        System.out.println(flowerBouquet.getFlowers().size());
    }
}
