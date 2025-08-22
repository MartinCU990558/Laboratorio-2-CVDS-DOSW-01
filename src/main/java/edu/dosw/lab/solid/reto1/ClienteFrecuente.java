package edu.dosw.lab.solid.reto1;

public class ClienteFrecuente implements Descuento {
    private String nombre;
    private boolean clienteFrecuente;

    public ClienteFrecuente(String nombre, boolean clienteFrecuente) {
        this.nombre = nombre;
        this.clienteFrecuente = clienteFrecuente;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isClienteFrecuente() {
        return clienteFrecuente;
    }

    public void setClienteFrecuente() {
        this.clienteFrecuente = true;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return 0;
    }



}
