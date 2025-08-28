package edu.dosw.lab.estructurales;

public class AdapterCOP implements ConverterInterface {
    private ConversionCop conversionCop;
    
    public AdapterCOP() {
        this.conversionCop = new ConversionCop();
    }
    
    @Override
    public double convertMoney(String targetCurrency, double amount) {
        if ("USD".equals(targetCurrency)) {
            return conversionCop.copToDollar(amount);
        } else if ("EUR".equals(targetCurrency)) {
            return conversionCop.copToEuro(amount);
        } else if ("JPY".equals(targetCurrency)) {
            return conversionCop.copToYen(amount);
        } else if ("COP".equals(targetCurrency)) {
            return amount; 
        }else{
            return 0;
        }
    }
}
