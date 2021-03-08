package src;

import src.greedy.FractionalKnapsackProblem;
import src.linkedlist.LinkedListDriver;
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

        FractionalKnapsackProblem fractionalKnapsackProblem = new FractionalKnapsackProblem(50, 3);
        fractionalKnapsackProblem.printItems();
        fractionalKnapsackProblem.calculateMaximumValueAndItems();
    }
}
