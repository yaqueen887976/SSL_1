package com.yaqin.DesignPattern;

public class TestCountryCurrency {
    public static void main(String[] args) {
        System.out.println(CurrencyExchange.currencyExchange(Country.CANADA));
        System.out.println(CurrencyExchange.currencyExchange(Country.CHINA));
        System.out.println(CurrencyExchange.currencyExchange(Country.UK));
    }
}
