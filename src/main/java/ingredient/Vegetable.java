package ingredient;

public abstract class Vegetable implements Comparable<Vegetable>{

    int calories;

    String prepareAction;

    @Override
    public int compareTo(Vegetable otherVegetable) {
        if (this.getCalories() == otherVegetable.getCalories()) {
            return 0;
        } else if (this.getCalories() < otherVegetable.getCalories()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return prepareAction + " " + this.getClass().getSimpleName();
    }

    public void setAction(String prepareAction) {
        this.prepareAction = prepareAction;
    }

    public int getCalories() {
        return calories;
    }

/*    public void applyAction(){
        prepareAction.performAction(this);
    }*/
}
