package salad;

import ingredient.Vegetable;

import java.util.*;

public class Salad extends SaladTemplate {


    public Salad(List<Vegetable> ingredients, int calories) {
        super.ingredients = ingredients;
        super.saladCalories = calories;
    }

    public Salad() {
    }

}
