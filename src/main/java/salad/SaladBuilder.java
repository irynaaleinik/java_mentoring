package salad;

import ingredient.Vegetable;

import java.util.*;

public class SaladBuilder {
    private List<Vegetable> ingredients;
    private int calories = 0;

    public SaladBuilder() {

        ingredients = new ArrayList<>();
    }

    public SaladBuilder setIngredient(Map<Vegetable, String> product) {
        for (Map.Entry<Vegetable, String> item : product.entrySet()) {
            item.getKey().setAction(item.getValue());
            ingredients.add(item.getKey());
            calories = calories + item.getKey().getCalories();
        }
        return this;
    }

    public Salad buildSalad(){
        Salad salad = new Salad(ingredients, calories);
        return salad;
    }
    public SortedSalad buildSortedSalad(){
        SortedSalad sortedSalad = new SortedSalad(ingredients, calories);
        return sortedSalad;

    }


}
