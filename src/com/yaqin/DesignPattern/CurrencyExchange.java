package com.yaqin.DesignPattern;

public class CurrencyExchange {
    public static Currency currencyExchange(Country country) {
        Currency currency = null;
        switch (country) {
            case CHINA:
                currency = new ChinaCurrency();
                break;

            case CANADA:
                currency = new CanadaCurrency();
                break;

            case UK:
                currency = new UKCurrency();
                break;

            default:
                // throw some exception
                break;
        }
        return currency;
    }
}