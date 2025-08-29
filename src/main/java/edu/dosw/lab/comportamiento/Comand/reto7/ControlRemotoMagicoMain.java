package edu.dosw.lab.comportamiento.Comand.reto7;

import java.util.Scanner;

public class ControlRemotoMagicoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControlRemotoMagico control = new ControlRemotoMagico();

        System.out.println("=== CONTROL REMOTO MÁGICO ===\n");

        control.registrarAcciones(4, scanner);

        control.mostrarHistorialCompleto();

        control.investigarDesconfigurador();

        scanner.close();
    }
}