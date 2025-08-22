package edu.dosw.lab.Solid.Reto1;

/**
 * Hace referencia a los productos de la tienda de don Pepe.
 */
public class Producto {
    private final String nombreProducto;
    private final double precioProducto;

    /**
     * Método constructor de la clase Producto.
     * @param nombreProducto
     * @param precioProducto
     */
    public Producto(String nombreProducto, double precioProducto){
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }
    public String getNombreProducto(){
        return nombreProducto;
    }
    public double getPrecioProducto(){
        return precioProducto;
    }
}
