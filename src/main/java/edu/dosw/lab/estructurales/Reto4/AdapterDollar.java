package edu.dosw.lab.estructurales.Reto4;
public class AdapterDollar implements ConverterInterface {
    private ConversionDollar conversionDollar;
    
    public AdapterDollar() {
        this.conversionDollar = new ConversionDollar();
    }
    
    @Override
    public double convertMoney(String targetCurrency, double amount) {
        if ("COP".equals(targetCurrency)) {
            return conversionDollar.dollarToCop(amount);
        } else if ("EUR".equals(targetCurrency)) {
            return conversionDollar.dollarToEuro(amount);
        } else if ("JPY".equals(targetCurrency)) {
            return conversionDollar.dollarToYen(amount);
        } else if ("USD".equals(targetCurrency)) {
            return amount; 
        }else{
            return 0;
        }
    }
}
