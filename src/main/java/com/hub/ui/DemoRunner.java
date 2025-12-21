package com.hub.ui;

public abstract class DemoRunner implements IMenuItem {
    private final String label;

    public DemoRunner(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public void execute() {
        System.out.println("\n--- RUNNING: " + label + " ---");
        run();
        System.out.println("--- END ---");
        System.out.println("Enter to continue...");
        new java.util.Scanner(System.in).nextLine();
    }

    public abstract void run();
}