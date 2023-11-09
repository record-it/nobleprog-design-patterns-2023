package composite;

import lombok.Builder;

@Builder
public class Cheese implements Food {
    String name;
    double weight;
    double caloriesPerUnit;

    @Override
    public double calories() {
        return weight * caloriesPerUnit;
    }

    @Override
    public double weight() {
        return weight;
    }
}
