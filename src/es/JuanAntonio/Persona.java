package es.JuanAntonio;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.reflect.Array;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public void calcularIMC (){
        double result = peso/Math.pow(altura,2);
        if (result<20){
            System.out.println(-1);
        } else if (result>=20&&result<=25) {
            System.out.println(0);
        }else if (result>25){
            System.out.println(1);
        }
    }

    public void esMayorDeEdad (){
            boolean mayor = false;
        if (edad>=18){
            mayor = true;
        }
        System.out.println(mayor);
    }

    public void comprobarSexo (char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            sexo = 'H';
        }
    }

    public String generaDNI(){
        int aleatorio = generaNumDni();
        char letra = generaLetraDni(aleatorio);
        String dni = ""+aleatorio + letra;
        System.out.println();
        return dni;

    }

    public int generaNumDni () {
        int aleatorio = (int) (Math.random()*99999999);
        return aleatorio;
    }

    public char generaLetraDni(int aleatorio){
        char[] letrasDni = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        int numLetra = aleatorio % 23;

        char letra = letrasDni [numLetra];
        return letra;

    }


}
