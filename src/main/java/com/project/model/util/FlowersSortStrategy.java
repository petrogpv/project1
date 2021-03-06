package com.project.model.util;

import com.project.model.flowers.Flower;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Ярослав on 07.05.2017.
 *
 * Realization of SortStrategy for sort flowers in bouquet by cutoff time
 *
 * @author Yaroslav Baranov
 **/
public class FlowersSortStrategy implements SortStrategy<Flower>{
    @Override
    public void sort(List<Flower> list) {
        list.sort(new Comparator<Flower>() {
            @Override
            public int compare(Flower firstFlower, Flower secondFlower) {
                return (int) (firstFlower.getHoursAfterCutoff() - secondFlower.getHoursAfterCutoff());
            }
        });
    }
}
