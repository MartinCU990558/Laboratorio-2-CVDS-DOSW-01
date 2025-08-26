package edu.dosw.lab.creacionales.reto2;

public interface Builder {
    void setPan(Pan pan);
    void setCarne(Carne carne);
    void setQueso(Queso queso);
    void setSalsaEspecial(SalsaEspecial salsaEspecial);
    void setLechuga(Lechuga lechuga);
    void setTomate(Tomate tomate);
    void setNuevoIngrediente();
    Hamburguesa build();
}
