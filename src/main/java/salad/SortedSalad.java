package salad;

import ingredient.Vegetable;

import java.util.Collections;
import java.util.List;

public class SortedSalad extends SaladTemplate{

    public SortedSalad (List<Vegetable> ingredients, int calories){
        super.ingredients = ingredients;
        super.saladCalories = calories;
        sortIngredients();
    }

    public SortedSalad (){
    }

    private void sortIngredients (){
        Collections.sort(ingredients);
    }

}
