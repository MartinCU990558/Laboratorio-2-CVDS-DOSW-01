package edu.dosw.lab;
import java.util.*;

public class Hamburguer {
    private List<Ingredients> ingredients;
    public Hamburguer(List<Ingredients> ingredients){
        this.ingredients = ingredients;
    } 

    public int totalPrice(){
        return ingredients.stream().
                mapToInt(ingredients -> ingredients.getPrice()).sum();  
    }
}
