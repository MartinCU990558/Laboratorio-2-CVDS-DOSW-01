package edu.dosw.lab.comportamiento.Reto7;


public class ReproductorMusica {
    private boolean reproduciendo;
    private int volumen;
    private String nombre;

    public ReproductorMusica(String nombre) {
        this.nombre = nombre;
        this.reproduciendo = false;
        this.volumen = 50;
    }

    public void reproducir() {
        this.reproduciendo = true;
        System.out.println(nombre + " reproduciendo música");
    }

    public void detener() {
        this.reproduciendo = false;
        System.out.println(nombre + " detenido");
    }

    public void ajustarVolumen(int nivel) {
        this.volumen = Math.max(0, Math.min(100, nivel));
        System.out.println(nombre + " volumen ajustado a: " + volumen + "%");
    }

    public int getVolumen() {
        return volumen;
    }

    public boolean estaReproduciendo() {
        return reproduciendo;
    }

    public String getEstado() {
        return reproduciendo ? "Reproduciendo (Volumen: " + volumen + "%)" : "Detenido";
    }

    public String getNombre() {
        return nombre;
    }
}