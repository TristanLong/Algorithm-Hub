package com.hub.algorithms.sorting;

public class InsertionSort {
    /*
        Lý thuyết: Insertion Sort (Sắp xếp chèn)
        Sắp xếp chèn là một thuật toán sắp xếp dựa trên so sánh, xây dựng mảng cuối cùng đã được sắp xếp bằng cách thêm từng phần tử một.
        Nó kém hiệu quả hơn nhiều trên các danh sách lớn so với các thuật toán nâng cao hơn như Quick Sort, Heap Sort hoặc Merge Sort,
        nhưng nó lại khá hiệu quả đối với các tập dữ liệu nhỏ.

        Thuật toán (Algorithm):
        Bắt đầu với phần tử thứ hai, so sánh nó với các phần tử trước đó và chèn nó vào vị trí chính xác.
        Lặp lại quá trình cho tất cả các phần tử, chèn từng phần tử vào vị trí chính xác của nó trong phần mảng đã được sắp xếp.

        Time Complexity:
        - Best-case: O(n) - Khi mảng đã được sắp xếp, thuật toán chỉ cần duyệt qua mảng một lần.
        - Average-case: O(n^2) - Khi mảng có phần tử được sắp xếp ngẫu nhiên, thuật toán phải so sánh mỗi phần tử với tất cả các phần tử trước đó.
        - Worst-case: O(n^2) - Khi mảng được sắp xếp ngược lại, thuật toán phải so sánh mỗi phần tử với tất cả các phần tử trước đó.
     */

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Bước 2: Lặp lại quá trình cho tất cả các phần tử (bắt đầu từ phần tử thứ 2, tức i = 1)
        for (int i = 1; i < n; i++) {

            // Bước 1: Bắt đầu với phần tử thứ hai, lấy giá trị của nó làm 'key'
            int key = arr[i];
            int j = i - 1;

            // So sánh 'key' với các phần tử trước đó
            // Di chuyển các phần tử của arr[0..i-1] lớn hơn key lên trước một vị trí
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Chèn phần tử 'key' vào vị trí chính xác của nó trong phần đã sắp xếp
            arr[j + 1] = key;
        }
    }
}
