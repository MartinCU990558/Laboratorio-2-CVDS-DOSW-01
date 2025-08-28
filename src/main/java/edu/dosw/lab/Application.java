package edu.dosw.lab;

import edu.dosw.lab.creacionales.reto2.reto2;
import edu.dosw.lab.creacionales.reto3.reto3;
import edu.dosw.lab.estructurales.reto5.reto5;
import edu.dosw.lab.comportamiento.Reto7.reto7;
import edu.dosw.lab.comportamiento.Reto6.reto6;
import edu.dosw.lab.comportamiento.Reto4.reto4;


public class Application{
    private static reto7 reto7 = new reto7();
    private static reto2 reto2 = new reto2();
    private static reto5 reto5 = new reto5();
    private static reto3 reto3 = new reto3();
    private static reto6 reto6 = new reto6();
    private static reto4 reto4 = new reto4();
    public static void main (String [] args){
        System.out.println("Proyecto Maven configurado y corriendo correctamente");
        reto3.ejecutar();
        reto5.ejecutar();
        reto7.ejecutar();
        reto2.ejecutar();
        reto6.ejecutar();
        reto4.ejecutar();
    }
}

