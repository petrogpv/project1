package com.project.controller;

import com.project.model.ModelConstants;
import com.project.model.accessories.Accessory;
import com.project.model.accessories.AccessoryType;
import com.project.model.bouquet.Bouquet;
import com.project.model.bouquet.FlowerBouquet;
import com.project.model.flowers.Flower;
import com.project.model.flowers.FlowerColors;
import com.project.view.View;

import java.io.*;
import java.net.URL;
import java.net.URLDecoder;
import java.util.*;

/**
 * Created by Ярослав on 07.05.2017.
 */
public class BouquetFromFileController extends Controller{

    private final int BOTTOM_SELECTION_VALUE = 1;
    private final int TOP_SELECTION_VALUE = 5;
    private final int SHOW_BOUQUET = 1;
    private final int SHOW_PRICE = 2;
    private final int SORT = 3;
    private final int SEARCH = 4;
    private final int RETURN_CODE = 5;

    private View view;

    public BouquetFromFileController() {
        this.view = new View();
    }

    public void processBouquetFromFile(Scanner scanner) {
        Bouquet bouquet = initializeBouquet();
        int userSelection = Constants.DEFAULT_SELECTION_CODE;
        while (userSelection != RETURN_CODE) {
            view.printBouquetFromFileMenu();

            while(!scanner.hasNextInt()) {
                view.printIncorrectChoiceMessage();
                view.printBouquetFromFileMenu();
                scanner.next();
            }

            userSelection = scanner.nextInt();
            if(!checkInput(userSelection)) {
                view.printIncorrectChoiceMessage();
                continue;
            }

            switch (userSelection) {
                case SHOW_BOUQUET: view.showBouquet(bouquet);
                    break;
                case SHOW_PRICE: view.printMessage(bouquet.getPrice());
                    break;
                case SORT: bouquet.sort();
                    break;
                case SEARCH: view.printAll(processSearch(scanner, bouquet));
            }
        }
    }

    private boolean checkInput(int input) {
        return input >= BOTTOM_SELECTION_VALUE && input <= TOP_SELECTION_VALUE;
    }

    private FlowerBouquet initializeBouquet() {
        List<String[]> entries = getEntriesFromFile(Constants.BOUQUET_FILE_PATH);
        FlowerBouquet.Builder builder = FlowerBouquet.newBuilder();

        for(String[] entry: entries) {
            if(entry[0].equals(ModelConstants.FLOWER)) {
                builder.addFlower(constructFlower(entry));
            }
            else {
                builder.addAccessory(constructAccessory(entry));
            }
        }

        System.out.println(entries.size());

        return builder.build();
    }

    private Flower constructFlower(String[] entry) {
        Flower flower = new Flower();

        flower.setName(entry[1]);
        flower.setBudDiameter(Double.parseDouble(entry[2]));
        flower.setStemLength(Double.parseDouble(entry[3]));
        flower.setSpiked(Boolean.parseBoolean(entry[4]));
        flower.setColors(Arrays.asList(FlowerColors.valueOf(entry[5])));
        flower.setPrice(Double.parseDouble(entry[6]));
        flower.setHoursAfterCutoff(Double.parseDouble((entry[7])));

        return flower;
    }

    private Accessory constructAccessory(String[] entry) {
        Accessory accessory = new Accessory();

        accessory.setType(AccessoryType.valueOf(entry[1]));
        accessory.setPrice(Double.parseDouble(entry[2]));

        return accessory;
    }

    private List<String[]> getEntriesFromFile(String path) {
        List<String[]> entries = new ArrayList<>();

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL url = classLoader.getResource(Constants.BOUQUET_FILE_PATH);

        if(url != null) {
            String filePath = url.getFile();
            try {
                filePath = URLDecoder.decode(filePath, Constants.DECODING_ALGORITHM);
            } catch (UnsupportedEncodingException e) {
                view.printMessage(view.getErrorMessage() + e);
            }

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    entries.add(line.split(Constants.SPLIT_MARK));
                }
            } catch (IOException e) {
                view.printMessage(view.getErrorMessage() + e);
            }
        }

        return entries;
    }
}

