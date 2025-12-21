package com.hub;

import com.hub.demos.sorting.BubbleSortDemo;
import com.hub.ui.Menu;

public class Main {
    public static void main(String[] args) {
        // 1. Tạo Menu con: Sorting
        Menu sortMenu = new Menu("Sorting Algorithms");
        sortMenu.addItem(new BubbleSortDemo());
        // sortMenu.addItem(new QuickSortDemo());

        // 2. Tạo Menu con: Tree
        Menu treeMenu = new Menu("Tree Algorithms");
        //treeMenu.addItem(new BSTDemo());

        // 3. Tạo Menu Gốc (Main Menu)
        Menu mainMenu = new Menu("ALGORITHM HUB");
        mainMenu.addItem(sortMenu);
        mainMenu.addItem(treeMenu);
        // mainMenu.addItem(new MiniDBConsoleApp());

        // 4. Chạy
        mainMenu.execute();
    }
}