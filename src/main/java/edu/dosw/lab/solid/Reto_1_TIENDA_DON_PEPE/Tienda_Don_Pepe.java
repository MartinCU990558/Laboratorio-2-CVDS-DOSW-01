package edu.dosw.lab.solid.Reto_1_TIENDA_DON_PEPE;

    public class Tienda_Don_Pepe {


        public void ejecutar() {
            Producto camiseta = new Producto("Camiseta", 20000);
            Producto pantalon = new Producto("Pantalón", 50000);
            Producto galletas = new Producto("Galletas", 500);
            Producto jugo = new Producto("Jugo Natural", 3000);

            Cliente cliente = new Cliente_Frecuente("Frecuente");

            Carrito carrito = new Carrito();
            carrito.agregarProducto(camiseta, 2);
            carrito.agregarProducto(galletas, 3);
            carrito.agregarProducto(jugo, 5);

            Recibo.imprimir(carrito, cliente);
        }
    }