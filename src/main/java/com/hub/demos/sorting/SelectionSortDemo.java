package com.hub.demos.sorting;

import com.hub.algorithms.sorting.SelectionSort;
import com.hub.demos.base.BaseSortDemo;

public class SelectionSortDemo extends BaseSortDemo {
    public SelectionSortDemo() {
        super("Selection Sort Demo");
    }

    @Override
    protected void executeSort(int[] arr) {
        SelectionSort.selectionSort(arr);
    }
}
