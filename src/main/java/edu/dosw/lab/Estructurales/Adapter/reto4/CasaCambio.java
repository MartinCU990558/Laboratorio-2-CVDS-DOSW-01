package edu.dosw.lab.Estructurales.Adapter.reto4;

import java.util.*;
import java.util.stream.Collectors;

public class CasaCambio {
    private static ArrayList<Transaccion> transacciones;
    public static void main(String[] args) {
        transacciones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Bienvenido a la casa de cambio----");
        System.out.print("Por favor ingrese el número de transacciones: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= num; i++) {
            System.out.println("\n--- Transacción " + i + " ---");

            System.out.print("Ingrese monto: ");
            double monto = Double.parseDouble(scanner.nextLine());
            System.out.print("Ingrese moneda de origen (USD, EUR, JPY, COP): ");
            Moneda origen = Moneda.valueOf(scanner.nextLine().toUpperCase());

            System.out.print("Ingrese monedas destino (separadas por coma, o una sola): ");
            String[] destinos = scanner.nextLine().toUpperCase().split(",");

            ArrayList<Moneda> destinoList = Arrays.stream(destinos).map(String::trim).map(Moneda::valueOf).collect(Collectors.toCollection(ArrayList::new));
            Transaccion transaccion = new Transaccion(origen, monto, destinoList, i);
            transacciones.add(transaccion);
        }
        transacciones.forEach(System.out::println);

        System.out.println("---Totales por Moneda---");
        Map<Moneda, Double> totales = transacciones.stream().flatMap(t -> t.getValoresFinales().entrySet().stream()).collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.summingDouble(Map.Entry::getValue)));
        totales.forEach((moneda, valor) -> System.out.println(moneda + ": " + valor));
    }
}