package edu.dosw.lab.creacionales.Reto2Builder;

public class HamburguesaNuevoIngredienteBuilder implements Builder {
    private HamburguesaNuevoIngrediente hamburguesa;
    private Pan pan;
    private Carne carne;
    private Queso queso;
    private NuevoIngrediente nuevoIngrediente;

    public HamburguesaNuevoIngredienteBuilder() {
        reset();
    }

    public void reset() {
        this.hamburguesa = new HamburguesaNuevoIngrediente();
    }

    public void ponerPan(Pan pan) {
        this.pan = pan;
        hamburguesa.addingIngredientes(pan);
    }

    public void ponerCarne(Carne carne) {
        this.carne = carne;
        hamburguesa.addingIngredientes(carne);
    }

    public void ponerQueso(Queso queso) {
        this.queso = queso;
        hamburguesa.addingIngredientes(queso);
    }

    public void ponerNuevoIngrediente(NuevoIngrediente nuevoIngrediente) {
        this.nuevoIngrediente = nuevoIngrediente;
        hamburguesa.addingIngredientes(nuevoIngrediente);
    }

    public HamburguesaNuevoIngrediente getHamburguesaNuevoIngrediente() {
        return hamburguesa;
    }
}
