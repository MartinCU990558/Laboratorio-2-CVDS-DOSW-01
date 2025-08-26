package edu.dosw.lab.creacionales.reto2;

public class HamburguesaBuilder implements Builder{
    private Hamburguesa hamburguesa = new Hamburguesa();
    private Queso queso;
    private Lechuga lechuga;
    private Tomate tomate;
    private Carne carne;
    private Pan pan;
    private SalsaEspecial salsaEspecial;
    
    @Override
    public void setPan(Pan pan){
        this.pan = pan;
        hamburguesa.agregarIngrediente(pan);
    }

    @Override
    public void setCarne(Carne carne){
        this.carne = carne;
        hamburguesa.agregarIngrediente(carne);
    }

    @Override
    public void setQueso(Queso queso){
        this.queso = queso;
        hamburguesa.agregarIngrediente(queso);
    }

    @Override
    public void setSalsaEspecial(SalsaEspecial salsaEspecial){
        this.salsaEspecial = salsaEspecial;
        hamburguesa.agregarIngrediente(salsaEspecial);
    }

    @Override
    public void setLechuga(Lechuga lechuga){
        this.lechuga = lechuga;
        hamburguesa.agregarIngrediente(lechuga);
    }

    @Override
    public void setTomate(Tomate tomate){
        this.tomate = tomate;
        hamburguesa.agregarIngrediente(tomate);
    }

    @Override
    public void setNuevoIngrediente(){
        // Implementación para agregar un nuevo ingrediente
    }

    @Override
    public Hamburguesa build() {
        return hamburguesa;
    }
}
