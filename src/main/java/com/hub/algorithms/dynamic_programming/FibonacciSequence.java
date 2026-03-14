package com.hub.algorithms.dynamic_programming;

public class FibonacciSequence {
    /*
        Lý thuyết: Dãy Fibonacci (Quy hoạch động - Dynamic Programming)
        Dãy Fibonacci là một dãy số trong đó mỗi số là tổng của hai số liền trước nó.
        Phương pháp quy hoạch động giúp tránh việc tính toán lại các giá trị Fibonacci bằng cách lưu trữ kết quả của các bài toán con (subproblems).

        Thuật toán (Algorithm):
        Sử dụng một mảng để lưu trữ các giá trị Fibonacci.
        Bắt đầu với các trường hợp cơ sở (base cases): Fib(0) = 0, Fib(1) = 1.
        Đối với mỗi giá trị tiếp theo, tính Fib(n) = Fib(n-1) + Fib(n-2) và lưu trữ nó.

        Time Complexity:
        - Best-case: O(n) - Khi n nhỏ hơn hoặc bằng 1, thuật toán trả về kết quả ngay lập tức.
        - Average-case: O(n) - Khi n lớn hơn 1, thuật toán phải tính toán tất cả các giá trị từ 2 đến n.
        - Worst-case: O(n) - Khi n lớn hơn 1, thuật toán phải tính toán tất cả các giá trị từ 2 đến n.
     */

    public static int fibonacci(int n) {
        // Xử lý nhanh các trường hợp cơ sở khi n bằng 0 hoặc 1
        if (n <= 1) {
            return n;
        }

        // Bước 1: Sử dụng một mảng để lưu trữ các giá trị Fibonacci.
        int[] fib = new int[n + 1];

        // Bước 2: Bắt đầu với các trường hợp cơ sở: Fib(0) = 0, Fib(1) = 1.
        fib[0] = 0;
        fib[1] = 1;

        // Bước 3: Đối với mỗi giá trị tiếp theo, tính Fib(n) = Fib(n-1) + Fib(n-2) và lưu trữ nó.
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }
}
