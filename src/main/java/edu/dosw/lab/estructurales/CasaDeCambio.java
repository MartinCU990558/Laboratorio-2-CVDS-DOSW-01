package edu.dosw.lab.estructurales;

import java.util.*;

public class CasaDeCambio {
    private AdapterConversion conversionService;
    
    public CasaDeCambio() {
        this.conversionService = new AdapterConversion();
    }
    
    public static void main(String[] args) {
        CasaDeCambio casaDeCambio = new CasaDeCambio();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese número de transacciones: ");
        int numTransactions = scanner.nextInt();
        scanner.nextLine(); 
        List<Integer> transactionIds = new ArrayList<>();
        List<String> sourceCurrencies = new ArrayList<>();
        List<Double> sourceAmounts = new ArrayList<>();
        List<Map<String, Double>> conversionsPerTransaction = new ArrayList<>();
        
        for (int i = 1; i <= numTransactions; i++) {
            System.out.println("\n--- Transacción " + i + " ---");
            
            System.out.print("Ingrese monto: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); 
            
            System.out.print("Ingrese moneda de origen (USD, EUR, JPY, COP): ");
            String sourceCurrency = scanner.nextLine().toUpperCase();
            
            System.out.print("Ingrese monedas destino (separadas por coma, ej: USD,JPY): ");
            String[] targetCurrencies = scanner.nextLine().toUpperCase().split(",");
            
            // Guardar información básica de la transacción
            transactionIds.add(i);
            sourceCurrencies.add(sourceCurrency);
            sourceAmounts.add(amount);
            
            // Mapa para almacenar las conversiones de esta transacción
            Map<String, Double> transactionConversions = new HashMap<>();
            
            for (String targetCurrency : targetCurrencies) {
                String trimmedCurrency = targetCurrency.trim();
                Transaction transaction = casaDeCambio.conversionService.convertMoney(sourceCurrency, trimmedCurrency, amount);
                transactionConversions.put(trimmedCurrency, transaction.getConvertedAmount());
            }
            
            conversionsPerTransaction.add(transactionConversions);
        }
        
        for (int i = 0; i < transactionIds.size(); i++) {
            System.out.println("\nTransacción " + transactionIds.get(i) + ": " + 
                              sourceAmounts.get(i) + " " + sourceCurrencies.get(i));
            
            Map<String, Double> conversions = conversionsPerTransaction.get(i);
            for (Map.Entry<String, Double> conversion : conversions.entrySet()) {
                System.out.println("    Convertido a " + conversion.getKey() + ": " + 
                                  String.format("%.3f", conversion.getValue()) + " " + conversion.getKey());
            }
        }
        
        // Calcular totales usando streams
        System.out.println("\n--- Totales por moneda ---");
        Map<String, Double> totals = new HashMap<>();
        
        for (Map<String, Double> conversions : conversionsPerTransaction) {
            for (Map.Entry<String, Double> entry : conversions.entrySet()) {
                String currency = entry.getKey();
                Double amount = entry.getValue();
                totals.put(currency, totals.getOrDefault(currency, 0.0) + amount);
            }
        }
        
        for (Map.Entry<String, Double> entry : totals.entrySet()) {
            System.out.println(entry.getKey() + ": " + String.format("%.3f", entry.getValue()) + " " + entry.getKey());
        }
        
        scanner.close();
    }
}