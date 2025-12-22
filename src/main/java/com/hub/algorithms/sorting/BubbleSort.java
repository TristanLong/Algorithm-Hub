package com.hub.algorithms.sorting;

public class BubbleSort {
    /* * Lý thuyết:
     * Bubble Sort là một thuật toán sắp xếp dựa trên so sánh đơn giản.
     * Nó lặp đi lặp lại các bước duyệt qua danh sách, so sánh các phần tử liền kề,
     * và hoán đổi chúng nếu chúng sai thứ tự. Quá trình này lặp lại cho đến khi danh sách được sắp xếp.
     * * Nó được gọi là Bubble Sort vì các phần tử nhỏ hơn "nổi" lên đầu danh sách,
     * và các phần tử lớn hơn chìm xuống đáy.
     */
    public static void bubbleSort(int[] arr) {
        int length = arr.length;
        boolean swapped;

        // Lặp lại quá trình này cho đến khi không còn phần tử nào để so sánh.
        for (int i = 0; i < length - 1; i++) {
            swapped = false;

            // Duyệt qua mảng từ phần tử đầu tiên đến phần tử cuối cùng chưa được sắp xếp.
            // Length - i - 1 vì sau mỗi lần lặp, phần tử lớn nhất sẽ được đặt đúng vị trí ở cuối mảng.
            for (int j = 0; j < length - i - 1; j++) {

                // So sánh nó với phần tử tiếp theo.
                if (arr[j] > arr[j + 1]) {

                    // Nếu phần tử hiện tại lớn hơn phần tử tiếp theo, hoán đổi chúng.
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Nếu không có phần tử nào được hoán đổi trong lần lặp này, mảng đã được sắp xếp.
            if (!swapped) break;
        }
    }
}