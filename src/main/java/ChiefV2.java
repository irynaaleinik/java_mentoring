import ingredient.Cucumber;
import ingredient.Lettuce;
import ingredient.Tomato;
import ingredient.Vegetable;
import salad.Salad;
import salad.SaladBuilder;
import salad.SaladComparator;
import salad.SortedSalad;

import java.util.*;

public class ChiefV2 {

    public static void main(String[] args){
        Map<Vegetable, String> products = new HashMap<>();
        products.put(new Cucumber(), "Diced");
        products.put(new Tomato(), "Chopped");
        products.put(new Lettuce(), "Chopped");
        SortedSalad sortedSalad = new SaladBuilder()
                .setIngredient(products)
                .buildSortedSalad();
        System.out.println(sortedSalad);

        Map<Vegetable, String> products2 = new HashMap<>();
        products2.put(new Cucumber(), "Diced");
        products2.put(new Tomato(), "Chopped");
        products2.put(new Lettuce(), "Chopped");
        Salad salad = new SaladBuilder()
                .setIngredient(products2)
                .buildSalad();
        SaladComparator comparator = new SaladComparator();
        List<Vegetable> ingredients = salad.getIngredients();
        Collections.sort(ingredients, comparator);
        System.out.println(salad);



    }

}
