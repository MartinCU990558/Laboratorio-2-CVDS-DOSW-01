package edu.dosw.lab.creacionales.Reto2Builder;

public interface Builder {
    void reset();

    void ponerPan(Pan pan);

    void ponerCarne(Carne carne);

    void ponerQueso(Queso queso);

    void ponerNuevoIngrediente(NuevoIngrediente nuevoIngrediente);

}
