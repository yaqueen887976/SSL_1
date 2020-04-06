package com.yaqin.OOP;

public class MasterCard extends CreditCard{

    public MasterCard(String holderName, String cardNumber,long accountBalance, String cardType){
        super(holderName,cardNumber,accountBalance,cardType);

    }
    @Override
    boolean isCardAcceptable(String cardType) {
        boolean result = false;
        if(cardType =="MasterCard"){
            result =  true;
        };
        return result;
    }
}
