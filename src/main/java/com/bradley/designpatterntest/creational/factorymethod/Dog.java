/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterntest.creational.factorymethod;

/**
 *
 * @author bradley
 */
public class Dog implements Animal{

    @Override
    public String makeSound() {
        return "Woof";
    }   
}
