package edu.dosw.lab.Comportamiento.Reto7;

public class Volumen {

    private int nivel = 0;
    public String ajustar(int v) {
        nivel = v;
        return "Volumen ajustado a " + nivel + "%";
    }
    public String resetear() {
        nivel = 0;
        return "Volumen regresado a 0%";
    }
}
