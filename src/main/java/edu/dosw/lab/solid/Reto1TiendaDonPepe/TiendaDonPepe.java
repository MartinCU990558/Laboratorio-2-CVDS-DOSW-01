package edu.dosw.lab.solid.Reto1TiendaDonPepe;

    public class TiendaDonPepe {


        public void ejecutar(Producto camiseta, Producto pantalon, Producto galletas, Producto jugo,
                             Cliente cliente, Carrito carrito) {


            carrito.agregarProducto(camiseta, 2);
            carrito.agregarProducto(galletas, 3);
            carrito.agregarProducto(jugo, 5);

            Recibo.imprimir(carrito, cliente);
        }
    }