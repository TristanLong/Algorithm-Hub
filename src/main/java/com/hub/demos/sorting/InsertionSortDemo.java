package com.hub.demos.sorting;

import com.hub.algorithms.sorting.InsertionSort;
import com.hub.demos.base.BaseSortDemo;

public class InsertionSortDemo extends BaseSortDemo {
    public InsertionSortDemo() {
        super("Insertion Sort Demo");
    }

    @Override
    protected void executeSort(int[] arr) {
        InsertionSort.insertionSort(arr);
    }
}
