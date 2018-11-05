package es.JuanAntonio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Antonio", 100);
         cuenta.retirar(30);
        System.out.println(cuenta.getCantidad());


    }


}
