package main.java.edu.dosw.lab.estructurales.reto5;

public abstract class ToppingDecorator {
    protected Cafe cafe;
    
    public ToppingDecorator(Cafe cafe) {
        this.cafe = cafe;
    }
    
    
    public double obtenerPrecio() {
        return cafe.obtenerPrecio();
    }
}