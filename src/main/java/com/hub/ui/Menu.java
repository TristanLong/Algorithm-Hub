package com.hub.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu implements IMenuItem {
    private final String label;
    private final List<IMenuItem> items = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public Menu(String label) {
        this.label = label;
    }

    public void addItem(IMenuItem item) {
        items.add(item);
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public void execute() {
        while (true) {
            printMenu();
            int choice = getUserChoice();

            if (choice == 0) return;

            if (choice > 0 && choice <= items.size()) {
                items.get(choice - 1).execute();
            } else {
                System.out.println("Invalid!");
            }
        }
    }

    private void printMenu() {
        System.out.println("\n===== " + label.toUpperCase() + " =====");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getLabel());
        }
        System.out.println("0. Exit");
        System.out.print(">> Choose: ");
    }

    private int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
