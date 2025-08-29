package edu.dosw.lab.Creacionales.Reto3;

public abstract class Vehiculo {
    protected String tipo;
    protected  String catergoria;
    protected  String modelo;
    protected  double precio;
    protected  double velocidadMaxima;
    protected  String comodidad;
    protected  String equipamiento;



    public Vehiculo(String tipo, String catergotia, String comodidad, String modelo,String equipamiento, double precio, double velocidadMaxima) {

        this.tipo = tipo;
        this.catergoria = catergotia;
        this.comodidad = comodidad;
        this.modelo = modelo;
        this.precio = precio;
        this.velocidadMaxima = velocidadMaxima;
        this.equipamiento = equipamiento;


    }

    public abstract void mostrarInfo();

    public String getTipo() {

        return tipo;
    }

    public String getCatergoria() {
        return catergoria;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public String getComodidad() {
        return comodidad;
    }
    public String getEquipamiento() {
        return equipamiento;
    }


}
