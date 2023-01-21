package model;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class Currency {
    private String name;
    private String code;
    private String symbol;

    public Currency(String code, String name, String symbol) {
        this.name = name;
        this.code = code;
        this.symbol = symbol;
    }
    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public String getSymbol() {
        return this.symbol;
    }

/*    public String getRate(Currency firstCurrenct, Currency secondCurrency) throws IOException {
         String urlString = "https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/" + firstCurrenct.getCode() + "/" + secondCurrency.getCode() + ".json";
         URL url = new URL(urlString);
         URLConnection conn = url.openConnection();
         InputStream is = conn.getInputStream();
         String text = new String(is.readAllBytes(), StandardCharsets.UTF_8);
         return text.split("\": ")[2].substring(0, 8);
    }
*/
}
