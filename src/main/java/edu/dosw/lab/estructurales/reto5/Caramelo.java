package main.java.edu.dosw.lab.estructurales.reto5;

public class Caramelo extends ToppingDecorator{
    
    public Caramelo(Cafe cafe) {
            super(cafe);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public double obtenerPrecio() {
        return 1200;
    }
}
