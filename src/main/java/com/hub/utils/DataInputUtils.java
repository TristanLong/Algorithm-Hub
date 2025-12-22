package com.hub.utils;

import java.util.Random;
import java.util.Scanner;

public class DataInputUtils {

    // Hàm tổng hợp: Hỏi người dùng chọn nguồn dữ liệu nào
    public static int[] prepareInputData(Scanner scanner) {
        System.out.println("\n--- SELECT DATA SOURCE ---");
        System.out.println("1. Manual Input");
        System.out.println("2. Random Generation");
        System.out.print(">> Choose: ");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            return inputManualData(scanner);
        } else {
            return generateRandomData(scanner);
        }
    }

    // Logic nhập tay
    private static int[] inputManualData(Scanner scanner) {
        try {
            System.out.print("Enter number of elements (maximum 2 billion): ");
            int n = Integer.parseInt(scanner.nextLine());
            int[] data = new int[n];

            System.out.print("Enter numbers (separated by spaces): ");
            String[] tokens = scanner.nextLine().trim().split("\\s+");

            for (int i = 0; i < Math.min(n, tokens.length); i++) {
                data[i] = Integer.parseInt(tokens[i]);
            }
            return data;
        } catch (Exception e) {
            System.out.println("Input error! Use default array.");
            return new int[]{5, 2, 9, 1, 5, 6};
        }
    }

    // Logic random
    private static int[] generateRandomData(Scanner scanner) {
        int n;
        int max;
        try {
            System.out.print("Enter number of elements (maximum 2 billion): ");
            n = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter max value: ");
            max = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            n = 10;
            max = 100;
            System.out.println(">> (Incorrect input, default settings n=10, max=100)");
        }

        int[] data = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            data[i] = rand.nextInt(max + 1);
        }
        return data;
    }
}