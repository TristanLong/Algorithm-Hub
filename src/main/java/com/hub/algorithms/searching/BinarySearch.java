package com.hub.algorithms.searching;

public class BinarySearch {
    /*
     * Lý thuyết:
     * Binary Search là một thuật toán tìm kiếm hiệu quả hoạt động trên các mảng đã được sắp xếp.
     * Nó lặp đi lặp lại việc chia khoảng tìm kiếm làm đôi.
     * Nếu giá trị của khóa tìm kiếm nhỏ hơn phần tử ở giữa khoảng, thu hẹp khoảng xuống nửa dưới;
     * Ngược lại, thu hẹp nó lên nửa trên.
     *
     * Time Complexity:
     * - Best-case: O(1) - Khi phần tử cần tìm nằm ở giữa mảng.
     * - Average-case: O(log n) - Khi phần tử cần tìm nằm ở một vị trí ngẫu nhiên trong mảng.
     * - Worst-case: O(log n) - Khi phần tử cần tìm không tồn tại hoặc nằm ở cuối mảng.
     */

    public static int binarySearch(int[] arr, int target) {
        // Bắt đầu với hai con trỏ, low và high, đại diện cho phạm vi tìm kiếm hiện tại.
        int low = 0, high = arr.length - 1;

        // Lặp lại quá trình cho đến khi low > high.
        while (low <= high) {
            // Tìm phần tử ở giữa: mid = (low + high) / 2.
            int mid = low + (high - low) / 2; // Tránh tràn số

            // Nếu phần tử ở giữa bằng mục tiêu, trả về chỉ số.
            if (arr[mid] == target) {
                return mid;
            }
            // Nếu mục tiêu lớn hơn phần tử ở giữa, điều chỉnh con trỏ low thành mid + 1.
            else if (arr[mid] < target) {
                low = mid + 1; // Tìm kiếm nửa bên phải
            }
            // Nếu mục tiêu nhỏ hơn phần tử ở giữa, điều chỉnh con trỏ high thành mid - 1.
            else {
                high = mid - 1; // Tìm kiếm nửa bên trái
            }
        }
        return -1; // Mục tiêu không được tìm thấy
    }
}