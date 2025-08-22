package main.java.edu.dosw.lab.estructurales.reto5;
public class Leche extends ToppingDecorator{
    public Leche(Cafe cafe) {
            super(cafe);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public double obtenerPrecio() {
        return 1000;
    }
}
