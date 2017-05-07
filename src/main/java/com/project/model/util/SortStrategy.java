package com.project.model.util;

import java.util.List;

/**
 * Created by Ярослав on 07.05.2017.
 */
public interface SortStrategy<T> {
    public void sort(List<T> list);
}
