package edu.dosw.lab.estructurales.reto5;

public class CafeBase implements Cafe {
    @Override
    public String getDescripcion() {
        return "Café base";
    }

    @Override
    public int getPrecio() {
        return 3000;
    }
}
