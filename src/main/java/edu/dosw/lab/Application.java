package edu.dosw.lab;

import edu.dosw.lab.solid.reto1;
import edu.dosw.lab.creacionales.Builder.reto2;
import edu.dosw.lab.creacionales.FactoryMethod;
import edu.dosw.lab.Estructurales.Adapter.reto4;
import edu.dosw.lab.Estructurales.Decorator.reto5;
import edu.dosw.lab.comportamiento.ChainOfResponsibility.reto6;

public class Application {
    public static void main(String[] args) {
        System.out.println("Proyecto Maven configurado y corriendo completamente");

        TiendaDonPepe.ejecutar();
        Compra.ejectuar();
        ReinoVehiculos.ejecutar();
        CasaCambio.ejecutar();
        TiendaCafe.ejecutar();
        Reto6.ejecutar();
    }
}
