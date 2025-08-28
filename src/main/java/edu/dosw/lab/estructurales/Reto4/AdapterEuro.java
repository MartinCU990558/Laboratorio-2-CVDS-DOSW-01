package edu.dosw.lab.estructurales;

public class AdapterEuro implements ConverterInterface {
    private ConversionEuro conversionEuro;
    
    public AdapterEuro() {
        this.conversionEuro = new ConversionEuro();
    }
    
    @Override
    public double convertMoney(String targetCurrency, double amount) {
        if ("COP".equals(targetCurrency)) {
            return conversionEuro.euroToCop(amount);
        } else if ("USD".equals(targetCurrency)) {
            return conversionEuro.euroToDollar(amount);
        } else if ("JPY".equals(targetCurrency)) {
            return conversionEuro.euroToYen(amount);
        } else if ("EUR".equals(targetCurrency)) {
            return amount; 
        }else{
            return 0;
        }
    }
}
