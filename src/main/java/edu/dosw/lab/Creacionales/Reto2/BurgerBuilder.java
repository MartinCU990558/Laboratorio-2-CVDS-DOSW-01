package edu.dosw.lab.Creacionales.Reto2;
/**
 * Implementación del patrón builder
 * aplicado a la personalización de
 * las 'hamburguejas'.
 */
public class BurgerBuilder {
    private Burger hamburgueja = new Burger();

    public BurgerBuilder añadir(Ingredients ingrediente){
        hamburgueja.añadirIngrediente(ingrediente);
        return this;
    }

    public Burger build(){
        return hamburgueja;
    }
}