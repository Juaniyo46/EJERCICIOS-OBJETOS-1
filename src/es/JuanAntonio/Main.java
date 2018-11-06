package es.JuanAntonio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Persona p = new Persona ("Juan", 25, 'H');

        String dni = p.generaDNI();

        System.out.println(p);
        System.out.println(dni);*/

        Scanner sc = new Scanner(System.in);


        System.out.println("Introduzca el nombre");
        String name = sc.next();

        System.out.println("Introduzca la edad");
        int age = sc.nextInt();

        System.out.println("Introduzca el sexo H o M");
        char sex = sc.next().charAt(0);

        System.out.println("Introduzca el peso");
        double weight = sc.nextDouble();

        System.out.println("Introduzca la altura");
        double height = sc.nextDouble();

        Persona p1 = new Persona(name, age, sex, weight, height);
        Persona p2 = new Persona(name, age, sex);
        Persona p3 = new Persona();
                p3.setNombre("Juan");
                p3.setEdad(23);
                p3.setSexo('H');
                p3.setPeso(77);
                p3.setAltura(1.79);


        System.out.println(p1.getNombre());
        p1.calcularIMC();

        p2.setAltura(1.68);
        p2.setPeso(70);
        System.out.println(p2.getNombre());
        p2.calcularIMC();
        System.out.println(p3.getNombre());
        p3.calcularIMC();

        System.out.println(p1.getNombre());
        p1.esMayorDeEdad();
        System.out.println(p2.getNombre());
        p2.esMayorDeEdad();
        System.out.println(p3.getNombre());
        p3.esMayorDeEdad();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);





    }


}
