package com.xlbs.dynamicproxy;

public class RealSubject  implements Subject,Subject2  {


    @Override
    public void rent() {
        System.out.println("I want to rent my house");
    }

    @Override
    public void hello(String str) {
        System.out.println("hello: " + str);
    }

    @Override
    public void hhhhhh() {
        System.out.println("hhhhhh");
    }

    @Override
    public void ggggg(String str) {
        System.out.println("ggggg");
    }
}
