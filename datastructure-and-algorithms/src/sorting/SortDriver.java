package src.sorting;

import java.util.Random;

public class SortDriver {

    public void run() {
        System.out.println("Sorting Algorithms");
        System.out.println("NOTE: All Sorting algorithms are sorting in ascending direction!");
        Random random = new Random();

        Integer[] unsortedArray = new Integer[random.nextInt(50)];

        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = random.nextInt(100);
        }

        // System.out.println("========================BUBBLE SORT========================");
        // BubbleSort bubbleSort = new BubbleSort();
        // System.out.println("Unsorted Array: ");
        // this.print(unsortedArray);
        // System.out.println("\nSorted Array: ");
        // this.print(bubbleSort.sortArray(unsortedArray));
        // System.out.println("\n========================BUBBLE SORT========================");

        System.out.println("\n========================QUICK SORT========================");
        QuickSort quickSort = new QuickSort();
        System.out.println("Unsorted Array: ");
        unsortedArray = new Integer[] {5, 3, 1, 4, 6};
        this.print(unsortedArray);
        System.out.println("\nSorted Array: ");
        this.print(quickSort.sortArray(unsortedArray));
        System.out.println("\n========================QUICK SORT========================");
            

    }

    private void print(Object[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].toString());
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
