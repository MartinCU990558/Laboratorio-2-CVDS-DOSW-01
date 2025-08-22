package main.java.edu.dosw.lab.estructurales.reto5;
public class Menta extends ToppingDecorator{
    public Menta(Cafe cafe) {
            super(cafe);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public double obtenerPrecio() {
        return 1300;
    }
}
