package edu.dosw.lab.creacionales.Reto2Builder;

public interface Builder {
    void reset();

    void ponerPan(Pan pan);

    void ponerCarne(Carne carne);

    void ponerQueso(Queso queso);

    void ponerLechuga(Lechuga lechuga);

    void ponerTomate(Tomate tomate);

    void ponerSalsaEspecial(SalsaEspecial salsaEspecial);

    void ponerNuevoIngrediente(NuevoIngrediente nuevoIngrediente);

}
