/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muni.fi.pb007.petshop;

/**
 *
 * @author stano
 */
public class Cat implements Animal {
    
        private String name;
        private String color;
        private Food favouriteFood ;

        public Cat()
        {
            name = "Tom";
        }

        public void makeSound()
        {
            System.out.println("Mnau");
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Food getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(Food favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

   
    
}
