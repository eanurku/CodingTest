package com.anurag.singleton.problem01;

class Singleton{
    public  String str;
    private Singleton() {
    }
    public static  Singleton getSingleInstance(){
        return new Singleton();
    }
}

public class SingletonDesignPattern {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getSingleInstance();
        Singleton instance2 = Singleton.getSingleInstance();
        instance1.str="ewdew";
        instance2.str="e";
        System.out.println(instance2.str);

    }
}
