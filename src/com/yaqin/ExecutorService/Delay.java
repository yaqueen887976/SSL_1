package com.yaqin.ExecutorService;

public class Delay {
    public void delay(long ms) {
        try{
            Thread.sleep(ms);
        }catch(InterruptedException e){}
    }
}
