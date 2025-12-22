package com.hub.demos.base;

import com.hub.ui.DemoRunner;
import com.hub.utils.DataInputUtils;
import com.hub.utils.DemoOutputUtils;

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
// 1. Chuẩn bị dữ liệu
        int[] data = DataInputUtils.prepareInputData(scanner);
        DemoOutputUtils.printArray(data, "Input");

        // 2. Chạy thuật toán
        System.out.println(">> Sorting...");
        long startTime = System.nanoTime();

        executeSort(data); // <-- Logic chính

        long endTime = System.nanoTime();

        // 3. In kết quả & Thời gian
        DemoOutputUtils.printArray(data, "Result");
        DemoOutputUtils.printExecutionTime(startTime, endTime);
    }

    protected abstract void executeSort(int[] arr);
}
