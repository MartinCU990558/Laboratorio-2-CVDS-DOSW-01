package edu.dosw.lab;

import edu.dosw.lab.comportamiento.ChainOfResponsibility.reto6.Reto6;
import edu.dosw.lab.creacionales.FactoryMethod.ReinoVehiculos;
import edu.dosw.lab.solid.reto1.TiendaDonPepe;
import edu.dosw.lab.creacionales.Builder.reto2.Compra;

public class Application {
    public static void main(String[] args) {
        System.out.println("Proyecto Maven configurado y corriendo completamente");

        TiendaDonPepe.ejecutar();
        Compra.ejecutar();
        ReinoVehiculos.ejecutar();
        edu.dosw.lab.Estructurales.Adapter.reto4.CasaCambio.ejecutar();
        edu.dosw.lab.Estructurales.Decorator.reto5.TiendaCafe.ejecutar();
        Reto6.ejecutar();
    }
}
