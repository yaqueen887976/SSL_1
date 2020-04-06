package com.yaqin.OOP;

public class VisaCard extends CreditCard{

    public VisaCard(String holderName, String cardNumber,long accountBalance, String cardType){
        super(holderName,cardNumber,accountBalance,cardType);
    }
    @Override
    boolean isCardAcceptable(String cardType) {
        boolean result = false;
        if(cardType =="VisaCard"){
            result =  true;
        };
        return result;
    }
}
