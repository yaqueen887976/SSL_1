package com.yaqin.DesignPattern;

public class CanadaCurrency extends Currency {
    CanadaCurrency() {
        super(Country.CANADA);
        exchange();
    }
    @Override
    protected void exchange() {
        System.out.println("Canada Currency is: 0.7");
    }
}
