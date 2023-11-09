package composite;

import java.util.List;
// zdefiniuj klasę Egg, która tworzy jajko o wadze 50 i kaloryczności 50
// stwórz posiłek breakfast składający się z sandwitcha i 2 jajek
// wyświetl kaloryczność i wagę posiłku
public class FoodCompositeDemo {
    public static void main(String[] args) {
        Meal sandwitch = new Meal(
                List.of(
                    new Cheese("gouda", 23, 4),
                    new WhiteBread("bułka", 100)
                )
        );
        System.out.println("Kaloryczność: " + sandwitch.calories());
    }
}
