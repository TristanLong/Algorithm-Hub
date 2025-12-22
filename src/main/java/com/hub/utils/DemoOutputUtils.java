package com.hub.utils;

import java.util.Arrays;

public class DemoOutputUtils {

    // Hàm in mảng (Tự động ẩn nếu mảng quá dài)
    public static void printArray(int[] arr, String label) {
        if (arr == null)
            return;

        // Ngưỡng hiển thị
        int limit = 1000;

        if (arr.length <= limit) {
            System.out.println(label + ": " + Arrays.toString(arr));
        } else {
            System.out.println(label + ": [Hidden - Array too large (" + arr.length + " elements)]");
        }
    }

    // Hàm in thời gian chạy
    public static void printExecutionTime(long startTime, long endTime) {
        double durationMs = (endTime - startTime) / 1_000_000.0;
        System.out.println("------------------------------------------------");
        System.out.printf("Time: %.4f ms%n", durationMs);
        System.out.println("------------------------------------------------");
    }

    // Hàm in kết quả tìm kiếm
    public static void printSearchResult(int index) {
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}