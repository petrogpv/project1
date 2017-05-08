package com.project.view;

import com.project.model.bouquet.Bouquet;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Ярослав on 07.05.2017.
 */
public class View {

    public <T> void printMessage(T message) {
        System.out.println(message);
    }

    public <T> void printAll(List<T> list) {
        list.forEach(System.out::println);
    }

    public void printBaseMenu() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
        String menu = "\n" + resourceBundle.getString("menu.bouquet.file") + "\n" +
                resourceBundle.getString("menu.bouquet.new") + "\n" +
                resourceBundle.getString("menu.exit");
        System.out.println(menu);
    }

    public void printBouquetFromFileMenu() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
        String menu = "\n" + resourceBundle.getString("menu.file.show") + "\n" +
                resourceBundle.getString("menu.file.price") + "\n" +
                resourceBundle.getString("menu.file.sort") + "\n" +
                resourceBundle.getString("menu.file.search") + "\n" +
                resourceBundle.getString("menu.file.return");
        System.out.println(menu);
    }

    public void printNewBouquetMessage() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
        String menu = "\n" + resourceBundle.getString("menu.new.bouquet") + "\n" +
                resourceBundle.getString("menu.new.show") + "\n" +
                resourceBundle.getString("menu.new.add.flower") + "\n" +
                resourceBundle.getString("menu.new.add.accessory") + "\n" +
                resourceBundle.getString("menu.new.price") + "\n" +
                resourceBundle.getString("menu.new.sort") + "\n" +
                resourceBundle.getString("menu.new.search") + "\n" +
                resourceBundle.getString("menu.new.return") + "\n";
        System.out.println(menu);
    }

    public void printIncorrectChoiceMessage() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
        System.out.println(resourceBundle.getString("menu.incorrect"));
    }

    public void printBottomLimit() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
        System.out.println(resourceBundle.getString("search.bottom"));
    }

    public void printTopLimit() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
        System.out.println(resourceBundle.getString("search.top"));
    }

    public String getErrorMessage() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
        return resourceBundle.getString("error") + " ";
    }

    public void showBouquet(Bouquet bouquet) {
        bouquet.getFlowers().forEach(System.out::println);
        bouquet.getAccessories().forEach(System.out::println);
    }

    public void printAddFlowerMessage() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
        System.out.println(resourceBundle.getString("add.flower.message"));
    }

    public void printAddAccessoryMessage() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
        String message = resourceBundle.getString("new.accessory.type") + "\n" +
                resourceBundle.getString("new.accessory.type.paper") + "\n" +
                resourceBundle.getString("new.accessory.type.ribbons");

        System.out.println(message);
    }

    public  void printSelectPriceMessage() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
        System.out.println(resourceBundle.getString("new.accessory.price"));
    }
}