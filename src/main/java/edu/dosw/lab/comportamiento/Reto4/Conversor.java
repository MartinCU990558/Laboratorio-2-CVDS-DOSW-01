package edu.dosw.lab.comportamiento.Reto4;

import edu.dosw.lab.comportamiento.Reto4.Monedas.Moneda;

import java.math.BigDecimal;

public  class  Conversor {

    public BigDecimal convertir(BigDecimal num, Moneda origen, Moneda destino) {
        BigDecimal usd = origen.aUSD(num);
        return destino.deUSd(usd);
    }


}
