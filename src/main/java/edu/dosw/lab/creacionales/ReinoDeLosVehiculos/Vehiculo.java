package edu.dosw.lab.creacionales.ReinoDeLosVehiculos;

public abstract class Vehiculo {

    protected String tipo;
    protected String categoria;
    protected String modelo;
    protected int velocidadMax;
    protected double precio;
    protected String equipamiento;

    public Vehiculo (String tipo, String categoria, String modelo) {
        this.tipo = tipo;
        this.categoria = categoria;
        this.modelo = modelo;
    }
    public String getCategoria() { return categoria; }
    public String getModelo() { return modelo; }
    public int getVelocidadMax() { return velocidadMax; }
    public double getPrecio() { return precio; }
    public String getEquipamiento() { return equipamiento; }

    public void setVelocidadMax(int velocidadMax) { this.velocidadMax = velocidadMax; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setEquipamiento(String equipamiento) { this.equipamiento = equipamiento; }

    public abstract void configurar();
}
