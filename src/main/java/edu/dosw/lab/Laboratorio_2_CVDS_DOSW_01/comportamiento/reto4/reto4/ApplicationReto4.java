package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto4;

import java.util.*;

public class ApplicationReto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();
        List<String> history = new ArrayList<>();
        List<Double> totals = new ArrayList<>();

        System.out.println("Bienvenido a la Casa de Cambio!");

        boolean keep = true;
        while (keep) {
            System.out.print("\nIngrese cantidad en USD: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            System.out.println("Seleccione moneda destino:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. JPY");
            System.out.println("4. COP");
            System.out.print("Opción: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> converter.setStrategy(new UsdConversion());
                case 2 -> converter.setStrategy(new EurConversion());
                case 3 -> converter.setStrategy(new JpyConversion());
                case 4 -> converter.setStrategy(new CopConversion());
                default -> throw new IllegalArgumentException("Opción inválida");
            }

            double result = converter.execute(amount);
            String line = amount + " USD = " + String.format("%,.2f", result) + " " + converter.getTargetCurrency();
            System.out.println(line);

            history.add(line);
            totals.add(result);

            System.out.print("¿Desea realizar otra conversión? (s/n): ");
            String resp = sc.nextLine();
            keep = resp.equalsIgnoreCase("s");
        }

        double totalConverted = totals.stream().mapToDouble(Double::doubleValue).sum();
        ConversionReceipt.print(history, totalConverted);
    }
}
