package com.yaqin.DesignPattern;


public class UKCurrency extends Currency {
    UKCurrency() {
        super(Country.UK);
        exchange();
    }
    @Override
    protected void exchange() {
        System.out.println("UK Currency is: 1.23");
    }
}