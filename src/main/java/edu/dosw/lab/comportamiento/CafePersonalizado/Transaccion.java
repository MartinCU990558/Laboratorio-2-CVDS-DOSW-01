package edu.dosw.lab.comportamiento.CafePersonalizado;

import java.util.List;

public class Transaccion {
    int id;
    double monto;
    String origen;
    List<String> destinos;

    public Transaccion(int id, double monto, String origen, List<String> destinos) {
        this.id = id;
        this.monto = monto;
        this.origen = origen;
        this.destinos = destinos;
    }

    public int getId() { return id; }
    public double getMonto() { return monto; }
    public String getOrigen() { return origen; }
    public List<String> getDestinos() { return destinos; }
}

