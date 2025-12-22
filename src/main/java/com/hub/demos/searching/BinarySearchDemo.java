package com.hub.demos.searching;

import com.hub.algorithms.searching.BinarySearch;
import com.hub.demos.base.BaseSearchDemo;

public class BinarySearchDemo extends BaseSearchDemo {
    public BinarySearchDemo() {
        super("Binary Search Demo");
    }

    @Override
    protected int executeSearch(int[] arr, int target) {
        return BinarySearch.binarySearch(arr, target);
    }
}