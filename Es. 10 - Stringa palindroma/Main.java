package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String stringaOriginale, stringaInvertita = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci una parola o una frase: ");
        stringaOriginale = input.nextLine();

        int lunghezza = stringaOriginale.length();

        for (int i = lunghezza - 1; i >= 0; i--) {
            stringaInvertita = stringaInvertita + stringaOriginale.charAt(i);
        }

        if (stringaOriginale.equals(stringaInvertita)) {
            System.out.println("PALINDROMA");
        } else {
            System.out.println("NON PALINDROMA");
        }
    }
}
