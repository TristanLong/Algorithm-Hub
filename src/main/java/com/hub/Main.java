package com.hub;

import com.hub.demos.dynamic_programming.FibonacciSequenceDemo;
import com.hub.demos.searching.BinarySearchDemo;
import com.hub.demos.sorting.BubbleSortDemo;
import com.hub.demos.sorting.InsertionSortDemo;
import com.hub.demos.sorting.MergeSortDemo;
import com.hub.demos.sorting.SelectionSortDemo;
import com.hub.ui.Menu;

public class Main {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("ALGORITHM HUB");
        mainMenu.addItem(createSortMenu());
        mainMenu.addItem(createSearchMenu());
        mainMenu.addItem(createDpMenu());

        mainMenu.execute();
    }

    private static Menu createSortMenu() {
        Menu sortMenu = new Menu("Sorting Algorithms");
        sortMenu.addItem(new BubbleSortDemo());
        sortMenu.addItem(new MergeSortDemo());
        sortMenu.addItem(new SelectionSortDemo());
        sortMenu.addItem(new InsertionSortDemo());
        return sortMenu;
    }

    private static Menu createSearchMenu() {
        Menu searchMenu = new Menu("Searching Algorithms");
        searchMenu.addItem(new BinarySearchDemo());
        return searchMenu;
    }

    private static Menu createDpMenu() {
        Menu dpMenu = new Menu("Dynamic Programming Algorithms");
        dpMenu.addItem(new FibonacciSequenceDemo());
        return dpMenu;
    }
}