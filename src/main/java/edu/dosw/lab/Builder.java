package edu.dosw.lab;

public interface Builder {
    void reset();

    void ponerPan(Pan pan);

    void ponerCarne(Carne carne);

    void ponerQueso(Queso queso);

    void ponerNuevoIngrediente(NuevoIngrediente nuevoIngrediente);

}
