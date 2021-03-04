package src.sorting;

public class QuickSort {
    /**
     * Time Complexities Worst Case: O(n^2) Best Case: O(n log(n)) To optimize try and apply the
     * algorithm: https://opendsa-server.cs.vt.edu/ODSA/Books/Everything/html/Quicksort.html
     */
    public Integer[] sortArray(Integer[] array) {
        this.quickSortArray(0, array.length - 1, array);
        return array;
    }

    private void quickSortArray(int leftIndex, int rightIndex, Integer[] array) {
        if (rightIndex - leftIndex <= 0) {
            return;
        }

        int pivot = array[rightIndex];
        int partitionIndex = this.partitionArray(array, leftIndex, rightIndex, pivot);

        this.quickSortArray(leftIndex, partitionIndex - 1, array);
        this.quickSortArray(partitionIndex, rightIndex, array);

    }

    private int partitionArray(Integer[] array, int leftIndex, int rightIndex, int pivot) {
        while (true) {
            while (array[leftIndex] < pivot) {
                leftIndex++;
            }

            while (array[rightIndex] > pivot) {
                rightIndex--;
            }

            if (array[leftIndex] > array[rightIndex]) {
                int value = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = value;
                leftIndex++;
                rightIndex--;
            }

            if (leftIndex >= rightIndex) {
                break;
            }
        }

        return leftIndex;
    }
}


