package controller.file;

import model.Currency;
import controller.CurrencyLoader;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CurrencyLoaderFromFile implements CurrencyLoader {
    private final String file;

    public CurrencyLoaderFromFile(String file) {
        this.file = file;
    }

    @Override
    public List<Currency> loadCurrencies() {
        List<Currency> list = new ArrayList<Currency>();
        try {
            IteratorReader reader = new IteratorReader(new BufferedReader(new FileReader(this.file)));
            Iterator<String> it = reader.iterator();
            while (it.hasNext()) {
                String line = it.next();
                list.add(currencyOf(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("persistence.file.CurrencyLoaderFromFile/loadCurrencies: File Not Found");
        } catch (IOException e) {
            System.out.println("persistence.file.CurrencyLoaderFromFile/loadCurrencies: IOException");
        }
        return list;
    }

    public Currency currencyOf(String curr) {
        String[] data = curr.split(",");
        return new Currency(data[0], data[1], data[2]);
    }
}
