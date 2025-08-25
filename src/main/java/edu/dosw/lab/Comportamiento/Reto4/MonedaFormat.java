package edu.dosw.lab.Comportamiento.Reto4;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Map;

public final class MonedaFormat {
    private static final Map<String, DecimalFormat> F = new HashMap<>();
    private static final DecimalFormat SIN_GRUPO;

    static {
        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator(',');
        s.setGroupingSeparator('.');

        F.put("USD", new DecimalFormat("#,##0.##", s));
        F.put("EUR", new DecimalFormat("#,##0.##", s));
        F.put("JPY", new DecimalFormat("#,##0",  s));
        F.put("COP", new DecimalFormat("#,##0",  s));

        SIN_GRUPO = new DecimalFormat("0.##", s);
    }

    public static String format(String moneda, BigDecimal valor) {
        return F.getOrDefault(moneda, F.get("USD")).format(valor);
    }
    public static String formatOriginal(BigDecimal valor) {
        return SIN_GRUPO.format(valor);
    }
}
