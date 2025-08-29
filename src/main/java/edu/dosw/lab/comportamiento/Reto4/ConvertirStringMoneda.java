package edu.dosw.lab.comportamiento.Reto4;

import edu.dosw.lab.comportamiento.Reto4.Monedas.Moneda;

import java.lang.reflect.InvocationTargetException;

public class ConvertirStringMoneda {
    public Moneda convertirMoneda(String moneda) {
        String moneda2 = moneda.substring(0, 1).toUpperCase()+moneda.substring(1).toLowerCase();
        try {
            Class<?> clase = Class.forName("edu.dosw.lab.comportamiento.Reto4.Monedas." + moneda2);
            Object obj = clase.getDeclaredConstructor().newInstance();
            return (Moneda) obj;
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
