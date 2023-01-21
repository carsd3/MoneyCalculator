package controller;

import model.Currency;

import java.util.List;

public interface CurrencyLoader {
    public List<Currency> loadCurrencies();
}
