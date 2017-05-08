package com.project.controller;

import com.project.model.accessories.Accessory;
import com.project.model.accessories.AccessoryType;
import com.project.model.flowers.Flower;
import com.project.view.View;

import java.util.Scanner;

/**
 * Created by Ярослав on 08.05.2017.
 */
public class NewFlowerController {

    private final int DEFAULT_ACCESSORY_TYPE = 0;
    private final int WRAPPING_PAPER = 1;
    private final int RIBBONS = 2;

    View view;

    public NewFlowerController() {
        this.view = new View();
    }

    public Flower processNewFlower(Scanner scanner) {
        Flower flower = null;

        chooseFlowerType(scanner, flower);

        return accessory;
    }


}
