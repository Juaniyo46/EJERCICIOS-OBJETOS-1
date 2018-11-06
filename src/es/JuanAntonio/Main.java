package es.JuanAntonio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Password p1 = new Password(30);


        System.out.println(p1.getPassword());

        System.out.println(p1.esFuerte());

       /* Password p2 = new Password();

        p2.setLongitud(9);
        String pass = p2.generateRandom(p2.getLongitud());
        p2.setPassword(p2.generateRandom(p2.getLongitud()));
        System.out.println(p2);*/

    }


}
