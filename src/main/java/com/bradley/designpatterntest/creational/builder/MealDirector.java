/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterntest.creational.builder;

/**
 *
 * @author bradley
 */
public class MealDirector {
    private MealBuilder mealBuilder = null;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }
    public void constructMeal()
    {
        mealBuilder.buildDrink();
        mealBuilder.buildMainCourse();
        mealBuilder.buildSide();
    }
    
    public Meal getMeal(){
        return mealBuilder.getMeal();
    }
            
    
}
