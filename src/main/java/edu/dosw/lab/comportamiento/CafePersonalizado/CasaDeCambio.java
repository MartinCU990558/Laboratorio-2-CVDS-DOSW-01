package edu.dosw.lab.comportamiento.CafePersonalizado;

import java.util.*;

public class CasaDeCambio {

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        TransaccionService service = new TransaccionService();

        System.out.print("Ingrese número de transacciones: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Transacción " + i + " ---");

            System.out.print("Ingrese monto: ");
            double monto = sc.nextDouble();
            sc.nextLine();

            System.out.print("Ingrese moneda de origen (USD, EUR, JPY, COP): ");
            String origen = sc.nextLine().trim().toUpperCase();

            System.out.print("Ingrese monedas destino (separadas por coma): ");
            String[] destinos = sc.nextLine().split(",");

            Transaccion t = new Transaccion(i, monto, origen, Arrays.asList(destinos));
            service.agregarTransaccion(t);
        }

        service.procesarTransacciones();
    }
}
