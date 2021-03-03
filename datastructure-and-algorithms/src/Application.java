package src;

import src.linkedlist.LinkedListDriver;
import src.sorting.SortDriver;

public class Application {
    public static void main(String args[]) {
        System.out.println("Hello World!");

        // LinkedListDriver linkedListDriver = new LinkedListDriver();
        // linkedListDriver.run();

        SortDriver sortDriver = new SortDriver();
        sortDriver.run();
    }
}
