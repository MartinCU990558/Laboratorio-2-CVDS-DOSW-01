import java.util.*;

public class Tienda{
    private List<Producto> productosDisponibles;

    public void crearProducto(String nombre, int precio){
        new Producto(precio,nombre);
    }

    public static void main(String[] args) {
    }
}