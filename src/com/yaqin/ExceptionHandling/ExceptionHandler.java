package com.yaqin.ExceptionHandling;

public class ExceptionHandler {

    public Exception handleException(String cardType, String address) throws Exception {
        try{
            cardType ="AMEX";
            throw new CardTypeException();

        }catch(CardTypeException e ){
             e.getStackTrace();
        }

        try{
            if(address !="US"){
                throw new AddressException();
            }
        }catch(AddressException e ){
            e.getStackTrace();
        }
        throw new Exception();


    }

}
