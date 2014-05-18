package com.bradley.designpatterntest.creational.factorymethod;

/**
 *
 * @author bradley
 */
public class AnimalFactory {
    private static AnimalFactory animalFactory = null;
    
    private AnimalFactory(){
    }
    
    public static AnimalFactory getAnimalFactoryInstance(){
        if(animalFactory == null){
            animalFactory = new AnimalFactory();
        }
        
        return animalFactory;
    }
    
    public static Animal getAnimal(String type){
        if(type.equals("canine")){
            return new Dog();
        }else{
            return new Cat();
        }
    }
}
