package src;

import src.dynamicprogramming.FibonacciDP;
import src.greedy.FractionalKnapsackProblem;
import src.linkedlist.LinkedListDriver;
import src.recursion.Fibonacci;
import src.recursion.TowerOfHanoi;
import src.sorting.SortDriver;
import src.treesandgraphs.BinarySearchTree;

public class Application {
    public static void main(String args[]) {
        System.out.println("Hello World!");

        // // LinkedList Data Structure
        // LinkedListDriver linkedListDriver = new LinkedListDriver();
        // linkedListDriver.run();

        // // Sorting Algorithms
        // SortDriver sortDriver = new SortDriver();
        // sortDriver.run();

        // // Trees
        // BinarySearchTree binarySearchTree = new BinarySearchTree();
        // binarySearchTree.run();

        // FractionalKnapsackProblem fractionalKnapsackProblem = new FractionalKnapsackProblem(50,
        // 3);
        // fractionalKnapsackProblem.printItems();
        // fractionalKnapsackProblem.calculateMaximumValueAndItems();

        // Recursion
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(9));

        FibonacciDP fibonacciDP = new FibonacciDP();
        System.out.println(fibonacciDP.fib(9));

        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.moveRings(4, 'A', 'B', 'C');
    }
}
