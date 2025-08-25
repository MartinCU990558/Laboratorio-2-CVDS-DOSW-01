package edu.dosw.lab.creacionales.Reto2;
import java.util.*;

public class Hamburguer {
    private List<Ingredients> ingredients;
    public Hamburguer(List<Ingredients> ingredients){
        this.ingredients = ingredients;
    } 

    public double totalPrice(){
        return ingredients.stream().
                mapToDouble(ingredients -> ingredients.getPrice()).sum();  
    }
    public List<Ingredients> getIngredients() {
        return ingredients;
    }
}
