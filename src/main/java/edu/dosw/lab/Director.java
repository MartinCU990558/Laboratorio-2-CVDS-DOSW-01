package edu.dosw.lab;

public class Director {
    public void construirHamburguesa(Builder builder) {
        builder.ponerPan(new Pan());
        builder.ponerCarne(new Carne());
        builder.ponerQueso(new Queso());
        builder.ponerNuevoIngrediente(new NuevoIngrediente());
    }
}
