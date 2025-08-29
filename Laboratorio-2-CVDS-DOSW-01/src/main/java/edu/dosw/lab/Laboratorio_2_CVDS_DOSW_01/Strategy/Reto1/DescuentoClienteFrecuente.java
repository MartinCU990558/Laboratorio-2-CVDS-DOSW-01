package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Strategy.Reto1;

public class DescuentoClienteFrecuente implements EstrategiaDescuento {
    @Override
    public double aplicarDescuento(double total) {
        return total * 0.10; 
    }
}