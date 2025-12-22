package com.hub.demos.base;

import java.util.Arrays;
import java.util.Scanner;

import com.hub.ui.DemoRunner;
import com.hub.utils.DataInputUtils;
import com.hub.utils.DemoOutputUtils;

public abstract class BaseSearchDemo extends DemoRunner {
    protected Scanner scanner = new Scanner(System.in);

    public BaseSearchDemo(String label) {
        super(label);
    }

    @Override
    public void run() {
        // 1. Chuẩn bị dữ liệu
        int[] data = DataInputUtils.prepareInputData(scanner);
                
        // Binary Search yêu cầu mảng đã được sắp xếp.
        Arrays.sort(data);
        DemoOutputUtils.printArray(data, "\nInput");

        // 2. Nhập Target
        int target = getTargetInput();

        // 3. Chạy thuật toán
        System.out.println(">> Searching for " + target + " ...");
        long startTime = System.nanoTime();

        int index = executeSearch(data, target);

        long endTime = System.nanoTime();

        // 4. In kết quả & Thời gian
        DemoOutputUtils.printSearchResult(index);
        DemoOutputUtils.printExecutionTime(startTime, endTime);
    }

    // Logic nhập target giữ lại ở đây vì nó đặc thù của Search
    private int getTargetInput() {
        System.out.print("\nEnter target number: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            return 0;
        }
    }

    protected abstract int executeSearch(int[] data, int target);
}