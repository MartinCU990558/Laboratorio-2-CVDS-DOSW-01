package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.Reto4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reto4 {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un numero de transacciones: ");
    int n = scanner.nextInt();

    Map<String, Double> totales = new HashMap<>();
        
    for(int i = 0; i < n; i++) {
        System.out.println("\n--- Transacción " + (i + 1) + "---");
        System.out.println("Ingrese monto: ");
        double monto = scanner.nextDouble();

        System.out.println("\nIngrese moneda de origen (USD, EUR, JPY, COP): ");
        String monedaOrigen = scanner.next();

        System.out.println("\nIngrese monedas destino (separadas por comas, ej: USD,JPY): ");
        String monedasDestino = scanner.next();
        String[] monedas = monedasDestino.split(",");
        
        ConversionStrategy strategy;
        switch (monedaOrigen) {
            case "USD":
                strategy = new USD();
                break;
            case "EUR":
                strategy = new EUR();
                break;
            case "JPY":
                strategy = new JPY();
                break;
            case "COP":
                strategy = new COP();
                break;
            default:
                System.out.println("\nMoneda de origen no soportada: " + monedaOrigen);
                continue;
        }

        System.out.println("\nTransaccion " + (i + 1) + ": " + monto + " " + monedaOrigen);

        for(String moneda : monedas) {
            double montoFinal= strategy.convertir(monto, moneda);
            System.out.println("Convertido a: " + moneda + ": " + montoFinal + " " + moneda);
            totales.put(moneda, totales.getOrDefault(moneda, 0.0) + montoFinal);
        }    
    }

    System.out.println("\n--- Totales por moneda ---");
    totales.entrySet().forEach(entry -> {
        System.out.println(entry.getKey() + ": " + entry.getValue() + " " + entry.getKey());
    });

    scanner.close();    
    }
}
