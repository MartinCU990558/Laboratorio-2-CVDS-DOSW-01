package edu.dosw.lab.comportamiento.reto4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Reto4 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        List<Transaction> transactions = new ArrayList<>();

        System.out.print("Ingrese número de transacciones: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("---- Transacción " + i + " ----");
            System.out.print("Ingrese monto: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Ingrese moneda de origen (USD, EUR, JPY, COP): ");
            String source = sc.nextLine().trim().toUpperCase();

            System.out.print("Ingrese monedas destino (separadas por coma): ");
            String[] targets = sc.nextLine().trim().toUpperCase().split(",");

            transactions.add(new Transaction(amount, source, Arrays.asList(targets)));
        }

        ExchangeService service = new ExchangeService(new StandardConversion());
        service.processTransactions(transactions);
    }
}
