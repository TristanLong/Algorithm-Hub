package com.hub;

import com.hub.demos.dynamic_programming.FibonacciSequenceDemo;
import com.hub.demos.searching.BinarySearchDemo;
import com.hub.demos.sorting.BubbleSortDemo;
import com.hub.demos.sorting.MergeSortDemo;
import com.hub.demos.sorting.SelectionSortDemo;
import com.hub.ui.Menu;

public class Main {
    public static void main(String[] args) {
        // 1. Tạo Menu con: Sorting
        Menu sortMenu = new Menu("Sorting Algorithms");
        sortMenu.addItem(new BubbleSortDemo());
        sortMenu.addItem(new MergeSortDemo());
        sortMenu.addItem(new SelectionSortDemo());

        // 2. Tạo Menu con: Searching
        Menu searchMenu = new Menu("Searching Algorithms");
        searchMenu.addItem(new BinarySearchDemo());

        // 3. Tạo Menu con: Dynamic Programming
        Menu dpMenu = new Menu("Dynamic Programming Algorithms");
        dpMenu.addItem(new FibonacciSequenceDemo());

        // 4. Tạo Menu Gốc (Main Menu)
        Menu mainMenu = new Menu("ALGORITHM HUB");
        mainMenu.addItem(sortMenu);
        mainMenu.addItem(searchMenu);
        mainMenu.addItem(dpMenu);

        // 5. Chạy Menu Gốc
        mainMenu.execute();
    }
}