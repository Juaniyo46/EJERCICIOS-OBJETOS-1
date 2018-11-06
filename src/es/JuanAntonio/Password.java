package es.JuanAntonio;

import java.security.SecureRandom;
import java.util.Random;

public class Password {
    final String characters = "0123456789ABCDEFGHIJQLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    SecureRandom rnd = new SecureRandom();

    private int longitud = 8;
    private String password;

    public Password() {
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.password  = generateRandom(this.longitud);
    }

    public String generateRandom(int longitud){

        StringBuilder pass = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++){
            pass.append(characters.charAt(rnd.nextInt(characters.length())));
        } return pass.toString();

    }


    public String getCharacters() {
        return characters;
    }

    public SecureRandom getRnd() {
        return rnd;
    }

    public void setRnd(SecureRandom rnd) {
        this.rnd = rnd;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Password{" +
                "longitud=" + longitud +
                ", password='" + password + '\'' +
                '}';
    }

    public boolean esFuerte(){
        boolean fuerte = getPassword().length() >= 11;

        if (fuerte){
            int uppers = 0;
            int lowers = 0;
            int digits = 0;
            for (int i = 0; i <getPassword().length() -1; i++) {
               if (Character.isUpperCase(getPassword().charAt(i))) uppers++;
               if (Character.isLowerCase(getPassword().charAt(i))) lowers++;
               if (Character.isDigit(getPassword().charAt(i))) digits++;
            }
            if ( uppers <= 2 || lowers <= 1 || digits <= 5 ) fuerte = false;
        }
        return fuerte;
    }
}
