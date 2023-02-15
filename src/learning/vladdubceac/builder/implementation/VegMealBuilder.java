package learning.vladdubceac.builder.implementation;

import learning.vladdubceac.builder.Burger;
import learning.vladdubceac.builder.ColdDrink;
import learning.vladdubceac.builder.MealBuilderInterface;

public class VegMealBuilder implements MealBuilderInterface {
    private Meal meal ;

    public VegMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void buildBurger() {
        Burger vegBurger = new VegBurger();
        meal.addItem(vegBurger);
    }

    @Override
    public void buildDrink() {
        ColdDrink coke = new Coke();
        meal.addItem(coke);
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
