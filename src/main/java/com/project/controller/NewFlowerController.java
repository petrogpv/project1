package com.project.controller;

import com.project.model.flowers.BerryFlower;
import com.project.model.flowers.Flower;
import com.project.model.flowers.FlowerColors;
import com.project.model.flowers.WildFlower;
import com.project.view.View;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ярослав on 08.05.2017.
 */
public class NewFlowerController {
    View view;

    public NewFlowerController() {
        this.view = new View();
    }

    public Flower processNewFlower(Scanner scanner) {
        Flower flower;

        flower = chooseFlowerType(scanner);

        view.printSelectBudDiameterMessage();
        flower.setBudDiameter(readDouble(scanner));

        view.printSelectStemLengthMessage();
        flower.setStemLength(readDouble(scanner));

        view.printSelectSpikedMessage();
        flower.setSpiked(readBoolean(scanner));

        flower.setColors(readColors(scanner));

        view.printSelectPriceMessage();
        flower.setPrice(readDouble(scanner));

        view.printSelectHoursAfterCutOffMessage();
        flower.setHoursAfterCutoff(readDouble(scanner));

        return flower;
    }

    private Flower chooseFlowerType(Scanner scanner) {
        final int BERRY_TYPE = 1;
        final int WILD_TYPE = 2;
        final int REGULAR_TYPE = 3;
        int selectedType;

        while(true) {
            view.printAddFlowerMessage();
            while(!scanner.hasNextInt()) {
                view.printIncorrectChoiceMessage();
                view.printAddFlowerMessage();
                scanner.next();
            }

            selectedType = scanner.nextInt();
            if(selectedType != BERRY_TYPE && selectedType != WILD_TYPE && selectedType != REGULAR_TYPE) {
                view.printIncorrectChoiceMessage();
                continue;
            }
            else {
                if(selectedType == BERRY_TYPE) {
                    return new BerryFlower();
                }
                if(selectedType == WILD_TYPE) {
                    return new WildFlower();
                }
                else {
                    return new Flower();
                }
            }
        }
    }

    private double readDouble(Scanner scanner) {
        double value;

        while (true) {
            while (!scanner.hasNextDouble()) {
                view.printIncorrectChoiceMessage();
                scanner.next();
            }
            value = scanner.nextDouble();
            if(value <= 0) {
                view.printIncorrectChoiceMessage();
                continue;
            }
            break;
        }

        return value;
    }

    private boolean readBoolean(Scanner scanner) {
        boolean value;

        while (true) {
            while (!scanner.hasNextBoolean()) {
                view.printIncorrectChoiceMessage();
                scanner.next();
            }

            value = scanner.nextBoolean();
            break;
        }

        return value;
    }

    private List<FlowerColors> readColors(Scanner scanner){
        List<FlowerColors> colors = new ArrayList<>();
        final int END_CODE = 8;

        int userSelection = 0;

        while(userSelection != END_CODE) {
            view.printColorSelectionMenu();

            while(!scanner.hasNextInt()) {
                view.printIncorrectChoiceMessage();
                view.printColorSelectionMenu();
                scanner.next();
            }

            userSelection = scanner.nextInt();

            if(userSelection <=0 || userSelection > END_CODE) {
                view.printIncorrectChoiceMessage();
            }
            else {
                if(userSelection != END_CODE) {
                    FlowerColors flowerColor = FlowerColors.values()[userSelection - 1];
                    if(!colors.contains(flowerColor)) {
                        colors.add(flowerColor);
                    }
                }
            }
        }

        return colors;
    }
}
