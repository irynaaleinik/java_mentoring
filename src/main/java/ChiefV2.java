import ingredient.Tomato;
import salad.Salad;

public class ChiefV2 {

    public static void main(String[] args){
        Salad salad = new Salad(new Tomato());
        System.out.println(salad.getCalories());
        //salad.addIngredients();
    }

}
