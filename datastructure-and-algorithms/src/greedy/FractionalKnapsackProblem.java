package src.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class FractionalKnapsackProblem {
    private double knapsackCapacity;
    private KnapsackItem[] items;

    // Input: knapsackCapacity, items
    // Output: The maximum possible value of the combined items
    // and for each item in knapsack at what fraction
    public void calculateMaximumValueAndItems() {
        // sort items by weight ratio
        double maximumValueOfCombinedItems = 0;
        double currentCapacityOfKnapsack = knapsackCapacity;
        Arrays.sort(this.items, new Comparator<KnapsackItem>() {
            @Override
            public int compare(KnapsackItem knapsackItem1, KnapsackItem knapsackItem2) {
                return Double.compare(knapsackItem2.getCost(), knapsackItem1.getCost());
            }
        });
        for (KnapsackItem knapsackItem : items) {
            if (currentCapacityOfKnapsack - knapsackItem.getWeight() > 0) {
                currentCapacityOfKnapsack = currentCapacityOfKnapsack - knapsackItem.getWeight();
                maximumValueOfCombinedItems += knapsackItem.getValue();
                System.out
                        .println("We are using the full weight and value of this item weight: "
                                + knapsackItem.getWeight() + ", value: " + knapsackItem.getValue());
            } else {
                double ratio = currentCapacityOfKnapsack / knapsackItem.getWeight();
                System.out.println(
                        "We are using the a fraction of the weight and a fraction of the value of this item weight: "
                                + currentCapacityOfKnapsack + ", value: "
                                + (knapsackItem.getValue() * ratio));
                maximumValueOfCombinedItems += knapsackItem.getValue() * ratio;
                break;
            }
        }

        System.out.println("Therefore the maximum value is: " + maximumValueOfCombinedItems);
    }

    public FractionalKnapsackProblem(double knapsackCapacity, int numItems) {
        this.items = this.generateItems(numItems);
        this.knapsackCapacity = knapsackCapacity;
    }

    private KnapsackItem[] generateItems(int numItems) {
        // max weight is 100
        // max value is 100
        Random random = new Random();
        KnapsackItem[] knapsackItems = new KnapsackItem[numItems];
        for (int i = 0; i < numItems; i++) {
            knapsackItems[i] = new KnapsackItem(random.nextInt(100), random.nextInt(100));
        }
        return knapsackItems;
    }

    public KnapsackItem[] getItems() {
        return items;
    }

    public void setItems(KnapsackItem[] items) {
        this.items = items;
    }

    public double getKnapsackCapacity() {
        return this.knapsackCapacity;
    }

    public void setKnapsackCapacity(int knapsackCapacity) {
        this.knapsackCapacity = knapsackCapacity;
    }

    public void printItems() {
        for (KnapsackItem item : this.items) {
            System.out.println(item.toString());
        }
    }

}
