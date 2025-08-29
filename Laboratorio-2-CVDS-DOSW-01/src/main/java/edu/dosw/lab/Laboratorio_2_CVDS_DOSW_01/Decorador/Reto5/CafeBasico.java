package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Decorador.Reto5;

public class CafeBasico implements Cafe {
    @Override
    public String getDescripcion() {
        return "Café base";
    }

    @Override
    public double getPrecio() {
        return 4000;
    }
}

