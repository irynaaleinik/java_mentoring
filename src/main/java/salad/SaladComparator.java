package salad;

import ingredient.Vegetable;

import java.util.Comparator;

public class SaladComparator implements Comparator<Vegetable>{

    @Override
    public int compare(Vegetable vegetable1, Vegetable vegetable2) {
        if (vegetable1.getCalories() == vegetable2.getCalories()){
            return 0;
        }else if(vegetable1.getCalories() < vegetable2.getCalories()){
            return -1;
        } else return 1;
    }

}
