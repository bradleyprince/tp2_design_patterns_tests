/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterntest.creational.builder;

/**
 *
 * @author bradley
 */
public class MexicanMealBuilder implements MealBuilder{

    private Meal meal;
    
    public MexicanMealBuilder() {
        this.meal = new Meal();
    }
    
    @Override
    public void buildDrink() {
        this.meal.setDrink("vodka");
    }
    
    @Override
    public void buildMainCourse() {
        this.meal.setMainCourse("Tortilla and Taco's");
    }
    
    @Override
    public void buildSide() {
    }
    
    @Override
    public Meal getMeal() {
        return this.meal;
    }
    
}
