import java.io.*;

public class CountingInversions {
    static long numberOfSwaps = 0;

    // https://www.hackerrank.com/challenges/ctci-merge-sort/problem
    static long countInversions(int[] arr) {
        mergeSort(arr);
        return numberOfSwaps;
    }

    static int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array;
        }

        int[] leftArray = new int[(array.length + 1) / 2];
        int[] rightArray = new int[array.length - leftArray.length];

        for (int i = 0; i < array.length; i++) {
            if (i < leftArray.length) {
                leftArray[i] = array[i];
            } else {
                rightArray[i - leftArray.length] = array[i];
            }
        }

        return merge(mergeSort(leftArray), mergeSort(rightArray));
    }

    static int[] merge(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int a1Index = 0;
        int a2Index = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            if (a1Index >= array1.length) {
                mergedArray[i] = array2[a2Index];
                a2Index++;
            } else if (a2Index >= array2.length) {
                mergedArray[i] = array1[a1Index];
                a1Index++;
            } else if (array1[a1Index] > array2[a2Index]) {
                mergedArray[i] = array2[a2Index];
                numberOfSwaps = numberOfSwaps + (array1.length - a1Index);
                a2Index++;
            } else {
                mergedArray[i] = array1[a1Index];
                a1Index++;
            }
        }
        return mergedArray;
    }

    public static void main(String[] args) throws IOException {

        System.out.println("numberOfSwaps: 2 mine: " + countInversions(new int[] {2, 4, 1,}));
        numberOfSwaps = 0;
        System.out.println(
                "numberOfSwaps: 13 mine: " + countInversions(new int[] {1, 20, 6, 7, 5, 8, 11, 3}));
        numberOfSwaps = 0;
        System.out.println("numberOfSwaps: 0 mine: " + countInversions(new int[] {1, 1, 1, 2, 2}));
        numberOfSwaps = 0;
        System.out.println("numberOfSwaps: 4 mine: " + countInversions(new int[] {2, 1, 3, 1, 2}));
        numberOfSwaps = 0;
        System.out.println("numberOfSwaps: 1 mine: " + countInversions(new int[] {1, 5, 3, 7}));
        numberOfSwaps = 0;
        System.out.println("numberOfSwaps: 6 mine: " + countInversions(new int[] {7, 5, 3, 1}));
    }
}
