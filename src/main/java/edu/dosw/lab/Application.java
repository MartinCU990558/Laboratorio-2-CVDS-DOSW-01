package edu.dosw.lab;

import edu.dosw.lab.comportamiento.Comand.reto7.ControlRemotoMagicoMain;
import edu.dosw.lab.solid.reto1.TiendaDonPepe;
import edu.dosw.lab.creacionales.Builder.reto2.Compra;
import edu.dosw.lab.creacionales.FactoryMethod.ReinoVehiculos;
import edu.dosw.lab.estructurales.Decorator.reto5.*;
import edu.dosw.lab.comportamiento.ChainOfResponsibility.reto6.Reto6;
import edu.dosw.lab.estructurales.Adapter.reto4.CasaCambio;
import edu.dosw.lab.comportamiento.Comand.reto7.ControlRemotoMagicoMain;

public class Application {
    public static void main(String[] args) {
        System.out.println("Proyecto Maven configurado y corriendo completamente");

        TiendaDonPepe.ejecutar();
        Compra.ejecutar();
        ReinoVehiculos.ejecutar();
        CasaCambio.ejecutar();
        TiendaCafe.ejecutar();
        Reto6.ejecutar();
        ControlRemotoMagicoMain.ejecutar();
    }
}
