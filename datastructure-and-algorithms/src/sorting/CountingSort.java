package src.sorting;

public class CountingSort {
    /*
     * Counting sort utilizes the range and the differences between the occurences of numbers in a
     * unsorted set PROS: Linear Time Execution CONS: Space that is the size of range to keep track
     * of counts. Needs special implementations for non integer sets of unsorted elements.
     * 
     * Time Complexity: O(n+k), in the case of my algorithm it is O(2n + k)
     * 
     * Space Complexity: O(k), in the case of my algorithm it is O(n + k)
     */

    /*
     * This can be improved by using an oftest if we know the minimumValue which inturn could be
     * used for negative numbers
     * 
     * This can improve by using a different structure like a tree so we can utilize the data
     * structure to calculate max and min nodes
     */
    //
    public Integer[] sortArray(Integer[] array, Integer maxValue) {
        // create an array with the range
        // We are assuming that the minValue in this case is zero
        Integer[] range = new Integer[maxValue];
        Integer[] sortedArray = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {
            range[array[i]] = range[array[i]] == null ? 1 : range[array[i]] + 1;
        }

        for (int i = 0; i < range.length - 1; i++) {
            range[i + 1] =
                    (range[i + 1] == null ? 0 : range[i + 1]) + (range[i] == null ? 0 : range[i]);
        }

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int newIndex = range[value];
            sortedArray[newIndex - 1] = value;
            range[value] = range[value] - 1;
        }

        return sortedArray;
    }
}
