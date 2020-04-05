package com.yaqin.Java8_1;

public class TestCard {
    public static void main(String[] args){
        //Test for master card
        MasterCard masterCard = new MasterCard();
        double payBill = masterCard.payBill(100);
        double mRefund = MasterCard.refund(1000);
        System.out.println("This is master card payBill: "+payBill+"\n"
        +"This is Master Card Refund: "+mRefund);

        //Test for Visa card
        VisaCard visaCard = new VisaCard();
        double payBill2 = visaCard.payBill(200);
        double mRefund2 = visaCard.refund(2000);
        System.out.println("This is visa card payBill: "+payBill2+"\n"
                +"This is Visa Card Refund: "+mRefund2);


    }
}
