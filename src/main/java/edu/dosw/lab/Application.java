package edu.dosw.lab;

import edu.dosw.lab.comportamiento.Reto4.CasaDeCambio;
import edu.dosw.lab.creacionales.Reto2.Reto2Chef;

public class Application {
    public static void main(String[] args) {
        System.out.println("Proyecto Maven  configurado y corriendo");
        Reto2Chef.ejecutarPedido();
        CasaDeCambio.ejecutar();


    }
}
