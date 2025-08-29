package edu.dosw.lab.comportamiento.Reto4.Monedas;

import java.math.BigDecimal;

public class Usd implements Moneda{
    public String getNombre(){
        return "USD";
    }

    public BigDecimal aUSD(BigDecimal valor){
        return valor;
    }
    public BigDecimal deUSd(BigDecimal valor){
        return valor;
    }
}
