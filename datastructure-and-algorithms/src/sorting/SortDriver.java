package src.sorting;

import java.util.Random;

public class SortDriver {

    public void run() {
        System.out.println("Sorting Algorithms");
        System.out.println("NOTE: All Sorting algorithms are sorting in ascending direction!");
        
        Integer[] unsortedArray = this.generateValuesForIntegerArray();

        System.out.println("========================BUBBLE SORT========================");
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Unsorted Array: ");
        this.print(unsortedArray);
        System.out.println("\nSorted Array: ");
        this.print(bubbleSort.sortArray(unsortedArray));
        System.out.println("\n========================BUBBLE SORT========================");

        System.out.println("\n========================QUICK SORT========================");
        QuickSort quickSort = new QuickSort();
        // TODO Optimize Quick Sort!
        // unsortedArray = this.generateValuesForIntegerArray();
        unsortedArray = new Integer[] {5, 3, 1, 4, 6};
        System.out.println("Unsorted Array: ");
        this.print(unsortedArray);
        System.out.println("\nSorted Array: ");
        this.print(quickSort.sortArray(unsortedArray));
        System.out.println("\n========================QUICK SORT========================");


        System.out.println("\n========================MERGE SORT========================");
        MergeSort mergeSort = new MergeSort();
        unsortedArray = this.generateValuesForIntegerArray();
        System.out.println("Unsorted Array: ");
        this.print(unsortedArray);
        System.out.println("\nSorted Array: ");
        this.print(mergeSort.sortArray(unsortedArray));
        System.out.println("\n========================MERGE SORT========================");


    }

    private void print(Integer[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].toString());
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    private Integer[] generateValuesForIntegerArray() {
        Random random = new Random();
        Integer[] unsortedArray = new Integer[random.nextInt(50)];
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = random.nextInt(100);
        }
        return unsortedArray;
    }
}
