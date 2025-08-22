import java.util.*;

public class CarritoCompras{
    private float total;
    private float descuento;
    private Map<Producto,Integer> productosComprados;

    public CarritoCompras(){
        productosComprados = new HashMap<>();
    }

}