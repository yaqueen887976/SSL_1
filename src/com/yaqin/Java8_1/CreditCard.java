package com.yaqin.Java8_1;

public interface CreditCard {
    String holderName = "";
    long cardNumber = 0;
    long accountBalance = 0;
    String cardType = "";

    default double payBill(double bill) {
        return bill;
    }
    static double refund(double amount){
        return amount;
    }
    void isCardAcceptable(CreditCard cardType);
}
