package learning.vladdubceac.builder;

import learning.vladdubceac.builder.implementation.Meal;
import learning.vladdubceac.builder.implementation.NonVegMealBuilder;
import learning.vladdubceac.builder.implementation.VegMealBuilder;

public class Client {
    public static void main(String[] args) {
        System.out.println("*** Meal Pattern Demo ***\n");

        Director director = new Director();
        MealBuilderInterface vegMealBuilder = new VegMealBuilder();
        director.construct(vegMealBuilder);
        Meal vegMeal = director.getMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost : "+vegMeal.getCost());

        MealBuilderInterface nonVegMealBuilder = new NonVegMealBuilder();
        director.construct(nonVegMealBuilder);
        Meal nonVegMeal = director.getMeal();
        System.out.println("\nNon-veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost : "+nonVegMeal.getCost());
    }
}
