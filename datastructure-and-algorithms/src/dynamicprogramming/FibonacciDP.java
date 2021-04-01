package src.dynamicprogramming;

public class FibonacciDP {
    public int fib(int n) {
        int[] memory = new int[n + 1];
        for (int i = 0; i < memory.length; i++) {
            if (i == 0 || i == 1) {
                memory[i] = i;
            } else {
                memory[i] = memory[i - 1] + memory[i - 2];
            }
        }

        return memory[n];
    }
}
