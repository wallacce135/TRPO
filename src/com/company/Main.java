package com.company;

public class Main {

    public static void main(String[] args) {
	    A a = new A();
        C c = new C(new A(), a, new B(new B(a)));
    }
}
