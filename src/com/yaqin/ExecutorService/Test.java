package com.yaqin.ExecutorService;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args){
        A r1=new A();
        Thread t1 =new Thread(r1);
        // this will call run() method
        System.out.println(r1.getMethod());
        //t1.start();

    }

    public String runSameTime(){
        String result = "";
        ExecutorService es = Executors.newFixedThreadPool(2);
        return result;
    }
    static class A implements Runnable{
        public String getMethod(){
            return "A.getMethod";
        }

        @Override
        public void run() {
            System.out.println("Thread A is running...");
        }
    }

    class B implements Runnable{
        public String getMethod(){
            return "B.getMethod";
        }

        @Override
        public void run() {
            System.out.println("Thread B is running...");
        }
    }
}


