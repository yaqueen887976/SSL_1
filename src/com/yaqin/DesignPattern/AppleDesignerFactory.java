package com.yaqin.DesignPattern;

public class AppleDesignerFactory {

    private static AppleDesignerFactory instance;

    private AppleDesignerFactory(){
        System.out.println("Create an instance of AppleDesignerFactory");
    }
    //thread safe
    public static AppleDesignerFactory getInstance(){
        if(instance == null){
            synchronized (AppleDesignerFactory.class){
                if(instance == null){
                    instance = new AppleDesignerFactory();
                }
            }
        }
        return instance;
    }
}
