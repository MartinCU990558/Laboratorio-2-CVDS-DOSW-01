package edu.dosw.lab.creacionales.Reto3AbstractFactory;

public abstract class Vehiculo{
    protected String tipo;
    protected String categoria;
    protected String velocidadMax;
    protected double precio;
    protected String equipamentoEspecial;

    public String getTipo() {return tipo;}
    public String getCategoría(){return categoria;}
    public String getVelocidadMax(){return velocidadMax;}
    public double getPrecio(){return precio;}
    public String getEquipamentoEspecial(){return equipamentoEspecial;}

    @Override
    public String toString() {
        return tipo + " | Categoría: " + categoria +
                " | Vel. Máx: " + velocidadMax + " km/h" +
                " | Precio: " + precio + " | Equipamiento: " + equipamentoEspecial;
    }

    public String getCategoria() {
        return categoria;
    }
}
