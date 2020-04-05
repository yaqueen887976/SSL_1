package com.yaqin.Java8_1;

public class MasterCard implements CreditCard{
    public MasterCard(){}

    static double refund(double amount){
        return amount;
    }
    @Override
    public void isCardAcceptable(CreditCard cardType) {

    }
}
