package edu.dosw.lab;

import edu.dosw.lab.creacionales.reto2.reto2;
import edu.dosw.lab.estructurales.reto5.reto5;

public class Application{
    private static reto2 reto2 = new reto2();
    private static reto5 reto5 = new reto5();
    public static void main (String [] args){
        System.out.println("Proyecto Maven configurado y corriendo correctamente");
        reto5.ejecutar();
        //reto2.ejecutar();
    }
}

