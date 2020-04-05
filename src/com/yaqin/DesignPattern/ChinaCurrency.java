package com.yaqin.DesignPattern;

public class ChinaCurrency extends Currency {
    ChinaCurrency() {
        super(Country.CHINA);
        exchange();
    }
    @Override
    protected void exchange() {
        System.out.println("China Currency is: 0.14");
    }
}
