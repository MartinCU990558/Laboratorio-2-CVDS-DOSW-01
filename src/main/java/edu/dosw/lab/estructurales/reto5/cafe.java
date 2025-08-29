package edu.dosw.lab.estructurales.reto5;

class Cafe implements Topping {
    @Override
    public String getDescrip() {
        return "Café";
    }

    @Override
    public int getPrecio() {
        return 3000; 
    }
}
