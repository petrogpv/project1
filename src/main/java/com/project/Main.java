package com.project;

import com.project.accessories.Accessory;
import com.project.accessories.AccessoryType;
import com.project.flowers.Flower;
import com.project.flowers.RedRose;
import com.project.bouquet.FlowerBouquet;

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
