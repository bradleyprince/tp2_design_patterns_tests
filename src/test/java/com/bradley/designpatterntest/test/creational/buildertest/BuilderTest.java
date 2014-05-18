/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterntest.test.creational.buildertest;

import com.bradley.designpatterntest.creational.builder.ItalianMealBuilder;
import com.bradley.designpatterntest.creational.builder.JapaneseMealBuilder;
import com.bradley.designpatterntest.creational.builder.Meal;
import com.bradley.designpatterntest.creational.builder.MealBuilder;
import com.bradley.designpatterntest.creational.builder.MealDirector;
import com.bradley.designpatterntest.creational.builder.MexicanMealBuilder;
import com.bradley.designpatterntest.creational.builder.SouthAfricanMealBuilder;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Balla
 */
public class BuilderTest {
    
    public BuilderTest() {
    }
    
    @Test
    public void testBuilderPattern() {
        MealBuilder mealBuilder = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        Meal meal = mealDirector.getMeal();
        System.out.println("meal is: " + meal.toString());
        
        mealBuilder = new JapaneseMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        meal = mealBuilder.getMeal();
        System.out.println("meal is: " + meal.toString());
        
        mealBuilder = new MexicanMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        meal = mealBuilder.getMeal();
        System.out.println("meal is: " + meal.toString());
        
        mealBuilder = new SouthAfricanMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        meal = mealBuilder.getMeal();
        System.out.println("meal is: " + meal.toString());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}