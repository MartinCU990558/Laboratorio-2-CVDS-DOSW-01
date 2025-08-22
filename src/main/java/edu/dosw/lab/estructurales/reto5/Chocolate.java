package main.java.edu.dosw.lab.estructurales.reto5;
public class Chocolate extends ToppingDecorator{
    public Chocolate(Cafe cafe) {
            super(cafe);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public double obtenerPrecio() {
        return 1500;
    }
}
