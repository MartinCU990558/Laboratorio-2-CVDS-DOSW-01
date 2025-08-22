package main.java.edu.dosw.lab.estructurales.reto5;
public class CremaBatida extends ToppingDecorator{
    public CremaBatida(Cafe cafe) {
            super(cafe);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public double obtenerPrecio() {
        return 2000;
    }
}
