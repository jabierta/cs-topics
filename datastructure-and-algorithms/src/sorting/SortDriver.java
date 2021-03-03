package src.sorting;

import java.util.Random;

public class SortDriver {

    public void run() {
        System.out.println("Sorting Algorithms");
        System.out.println("NOTE: All Sorting algorithms are sorting in ascending direction!");
        BubbleSort bubbleSort = new BubbleSort();

        Random random = new Random();

        Integer[] unsortedArray = new Integer[random.nextInt(50)];

        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = random.nextInt(100);
        }

        System.out.println("========================BUBBLE SORT========================");
        System.out.println("Unsorted Array: ");
        this.print(unsortedArray);
        System.out.println("\nSorted Array: ");
        this.print(bubbleSort.sortArray(unsortedArray));

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
