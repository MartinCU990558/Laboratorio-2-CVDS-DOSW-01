package edu.dosw.lab.comportamiento.Reto4.Monedas;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Eur implements Moneda{
    private BigDecimal tasa = BigDecimal.valueOf(1.10);
    public String getNombre(){
        return "EUR";
    }

    public BigDecimal aUSD(BigDecimal valor){
        return valor.multiply(tasa);
    }
    public BigDecimal deUSd(BigDecimal valor){
        return valor.divide(tasa,3, RoundingMode.HALF_UP);
    }
}
