package com.company;

public class Methods {

    public Methods() {
    }

    public void kiir(String x) {
        System.out.println("A kiírt szöveg: " + x);
    }

    public void kivon(int a, int b) {
        System.out.println(a - b);
    }

    public String answer(String question) {
        String x = "Tedd fel a kérdést";
        if (question.equals("kék")) {
            System.out.println(" Az ég kék");
        } else {
            System.out.println("rosszul tetted fel a kérdést");
        }
        return x;
    }

    public void osszead(int a, int b) {
        System.out.println(a + b);
    }

}
