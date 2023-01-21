package controller.rest;

import model.Currency;
import model.ExchangeRate;
import controller.RateLoader;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class RateLoaderClass implements RateLoader {
    @Override
    public ExchangeRate rateLoader(Currency from, Currency to) throws IOException {
        return new ExchangeRate(from, to, read(from.getCode(), to.getCode()));
    }
    private double read(String from, String to) throws IOException {
        double rate;
        String u = "https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/" + from + "/" + to + ".json";
        String line = readURL(new URL(u));
        return Double.parseDouble(getStringRateFromJSONLine(line));
    }

    private String readURL(URL url) throws IOException {
        InputStream input = url.openStream();
        byte[] buffer = new byte[1024];
        int length = input.read(buffer);
        return new String(buffer, 1, length);
    }

    private String getStringRateFromJSONLine(String line) {
        return line.split("\": ")[2].substring(0, 8);
    }

}
