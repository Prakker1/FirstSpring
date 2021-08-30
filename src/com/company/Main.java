package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String name = "Kiss";
        String name2 = "András";
        int kor = 11;
        int magasság = 165;

        System.out.println(name + " " + name2);
        System.out.println(kor);
        System.out.println(magasság);

        String[] kosár = {"alma", "körte", "barack", "szilva", "banán"};

        if (kosár.length > 5) {

            System.out.println("if is yes");
            for (int i = 0; i < kosár.length; i++) {
                System.out.print(kosár[i] + ", ");
            }
        } else {
            System.out.println("if is no");
        }

        Methods x = new Methods();
        x.osszead(1, 4);

        x.kiir("Fuck Yeah");
        x.kivon(55, 10);
        x.answer("zöld");

        List<String> szavak = new ArrayList<>();
        szavak.add("sajt");
        szavak.add("ezer");
        szavak.add("karika");

        System.out.println(szavak.get(1));


        alapmuveletek y = new alapmuveletek();
        y.osszead(5, 5);
        y.answer("kék");

        y.floop(10);


        Human Lajos = new Human();
        Lajos.setAge(11);
        Lajos.setEyeColor("brown");
        Lajos.setHairColor("brown");

        System.out.println(Lajos.getAge());

    }
}
