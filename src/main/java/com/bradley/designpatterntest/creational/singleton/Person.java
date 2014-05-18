/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bradley.designpatterntest.creational.singleton;

/**
 *
 * @author bradley
 */
public class Person {
    private static Person person = null;
    
    private Person() {
    }
    
    public static Person getInstance(){
        if (person == null){
            person = new Person();
        }
        
        return person;
    }
    
    public void sayHello(){
        System.out.println("Hello");
    }
}
