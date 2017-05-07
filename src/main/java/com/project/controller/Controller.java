package com.project.controller;

import com.project.view.View;

import java.util.Scanner;

/**
 * Created by Ярослав on 07.05.2017.
 */
public class Controller {

    private View view;

    public Controller() {
        this.view = new View();
    }

    public void processUser(Scanner scanner) {
        int userSelection = Constants.DEFAULT_SELECTION_CODE;
        while (userSelection != Constants.EXIT_CODE) {
            view.printBaseMenu();

            while(!scanner.hasNextInt()) {
                view.printIncorrectChoice();
                view.printBaseMenu();
                scanner.next();
            }

            userSelection = scanner.nextInt();
            if(!checkInput(userSelection)) {
                view.printIncorrectChoice();
                continue;
            }

            switch (userSelection) {
                case Constants.BOUQUET_FROM_FILE: processBouquetFromFile(scanner);
                    break;
                case Constants.NEW_BOUQUET: processNewBouquet(scanner);
                    break;
            }
        }
    }

    private boolean checkInput(int input) {
        return input >= Constants.BOTTOM_SELECTION_VALUE && input <= Constants.TOP_SELECTION_VALUE;
    }

    private void processBouquetFromFile(Scanner scanner) {
        new BouquetFromFileController().processBouquetFromFile(scanner);
    }

    private void processNewBouquet(Scanner scanner) {
        new NewBouquetController().processNewBouquet(scanner);
    }
}
