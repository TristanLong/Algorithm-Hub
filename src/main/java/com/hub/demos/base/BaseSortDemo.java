package com.hub.demos.base;

import com.hub.ui.DemoRunner;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Lớp cha dùng chung cho tất cả thuật toán Sắp xếp.
 * Chịu trách nhiệm: Nhập liệu, Đo thời gian, In kết quả.
 */
public abstract class BaseSortDemo extends DemoRunner {
    protected Scanner scanner = new Scanner(System.in);

    public BaseSortDemo(String label) {
        super(label);
    }

    // --- TEMPLATE METHOD: Quy trình chạy chuẩn ---
    @Override
    public void run() {
        // Bước 1: Chuẩn bị dữ liệu (Chọn nhập tay hoặc Random)
        int[] data = prepareInputData();

        // In mảng ban đầu (Clone ra để giữ nguyên bản gốc nếu cần so sánh)
        printArray(data, "Input");

        // Bước 2: Đo thời gian chạy
        System.out.println(">> Running ...");
        long startTime = System.nanoTime();

        executeSort(data);

        long endTime = System.nanoTime();

        // In kết quả và thời gian
        printArray(data, "Result");

        double durationMs = (endTime - startTime) / 1_000_000.0;
        System.out.println("------------------------------------------------");
        System.out.println("⏱  Time: " + durationMs + " ms");
        System.out.println("------------------------------------------------");
    }

    // --- CÁC HÀM HỖ TRỢ (PRIVATE) ---

    // Menu chọn nguồn dữ liệu
    private int[] prepareInputData() {
        System.out.println("\n--- SELECT DATA SOURCE ---");
        System.out.println("1. Manual Input");
        System.out.println("2. Random Generation");
        System.out.print(">> Choose: ");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            return inputManualData();
        } else {
            return generateRandomData();
        }
    }

    // Logic 1: Nhập tay
    private int[] inputManualData() {
        try {
            System.out.print("Enter the number of elements (maximum 2 billion): ");
            int n = Integer.parseInt(scanner.nextLine());

            int[] data = new int[n];
            System.out.print("Enter the numbers (separated by spaces): ");

            // Đọc cả dòng rồi tách chuỗi để tránh lỗi trôi lệnh
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

    // Logic 2: Sinh ngẫu nhiên
    private int[] generateRandomData() {
        int n;
        int max;
        try {
            System.out.print("Enter the number of elements (maximum 2 billion): ");
            n = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the maximum value: ");
            max = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            n = 10;
            max = 100;
            System.out.println(">> (Incorrect input, default settings n=10, max=100)");
        }

        int[] data = new int[n];
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < n; i++) {
            data[i] = rand.nextInt(max + 1);
        }

        return data;
    }

    private void printArray(int[] arr, String label) {
        if (arr.length <= 1000) {
            System.out.println(label + ": " + Arrays.toString(arr));
        } else {
            System.out.println(label + ": [Array too large(" + arr.length + " elements) - Hide details]");
        }
    }

    protected abstract void executeSort(int[] arr);
}
