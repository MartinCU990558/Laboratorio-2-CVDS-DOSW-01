package edu.dosw.lab.estructurales;
import java.util.*;
public class AdapterConversion {
    private Map<String,ConverterInterface> adaptersToConvert;
    public AdapterConversion(){
        adaptersToConvert = new HashMap<>();
        adaptersToConvert.put("COP", new AdapterCOP());
        adaptersToConvert.put("USD", new AdapterDollar());
        adaptersToConvert.put("EUR", new AdapterEuro());
        adaptersToConvert.put("JPY", new AdapterYen());
    }

    public Transaction convertMoney(String actualCurrency, String currencyToConvert,double amount){
        ConverterInterface adapter = adaptersToConvert.get(actualCurrency);
        double convertedAmount = adapter.convertMoney(currencyToConvert, amount);
        return new Transaction(actualCurrency,amount,convertedAmount);
    }
    
}
