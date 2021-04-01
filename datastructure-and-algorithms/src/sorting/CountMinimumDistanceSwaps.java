package src.sorting;

import java.util.ArrayList;
import java.util.List;

public class CountMinimumDistanceSwaps {
    public static class Element {
        int elementIndex;
        int elementValue;
    }

    public static long countSwaps(List<Integer> array) {
        if (array.size() < 1 || array.size() > Math.pow(10, 5)) {
            return 0L;
        }

        int[] smallestSwaps = new int[array.size()];
        List<Element> elementsOfArray = new ArrayList<Element>();
        for (int i = 0; i < array.size(); i++) {
            Element element = new Element();
            element.elementIndex = i;
            element.elementValue = array.get(i);
            elementsOfArray.add(element);
        }

        int numberOfSwaps = 0;
        for (int i = 0; i < array.size(); i++) {
            numberOfSwaps += smallestSwaps[i];
        }

        return numberOfSwaps;
    }

    public static List<Element> mergeSort(List<Element> elements, int[] smallestSwaps) {
        if (elements.size() <= 1) {
            return elements;
        }
        int midPoint = elements.size() / 2;
        List<Element> left = mergeSort(elements.subList(0, midPoint), smallestSwaps);
        List<Element> right = mergeSort(elements.subList(midPoint, elements.size()), smallestSwaps);

        return merge(left, right, smallestSwaps);
    }

    public static List<Element> merge(List<Element> left, List<Element> right,
            int[] smallestSwaps) {
        List<Element> mergedArray = new ArrayList<Element>();
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex < left.size() || rightIndex < right.size()) {
            if ((leftIndex < left.size()
                    && left.get(leftIndex).elementValue <= right.get(rightIndex).elementValue)
                    || rightIndex >= right.size()) {
                mergedArray.add(left.get(leftIndex));
                smallestSwaps[left.get(leftIndex).index] += rightIndex;
                leftIndex++;
            } else {
                mergedArray.add(right.get(rightIndex));
                rightIndex++;
            }
        }
        return mergedArray;
    }

}
