package edu.dosw.lab.comportamiento.Reto7;


public class Puerta {
    private boolean abierta;
    private String nombre;

    public Puerta(String nombre) {
        this.nombre = nombre;
        this.abierta = false;
    }

    public void abrir() {
        this.abierta = true;
        System.out.println(nombre + " abierta");
    }

    public void cerrar() {
        this.abierta = false;
        System.out.println(nombre + " cerrada");
    }

    public boolean estaAbierta() {
        return abierta;
    }

    public String getEstado() {
        return abierta ? "Abierta" : "Cerrada";
    }

    public String getNombre() {
        return nombre;
    }
}