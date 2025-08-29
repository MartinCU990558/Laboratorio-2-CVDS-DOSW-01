package edu.dosw.lab;

import edu.dosw.lab.comportamiento.reto1.Reto1;
import edu.dosw.lab.comportamiento.reto7.Reto7;
import edu.dosw.lab.comportamiento.reto4.Reto4;
import edu.dosw.lab.creacionales.reto2.Reto2;
import edu.dosw.lab.creacionales.reto3.Reto3;
import edu.dosw.lab.estructurales.reto5.Reto5;
import edu.dosw.lab.comportamiento.reto6.Reto6;

public class Application {
    public static void main(String[] args) {
        System.out.println("™ Proyecto Maven configurado y corriendo correctamente");
        Reto1.ejecutar();
        Reto2.run();
        Reto3.run();
        Reto4.run();
        Reto5.ejecutar();
        Reto6.ejecutar();
        Reto7.ejecutar();
    }
}
