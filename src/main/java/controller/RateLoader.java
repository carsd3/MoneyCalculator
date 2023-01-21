package controller;

import model.Currency;
import model.ExchangeRate;

import java.io.IOException;

public interface RateLoader {

    ExchangeRate rateLoader(Currency from, Currency to) throws IOException;
}
