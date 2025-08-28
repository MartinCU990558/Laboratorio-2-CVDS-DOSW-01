package edu.dosw.lab.solid.reto1;

public class Cliente {
    private String tipo;
    
    public Cliente(String tipo){
        this.tipo = tipo;
    }

    public static double calcularDescuento(String tipo) {
        if ("Nuevo".equalsIgnoreCase(tipo)) {
            return 0.05; 
        } else if ("Frecuente".equalsIgnoreCase(tipo)) {
            return 0.10; 
        }
        return 0.0;
    }
}
