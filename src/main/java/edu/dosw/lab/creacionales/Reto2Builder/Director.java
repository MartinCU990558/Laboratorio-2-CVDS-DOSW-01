package edu.dosw.lab.creacionales.Reto2Builder;

public class Director {
    public void construirHamburguesa(Builder builder) {
        builder.ponerPan(new Pan());
        builder.ponerCarne(new Carne());
        builder.ponerQueso(new Queso());
        builder.ponerNuevoIngrediente(new NuevoIngrediente());
    }
}
