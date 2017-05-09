package com.project;

import com.project.controller.Controller;
import com.project.model.accessories.Accessory;
import com.project.model.accessories.AccessoryType;
import com.project.model.flowers.Flower;
import com.project.model.bouquet.FlowerBouquet;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.processUser(new Scanner(System.in));
    }
}
