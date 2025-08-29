package edu.dosw.lab.comportamiento.Punto_6;
public enum Prioridad {
    baja(1), media(2), alta(3);
    
    private final int valor;
    
    Prioridad(int valor) {
        this.valor = valor;
    }
    
    public int getValor() {
        return valor;
    }
}
