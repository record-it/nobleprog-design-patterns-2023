package composite;

import java.util.ArrayList;
import java.util.List;

public class Meal implements Food{
    List<Food> ingredients = new ArrayList<>();

    public Meal(List<Food> ingredients){
        this.ingredients = ingredients;
    }

    @Override
    public double calories() {
        return ingredients.stream().mapToDouble(Food::calories).sum();
    }

    @Override
    public double weight() {
        return ingredients.stream().mapToDouble(Food::weight).sum();
    }
}
