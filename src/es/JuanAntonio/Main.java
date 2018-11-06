package es.JuanAntonio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Libro book1 = new Libro(8545231454123L, "El libro perdido", "Pedro Gonzalez", 256);
        Libro book2 = new Libro(6234578412543L, "Don Quijote de la Mancha", "Miguel de Cervantes", 1500);

        System.out.println(book1);
        System.out.println(book2);

        if (book1.getNumPag()== book2.getNumPag()) System.out.println("Los libros tienen el mismo nuermo de páginas");
        else if (book1.getNumPag() > book2.getNumPag()) System.out.println(book1.getTitle() + " tiene más páginas");
        else if (book2.getNumPag() > book1.getNumPag()) System.out.println(book2.getTitle() + " tiene más páginas");
    }


}
