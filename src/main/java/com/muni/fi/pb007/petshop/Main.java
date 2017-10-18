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
public class Main {
    
    public static void main(String args[]) {
        
    Person stano = new Person();
    stano.getSomeCat();
    stano.makeCatsSomeFood(new Food("Kit Cat"));
    stano.getCats().get(0).makeSound();
    }
}
