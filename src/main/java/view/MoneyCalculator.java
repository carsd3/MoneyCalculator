package view;

import model.Currency;
import model.ExchangeRate;
import controller.file.CurrencyLoaderFromFile;
import controller.rest.RateLoaderClass;

import java.io.IOException;
import java.util.List;

public class MoneyCalculator {
    public static void main(String[] args) throws IOException {
        /*
        CurrencyLoaderFromFile loader = new CurrencyLoaderFromFile("currencies");
        List<Currency> list = loader.loadCurrencies();
        for (Currency c : list) {
            System.out.println(c.getName() + " - " + c.getCode() + " - " + c.getSymbol());
        }

        RateLoaderClass rateLoader = new RateLoaderClass();

        for (Currency from : list) {
            for (Currency to : list) {
                if (!from.getCode().equals(to.getCode())) {
                    ExchangeRate rate = rateLoader.rateLoader(from, to);
                    System.out.println("1 " + from.getCode() + " = " + rate.getRate() + " " + to.getCode());
                }
            }
        }
        */
        View v = new View();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }
}
