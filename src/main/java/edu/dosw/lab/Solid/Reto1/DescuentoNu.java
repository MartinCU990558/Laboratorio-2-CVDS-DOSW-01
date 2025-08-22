package edu.dosw.lab.Solid.Reto1;

public class DescuentoNu implements Descuentos{

    @Override

    public  double aplicarDescuento(double subtotal) {
        return subtotal * 0.10;
    }
}

