package pizza;

import java.util.Arrays;
import java.util.List;

public abstract class Pizza {

    private double cost;
    private List<String> components;

    public Pizza(double cost, List<String> components) {
        this.cost = cost;
        this.components = components;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public void showPizzaInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "CapriciosaPizza{" +
                "cost=" + cost +
                ", components=" + components +
                '}';
    }
}
