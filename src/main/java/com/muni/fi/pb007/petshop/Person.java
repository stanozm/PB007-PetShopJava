/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muni.fi.pb007.petshop;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author stano
 */
public class Person {
    
    private String name;
    private Dog favouriteDog;
    private List<Dog> dogs;
    private List<Cat> cats;

        public Person()
        {
            dogs = new LinkedList<Dog>();
            cats = new LinkedList<Cat>();
        }

        public void makeCatsSomeFood(Food food)
        {
            for(Cat cat : cats)
            {
                System.out.println(cat.getName() + " here is some " + food.getName() + " for you");
            }

        }

        public void getSomeCat()
        {
            cats.add(Shop.sellCat());
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getFavouriteDog() {
        return favouriteDog;
    }

    public void setFavouriteDog(Dog favouriteDog) {
        this.favouriteDog = favouriteDog;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }
        
        
    }
    

