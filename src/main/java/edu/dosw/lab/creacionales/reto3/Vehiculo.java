package edu.dosw.lab.creacionales.reto3;

public abstract class Vehiculo {
     protected String velocidadMax;
     protected double precio;
     protected String Descripcion;

     public abstract MedioTransporte getMedioTransporte();

     public double getPrecio() {
          return precio;
     }
     public String getDescripcion() {
          return Descripcion;
     }
     public String getVelocidadMax() {
          return velocidadMax;
     }

}
