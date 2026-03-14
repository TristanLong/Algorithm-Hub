package com.hub.demos.dynamic_programming;

import com.hub.algorithms.dynamic_programming.FibonacciSequence;
import com.hub.ui.DemoRunner;
import com.hub.utils.DemoOutputUtils;

import java.util.Scanner;

public class FibonacciSequenceDemo extends DemoRunner {
    private final Scanner scanner = new Scanner(System.in);

    public FibonacciSequenceDemo() {
        super("Fibonacci Sequence Demo");
    }

    @Override
    public void run() {
        int n = getInputN();

        long startTime = System.nanoTime();
        int result = FibonacciSequence.fibonacci(n);
        long endTime = System.nanoTime();

        System.out.println("Fib(" + n + ") = " + result);
        DemoOutputUtils.printExecutionTime(startTime, endTime);
    }

    private int getInputN() {
        System.out.print("Enter n (0-46): ");
        try {
            int n = Integer.parseInt(scanner.nextLine());
            if (n < 0) return 0;
            if (n > 46) {
                System.out.println(">> n too large for int. Using n=46.");
                return 46;
            }
            return n;
        } catch (Exception e) {
            System.out.println(">> Invalid input. Using n=10.");
            return 10;
        }
    }
}

