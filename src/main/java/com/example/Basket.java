package com.example;

import java.util.ArrayList;

public class Basket {
    private int capacity;
    private ArrayList<Fruit> fruits;

    public Basket(int capacity) {
        this.capacity=capacity;
        this.fruits = new ArrayList <Fruit>();
        // TODO: Initialize the attributes (and initialize the fruits list)
    }
    public int getCapacity(){
        return this.capacity;
    }
    public ArrayList<Fruit> getFruits(){
        return this.fruits;
    }
    public void addFruit(Fruit fruit){
         if (this.fruits.size()<this.capacity)
            fruits.add(fruit);
         }
         
        // TODO: Add the fruit to the basket IF THERE IS SPACE!
    

    public void removeFruit(Fruit fruit) {
        fruits.remove(fruit);
        // TODO: Remove the fruit from the basket
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public void setFruits(ArrayList<Fruit> fruits){
        this.fruits=fruits;
    }
    
    // TODO: Implement getters, setters, and any other methods you find necessary
}
