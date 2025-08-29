package edu.dosw.lab.comportamiento.Reto4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reto4LaEstafaDeLaCasaDeCambio {
    public static void ejecutar() {
        ContextoNavegador contexto = new ContextoNavegador();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero de transacciones: ");
        int times = scanner.nextInt();
        scanner.nextLine();
        HashMap<String, Double> cambio = new HashMap<>();
        for (int i = 1; i <= times; i++) {
            System.out.println("--- Transaccion " + i + " ---");
            System.out.println("Ingrese monto: ");
            double monto = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Ingrese moneda de origen (USD, EUR, JPY, COP): ");
            String monedaOrigen = scanner.nextLine();
            System.out.println("Ingrese monedas destino (separadas por coma, ej: USD, JPY): ");
            String monedasDestino = scanner.nextLine();
            List<String> ingreso = Arrays.stream(monedasDestino.split(","))
                    .map(String::trim)
                    .collect(Collectors.toList());
            switch (monedaOrigen) {
                case "COP":
                    contexto.setStrategyTasa(new PesoColombiano());
                    break;
                case "USD":
                    contexto.setStrategyTasa(new Dolar());
                    break;
                case "JPY":
                    contexto.setStrategyTasa(new Yen());
                    break;
                case "EUR":
                    contexto.setStrategyTasa(new Euro());
                    break;
                default:
                    break;
            }
            for (String monedaDestino : ingreso) {
                double conversion = contexto.tasaReal(monto, monedaDestino);
                System.out.println("Convertido a: " + monedaDestino + ": " + conversion + " " + monedaDestino);
                cambio.merge(monedaDestino, conversion, Double::sum);
            }
        }
        System.out.println("--- Totales por Moneda ---");
        for (Map.Entry<String, Double> entry : cambio.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " " + entry.getKey());
        }
        scanner.close();
    }
}
