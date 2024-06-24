package wallet;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private static final Map<Currency,Double>exchangeRate = new HashMap<>();

    static{
        exchangeRate.put(Currency.IND,1.00);
        exchangeRate.put(Currency.USD,0.012);
        exchangeRate.put(Currency.GBP, 0.0094);
    }

    public static double convert(double amount, Currency sourceCurrency, Currency destinationCurrency){
        double sourceRate = exchangeRate.get(sourceCurrency);
        double targetRate = exchangeRate.get(destinationCurrency);
        return (amount*sourceRate)/targetRate;
    }
}
