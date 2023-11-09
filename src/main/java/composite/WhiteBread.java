package composite;

import lombok.Builder;

@Builder
public class WhiteBread implements Food{
    String name;
    double weight;

    @Override
    public double calories() {
        return weight * 100;
    }

    @Override
    public double weight() {
        return weight;
    }
}
