package edu.dosw.lab.creacionales.Reto2;

import java.util.*;

public class BuilderHamburguer {
    private List<Ingredients> ingredients = new ArrayList<>();
    public BuilderHamburguer addIngredients(Ingredients ingredient){
        ingredients.add(ingredient);
        return this;  
    }
    public Hamburguer buildHamburguers(){
        return new Hamburguer(ingredients);
    }
}
