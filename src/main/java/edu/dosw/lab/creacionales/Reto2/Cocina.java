package edu.dosw.lab.creacionales.Reto2;

import edu.dosw.lab.creacionales.Reto2.Ingredientes.*;

import java.util.ArrayList;

public class Cocina {
    private Pedido pedido;
    private Hamburguesa hamburguesa;
    private ArrayList<Ingrediente> ingredientes_disponibles;



    public Cocina() {
        this.pedido = null;
        this.ingredientes_disponibles = new ArrayList<>();
        setIngredientesDisponibles();
    }

    private void setIngredientesDisponibles() {
        ingredientes_disponibles.add(new Carne());
        ingredientes_disponibles.add(new Lechuga());
        ingredientes_disponibles.add(new Pan());
        ingredientes_disponibles.add(new Queso());
        ingredientes_disponibles.add(new Salsa());
        ingredientes_disponibles.add(new Tomate());
    }

    public void setCocina(Pedido pedido) {
        this.pedido = pedido;
    }



    public void cocinar(){
        HamburguesaBuilder hambur = new HamburguesaBuilder();
        ArrayList<Ingrediente> ingredientes = this.pedido.obtenerPedido();
            for(Ingrediente ingrediente : ingredientes){
                hambur.agregarIngrediente(ingrediente);
            }
            this.hamburguesa = hambur.build();
        }

    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }

    public ArrayList<Ingrediente> getIngredientes_disponibles() {
        return ingredientes_disponibles;
    }

}
