package com.base.pattern.builder;

/**
 * <p>建造者模式</p>
 *
 * @author kevin
 * @create 2018-04-26 10:33
 **/
public class BuilderDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareVegMeal();
        meal.showItem();
        meal.getCost();

        Meal mealOne = mealBuilder.prepareNonVegMeal();
        mealOne.showItem();
        mealOne.getCost();
    }
}
