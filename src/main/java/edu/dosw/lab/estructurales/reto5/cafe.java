package edu.dosw.lab.estructurales.reto5;

public class Cafe implements Topping {
    @Override
    public String getDescrip() {
        return "Café";
    }

    @Override
    public int getPrecio() {
        return 3000; 
    }
}
