package edu.dosw.lab.comportamiento.reto7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroAccion {
    private Command comando;
    private LocalDateTime tiempo;
    private String resultado;

    public RegistroAccion(Command comando, String resultado) {
        this.comando = comando;
        this.tiempo = LocalDateTime.now();
        this.resultado = resultado;
    }

    public Command getComando() {
        return comando;
    }

    public LocalDateTime getTiempo() {
        return tiempo;
    }

    public String getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return resultado + " - " + tiempo.format(formatter);
    }
}