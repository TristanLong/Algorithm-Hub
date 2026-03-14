package com.hub.demos.sorting;

import com.hub.algorithms.sorting.MergeSort;
import com.hub.demos.base.BaseSortDemo;

public class MergeSortDemo extends BaseSortDemo {
    public MergeSortDemo() {
        super("Merge Sort Demo");
    }

    @Override
    protected void executeSort(int[] arr) {
        MergeSort.mergeSort(arr, 0, arr.length - 1);
    }
}

