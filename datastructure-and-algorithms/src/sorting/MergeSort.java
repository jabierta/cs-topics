package src.sorting;

import src.linkedlist.SingleLinkedList;

public class MergeSort {
    /**
     * Time Complexity -> Worst Case: n log n, Average Case: n log n
     */
    public Integer[] sortArray(Integer[] array) {
        return this.mergeSortArray(array);
    }

    private Integer[] mergeSortArray(Integer[] array) {
        if (array.length <= 1) {
            return array;
        }
        // Maybe we can use Arrays.copyRangeOf
        Integer[] leftArray = new Integer[(array.length + 1) / 2];
        Integer[] rightArray = new Integer[(array.length - leftArray.length)];

        for (int i = 0; i < array.length; i++) {
            if (i < leftArray.length)
                leftArray[i] = array[i];
            else
                rightArray[i - leftArray.length] = array[i];
        }

        return mergeArrays(mergeSortArray(leftArray), mergeSortArray(rightArray));
    }

    private Integer[] mergeArrays(Integer[] array1, Integer[] array2) {
        int size = array1.length + array2.length;
        Integer[] array = new Integer[size];
        int indexAtArray1 = 0;
        int indexAtArray2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (indexAtArray1 >= array1.length) {
                array[i] = array2[indexAtArray2];
                indexAtArray2++;
            } else if (indexAtArray2 >= array2.length) {
                array[i] = array1[indexAtArray1];
                indexAtArray1++;
            } else if (array1[indexAtArray1] <= array2[indexAtArray2]) {
                array[i] = array1[indexAtArray1];
                indexAtArray1++;
            } else {
                array[i] = array2[indexAtArray2];
                indexAtArray2++;
            }
        }

        return array;
    }

    public SingleLinkedList sortSingleLinkedList() {
        return null;
    }
}
