package services;

import models.Coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeService {

    private static int nextId = 1;

    private List<Coffee> inventory = new ArrayList<>();

    public Coffee create(String roast, double price, String country, int quantity){
        Coffee createdCoffee = new Coffee(nextId++, roast, price, country, quantity);
        inventory.add(createdCoffee);
        return createdCoffee;
    }

    public Coffee findCoffee(int id){
        for (Coffee coffee : inventory){
            if (coffee.getId() == id){
                return coffee;
            }
        }
        return null;
    }

    public Coffee[] findAll(){
        Coffee[] coffeeArray = new Coffee[inventory.size()];
        coffeeArray = inventory.toArray(coffeeArray);
        return coffeeArray;
    }

    public boolean delete(int id){
        for (Coffee coffee : inventory){
            if (coffee.getId() == id){
                inventory.remove(coffee);
                return true;
            }
        } return false;
    }
}
