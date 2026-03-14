package com.hub.algorithms.sorting;

public class SelectionSort {
    /*
        Lý thuyết: Selection Sort (Sắp xếp chọn)
        Sắp xếp chọn là một thuật toán sắp xếp dựa trên so sánh đơn giản.
        Nó lặp đi lặp lại việc chọn phần tử nhỏ nhất từ phần chưa được sắp xếp của mảng và hoán đổi nó với phần tử chưa được sắp xếp đầu tiên.
        Quá trình này tiếp tục cho đến khi toàn bộ mảng được sắp xếp.

        Thuật toán (Algorithm):
        Bắt đầu với phần tử đầu tiên và tìm kiếm trong mảng để tìm phần tử nhỏ nhất.
        Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên.
        Di chuyển đến vị trí tiếp theo và lặp lại quá trình cho đến khi mảng được sắp xếp.

        Time Complexity:
        - Best-case: O(n^2) - Khi mảng đã được sắp xếp, thuật toán vẫn phải thực hiện n-1 lần tìm kiếm phần tử nhỏ nhất.
        - Average-case: O(n^2) - Khi mảng có phần tử ngẫu nhiên, thuật toán phải thực hiện n-1 lần tìm kiếm phần tử nhỏ nhất cho mỗi phần tử.
        - Worst-case: O(n^2) - Khi mảng được sắp xếp theo thứ tự ngược lại, thuật toán vẫn phải thực hiện n-1 lần tìm kiếm phần tử nhỏ nhất cho mỗi phần tử.
     */

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Bước 3: Di chuyển đến vị trí tiếp theo và lặp lại quá trình cho đến khi mảng được sắp xếp.
        for (int i = 0; i < n - 1; i++) {

            // Bước 1: Bắt đầu với phần tử đầu tiên (trong phần chưa sắp xếp)
            int minIndex = i;

            // Tìm kiếm phần tử nhỏ nhất trong phần chưa được sắp xếp
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Bước 2: Hoán đổi phần tử nhỏ nhất tìm được với phần tử đầu tiên
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
