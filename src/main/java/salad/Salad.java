package salad;

import ingredient.Vegetable;

import javax.xml.bind.ValidationEvent;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public abstract class SaladTemplate {

    Set<Vegetable> ingredients;
    int saladCalories = 0;

    public SaladTemplate (Set<Vegetable> ingredients, int calories){
        this.ingredients = ingredients;
        this.saladCalories = calories;
    }

    public SaladTemplate() {
    }

    public int getCalories() {;
        return saladCalories;
    }

    public Set<Vegetable> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        String result = "Your salad is ready. Ingredients: ";
        for(Vegetable eachIngredient:ingredients) {
            result = result.concat(eachIngredient.toString());
            result = result.concat(", ");
        }
        result = result.substring(0, result.length() - 2);
         return result + ". Total Calories = " + saladCalories;
    }
}
