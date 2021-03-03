package src.sorting;

import src.linkedlist.SingleLinkNode;
import src.linkedlist.SingleLinkedList;

public class BubbleSort {
    // method for sorting array

    // Time complexity: O(n^2)
    public Integer[] sortArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int value = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = value;
                }
            }
        }
        return array;
    }

    // method for sorting Single linked list
    public SingleLinkedList sortList() {
        return null;
    }
    // sort queue
    // sort stack
    // sort trees
    // sorting graphs

}
