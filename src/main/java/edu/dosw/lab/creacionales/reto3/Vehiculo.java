package edu.dosw.lab.creacionales.reto3;

public class Vehiculo {
    public String modelo;
    public String medio;
    public String categoria;
    public int velocidad;
    public double precio;
    public String equipamiento;

    public Vehiculo(String modelo, String medio, String categoria, int velocidad, double precio, String equipamiento){
        this.modelo = modelo;
        this.medio = medio;
        this.categoria = categoria;
        this.velocidad = velocidad;
        this.precio = precio;
        this.equipamiento = equipamiento;
    }

    @Override
    public String toString() {
        return "Vehículo: " + modelo + "\n" +
            "Categoria:" + categoria + "\n" +
            "Precio: $" + precio + "\n" + "Velocidad:" + velocidad + "\n" + "Equipamiento:" + equipamiento ;
    }

    public double getPrecio(){
        return precio;
    }

}
