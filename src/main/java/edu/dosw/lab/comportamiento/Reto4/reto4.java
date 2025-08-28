package edu.dosw.lab.comportamiento.Reto4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class reto4 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        ConversorMonedas conversor1 = new ConversorMonedas();
        List<Transaccion> lista = new ArrayList<>();

        System.out.print("Numero de transacciones: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Transaccion " + (i + 1) + ":");
            System.out.print("Monto: ");
            double monto = sc.nextDouble();
            sc.nextLine();
            System.out.print("Moneda origen (USD,EUR,JPY,COP): ");
            String de = sc.nextLine().toUpperCase();

            System.out.print("Monedas destino (separadas por comas): ");
            String destinos = sc.nextLine().toUpperCase();

            lista.addAll(
                    Stream.of(destinos.split(","))
                            .map(String::trim)
                            .map(destino -> new Transaccion(de, destino, monto, conversor1))
                            .peek(t -> System.out.println(t.getConvertido() + " " + t.getDestino()))
                            .collect(Collectors.toList())
            );
        }
        Map<String, Double> totalesPorMoneda =
                lista.stream().collect(Collectors.groupingBy(
                        Transaccion::getDestino,
                        Collectors.summingDouble(Transaccion::getConvertido)
                ));

        System.out.println("\nTotal convertido por cada moneda destino:");
        totalesPorMoneda.forEach((moneda, total) ->
                System.out.println(moneda + ": " + total)
        );
    }
}