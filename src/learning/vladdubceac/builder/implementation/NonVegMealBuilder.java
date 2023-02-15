package learning.vladdubceac.builder.implementation;

import learning.vladdubceac.builder.Burger;
import learning.vladdubceac.builder.ColdDrink;
import learning.vladdubceac.builder.MealBuilderInterface;

public class NonVegMealBuilder implements MealBuilderInterface {
    private Meal meal ;

    public NonVegMealBuilder(){
        meal = new Meal();
    }

    @Override
    public void buildBurger() {
        Burger burger = new ChickenBurger();
        meal.addItem(burger);
    }

    @Override
    public void buildDrink() {
        ColdDrink pepsi = new Pepsi();
        meal.addItem(pepsi);
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
