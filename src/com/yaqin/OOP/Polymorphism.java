package com.yaqin.OOP;

public class Polymorphism {
    public void method1() { System.out.println("ohlllalalalalalaoaoaoa"); }

}

class Subclass extends  Polymorphism{
    //dynamic
    @Override
    public void method1() { System.out.println("Hello"); }

    //static
    public void method1(String addSomething) {
       System.out.println("Hello "+addSomething);
    }

}

