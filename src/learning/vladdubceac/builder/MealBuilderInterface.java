package learning.vladdubceac.builder;

import learning.vladdubceac.builder.implementation.Meal;

public interface MealBuilderInterface {
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}
