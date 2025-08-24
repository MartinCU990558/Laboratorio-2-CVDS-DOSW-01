package edu.dosw.lab.solid.Reto1;

public enum TipoCliente {
    FRECUENTE(0.1),
    NUEVO(0.5);

    private final double valor;

    TipoCliente(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
