package com.hub.algorithms.sorting;

public class MergeSort {
    /*
        Lý thuyết:
        Merge Sort (Sắp xếp trộn): là một thuật toán chia để trị (Divide and Conquer).
        Nó chia mảng đầu vào thành hai nửa, sắp xếp đệ quy hai nửa đó, và sau đó trộn chúng lại để tạo thành mảng đã được sắp xếp.

        Thuật toán (Algorithm):
        Chia mảng chưa sắp xếp thành hai nửa.
        Sắp xếp đệ quy cả hai nửa.
        Trộn hai nửa đã sắp xếp lại với nhau.

        Time Complexity:
        - Best-case: O(n log n) - Khi mảng đã được sắp xếp, thuật toán vẫn phải chia và trộn các phần tử.
        - Average-case: O(n log n) - Khi mảng có phần tử được sắp xếp ngẫu nhiên.
        - Worst-case: O(n log n) - Khi mảng được sắp xếp ngược lại.
     */

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Bước 1: Chia mảng chưa sắp xếp thành hai nửa (Bằng cách tìm chỉ số giữa)
            int mid = (left + right) / 2;

            // Bước 2: Sắp xếp đệ quy cả hai nửa
            // Sắp xếp nửa đầu tiên và nửa thứ hai
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Bước 3: Trộn hai nửa đã sắp xếp lại với nhau
            // Trộn các nửa đã sắp xếp
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Tạo các mảng tạm thời
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Sao chép dữ liệu vào các mảng tạm thời
        for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];

        // Trộn các mảng tạm thời
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Sao chép các phần tử còn lại của L[] và R[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
