package Application;

public class CurrencyConverter {
    private final ExchangeRateProvider provider;

    public CurrencyConverter(ExchangeRateProvider provider) {
        this.provider = provider;
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        double rate = provider.getExchangeRate(fromCurrency, toCurrency);
        return amount * rate;
    }
}
