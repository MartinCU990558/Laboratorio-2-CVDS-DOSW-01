package edu.dosw.lab;

import edu.dosw.lab.creacionales.reto3.reto3;
import edu.dosw.lab.estructurales.reto5.reto5;


public class Application{
    private static reto3 reto3 = new reto3();
    private static reto5 reto5 = new reto5();
    public static void main (String [] args){
        System.out.println("Proyecto Maven configurado y corriendo correctamente");
        reto3.ejecutar();
        reto5.ejecutar();
        //reto2.ejecutar();
    }
}

