package edu.dosw.lab.comportamiento.Reto4.Monedas;

import java.math.BigDecimal;

public interface Moneda {
    String getNombre();
    BigDecimal aUSD(BigDecimal valor);
    BigDecimal deUSd(BigDecimal valor);
}
