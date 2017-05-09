package com.project.model.util;

import java.util.List;

/**
 * Created by Ярослав on 07.05.2017.
 *
 * An interface of SearchStrategy
 *
 * @author Yaroslav Baranov
 **/
public interface SortStrategy<T> {

    /**
     * Method that sort considering certain option
     *
     * @param list list to be sorted
     **/
    public void sort(List<T> list);
}
