package edu.dosw.lab;
import edu.dosw.lab.comportamiento.HablaConSoporteTecnico.SoporteTecnico;
import edu.dosw.lab.creacionales.ChefDeCincoEstrellasReto2.ChefDeCincoEstrellas;
import edu.dosw.lab.creacionales.ReinoDeLosVehiculos.ReinoDeLosVehiculos;
import edu.dosw.lab.solid.Reto1TiendaDonPepe.*;
import edu.dosw.lab.comportamiento.CasaDeCambioReto4.CasaDeCambio;
import edu.dosw.lab.estructurales.CafePersonalizado.CafePersonalizadoClase;
import edu.dosw.lab.comportamiento.ControlRemotoMagicoReto7.ControlRemotoMagico;

public class Application {
    public static void main(String[] args) {
        System.out.println("✅ Proyecto Maven configurado y corriendo");


        // Ejecución del reto 1 Tienda Don Pepe

        /**Producto camiseta = new Producto("Camiseta", 20000);
        Producto pantalon = new Producto("Pantalón", 50000);
        Producto galletas = new Producto("Galletas", 500);
        Producto jugo = new Producto("Jugo Natural", 3000);

        Cliente cliente = new ClienteFrecuente("Frecuente");
        Carrito carrito = new Carrito();

        TiendaDonPepe tienda = new TiendaDonPepe();
        tienda.ejecutar(camiseta, pantalon, galletas, jugo, cliente, carrito);


        // Ejecución del reto 2
        ChefDeCincoEstrellas hamburguesas = new ChefDeCincoEstrellas();
        hamburguesas.ejecutar();

        // Ejecución del reto 3 Reino de los Vehículos
        ReinoDeLosVehiculos reinoVehiculos = new ReinoDeLosVehiculos();
        reinoVehiculos.ejecutar();


        // Ejecución RETO4 casa de cambio
        CasaDeCambio cambio = new CasaDeCambio();
        cambio.ejecutar();


        // Ejecución del reto 5 cafe personalizado
        CafePersonalizadoClase cafe = new CafePersonalizadoClase();
        cafe.ejecutar();**/

         ControlRemotoMagico controlMagico = new ControlRemotoMagico();
         controlMagico.ejecutar();

        // Ejecución del reto 6 Soporte Técnico
        SoporteTecnico soporteTecnico = new SoporteTecnico();
        soporteTecnico.ejecutar();

    }

}