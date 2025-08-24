package edu.dosw.lab.creacionales.ReinoDeLosVehiculos;

public abstract class Vehiculo {

    protected String tipo;
    protected String categoria;
    protected String modelo;
    protected int velocidadMax;
    protected double precio;
    protected String equipamiento;

    public String getTipo() { return tipo; }
    public String getCategoria() { return categoria; }
    public String getModelo() { return modelo; }
    public int getVelocidadMax() { return velocidadMax; }
    public double getPrecio() { return precio; }
    public String getEquipamiento() { return equipamiento; }

    public abstract void configurar();
}
