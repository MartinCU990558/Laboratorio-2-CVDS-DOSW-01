package edu.dosw.lab.comportamiento.Reto7;


public class Luz {
    private boolean encendida;
    private int brillo;
    private String nombre;

    public Luz(String nombre) {
        this.nombre = nombre;
        this.encendida = false;
        this.brillo = 50;
    }

    public void encender() {
        this.encendida = true;
        System.out.println(nombre + " encendida");
    }

    public void apagar() {
        this.encendida = false;
        System.out.println(nombre + " apagada");
    }

    public void ajustarBrillo(int nivel) {
        this.brillo = Math.max(0, Math.min(100, nivel));
        System.out.println(nombre + " brillo ajustado a: " + brillo + "%");
    }

    public int getBrillo() {
        return brillo;
    }

    public boolean estaEncendida() {
        return encendida;
    }

    public String getEstado() {
        return encendida ? "Encendida (Brillo: " + brillo + "%)" : "Apagada";
    }

    public String getNombre() {
        return nombre;
    }
}