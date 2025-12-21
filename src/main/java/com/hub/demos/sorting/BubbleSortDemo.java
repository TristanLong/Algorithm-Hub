package com.hub.demos.sorting;

import com.hub.algorithms.sorting.BubbleSort;
import com.hub.demos.base.BaseSortDemo;

public class BubbleSortDemo extends BaseSortDemo {
    public BubbleSortDemo() {
        super("Bubble Sort Demo");
    }

    @Override
    protected void executeSort(int[] arr) {
        BubbleSort.bubbleSort(arr);
    }
}
