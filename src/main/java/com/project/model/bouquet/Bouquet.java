package com.project.model.bouquet;

import com.project.model.flowers.Flower;

import java.util.List;

/**
 * Created by Ярослав on 07.05.2017.
 */
public interface Bouquet {

    public void sort();

    public double getPrice();

    public List<Flower> getFlowersFromStemDiapason(double bottomLimit, double topLimit);

}