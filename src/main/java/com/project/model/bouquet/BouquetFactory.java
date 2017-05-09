package com.project.model.bouquet;

/**
 * Created by Ярослав on 09.05.2017.
 *
 * Bouquet factory
 *
 * @author Yaroslav Baranov
 **/
public class BouquetFactory {

    public static Bouquet getFlowerBouquet() {
        return new FlowerBouquet();
    }

}
