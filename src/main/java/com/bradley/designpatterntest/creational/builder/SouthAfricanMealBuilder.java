/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterntest.creational.builder;

/**
 *
 * @author bradley
 */
public class SouthAfricanMealBuilder implements MealBuilder{

    private Meal meal;

    public SouthAfricanMealBuilder() {
        this.meal = new Meal();
    }
    
    @Override
    public void buildDrink() {
        this.meal.setDrink("beer");
    }
    
    @Override
    public void buildMainCourse() {
        this.meal.setMainCourse("potjie");
    }
    
    @Override
    public void buildSide() {
        this.meal.setSide("potatoe salad");
    }
    
    @Override
    public Meal getMeal() {
        return this.meal;
    }
    
}
