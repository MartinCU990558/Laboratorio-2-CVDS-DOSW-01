package edu.dosw.lab.Solid.Reto1;

public class DescuentoFe implements Descuentos{

    @Override

    public  double aplicarDescuento(double subtotal) {
        return subtotal * 0.5;
    }
}
