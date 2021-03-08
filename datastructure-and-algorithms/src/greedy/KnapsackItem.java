package src.greedy;

public class KnapsackItem {
    private int value;
    private int weight;
    private double cost;

    public KnapsackItem(int value, int weight) {
        this.setValue(value);
        this.setWeight(weight);
        this.cost = (double) value / (double) weight;
    }

    public String toString() {
        return "{value: " + this.getValue() + " weight: " + this.getWeight() + " cost: "
                + this.getCost() + "}";

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
