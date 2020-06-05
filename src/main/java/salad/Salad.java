package salad;

import ingredient.Vegetable;

import java.util.HashSet;
import java.util.Set;

public class Salad {
    private Set<Vegetable> ingredients;
    int saladCalories = 0;


    public int getCalories() {;
        return saladCalories;
    }

    public Salad (Vegetable vegetable){
        ingredients = new HashSet<Vegetable>();
        ingredients.add(vegetable);
        addCalories(vegetable);
    }

    public void addIngredients(Vegetable vegetable){
        ingredients.add(vegetable);
        addCalories(vegetable);
    }

    private void addCalories(Vegetable vegetable){
            saladCalories = saladCalories + vegetable.getCalories();
    }




}
