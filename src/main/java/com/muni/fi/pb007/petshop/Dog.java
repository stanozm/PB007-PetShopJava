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
public class Dog {
        private Person owner;
        protected String color;
        

        public Dog()
        {
            
        }

        public void makeSound()
        {
            System.out.println("HAF");
        }

    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    
    

       
}
