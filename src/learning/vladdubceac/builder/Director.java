package learning.vladdubceac.builder;

import learning.vladdubceac.builder.implementation.Meal;

public class Director {
    private MealBuilderInterface mealBuilder;

    public void construct(MealBuilderInterface builder){
        mealBuilder = builder;
        mealBuilder.buildBurger();
        mealBuilder.buildDrink();
    }

    public Meal getMeal() {
       return mealBuilder.getMeal();
    }
}
