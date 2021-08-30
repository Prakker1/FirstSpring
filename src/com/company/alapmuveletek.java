package com.company;

public class alapmuveletek extends Methods {
    public alapmuveletek() {
    }

    public void kivon(int a, int b) {
        System.out.println(a - b);
    }

    public void szorzas(int a, int b) {
        System.out.println(a * b);
    }

    public void osztas(int a, int b) {
        System.out.println(a / b);
    }

    public void floop(int size) {

        for (int i = 0; i < size; i++) {
            System.out.println(i + 1 + " a ciklus futás");

        }

    }

}
