package edu.dosw.lab;

import edu.dosw.lab.creacionales.reto2.Reto2;
import edu.dosw.lab.estructurales.reto5.Reto5;
import edu.dosw.lab.comportamiento.reto6.Reto6;

public class Application {
    public static void main(String[] args) {
        System.out.println("™ Proyecto Maven configurado y corriendo correctamente");
        Reto2.run();
        Reto5.ejecutar();
        Reto6.ejecutar();
    }
}
