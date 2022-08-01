package services;

import models.Croissant;

import java.util.ArrayList;
import java.util.List;

public class CroissantService {

    private static int nextId = 1;

    private List<Croissant> inventory = new ArrayList<>();

    public Croissant create(String type, double price, int quantity){
        Croissant createdCroissant = new Croissant(nextId++, type, price, quantity);
        inventory.add(createdCroissant);
        return createdCroissant;
    }

    public Croissant findCroissant(int id){
        for (Croissant croissant : inventory){
            if (croissant.getId() == id){
                return croissant;
            }
        }return null;
    }

    public Croissant[] findAll(){
        Croissant[] croissantArray = new Croissant[inventory.size()];
        croissantArray = inventory.toArray(croissantArray);
        return croissantArray;
    }

    public boolean delete(int id){
        for (Croissant croissant : inventory){
            if (croissant.getId() == id){
                inventory.remove(croissant);
                return true;
            }
        }return false;
    }
}
