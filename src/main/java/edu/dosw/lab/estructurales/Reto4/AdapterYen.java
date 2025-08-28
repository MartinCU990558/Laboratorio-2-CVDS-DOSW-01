package edu.dosw.lab.estructurales;

public class AdapterYen implements ConverterInterface {
    private ConversionYen conversionYen;

    public AdapterYen() {
        this.conversionYen = new ConversionYen();
    }
    
    @Override
    public double convertMoney(String targetCurrency, double amount) {
        if ("USD".equals(targetCurrency)) {
            return conversionYen.yenToDollar(amount);
        } else if ("EUR".equals(targetCurrency)) {
            return conversionYen.yenToEuro(amount);
        } else if ("COP".equals(targetCurrency)) {
            return conversionYen.yenToCop(amount);
        } else if ("JPY".equals(targetCurrency)) {
            return amount; 
        }else{
            return 0;
        }
    }
}
