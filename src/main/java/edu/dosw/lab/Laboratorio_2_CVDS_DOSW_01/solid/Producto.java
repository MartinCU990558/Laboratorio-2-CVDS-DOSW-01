public class Producto{
    private String nombreProducto;
    private final int precio;

    public Producto(int precio, String nombre){
        this.nombreProducto = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return this.nombreProducto;
    }
    public int getPrecio(){
        return this.precio;
    }
}