package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String parola;
        char letteraTemp;

        int totVocali, totConsonanti;
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci la parola da analizare: ");
        parola = input.nextLine();

        // char[] arrayParola = new char[parola.length()];
        char[] arrayVocali = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

        int i;
        totVocali = 0;
        totConsonanti = 0;

        for (i = 0; i < parola.length(); i++) {
            letteraTemp = parola.charAt(i);

            if (contains(letteraTemp, arrayVocali)) {
                totVocali = totVocali + 1;
            } else {
                totConsonanti = totConsonanti + 1;
            }
        }

        System.out.println("La parola è composta da " + totVocali + " vocali e da " + totConsonanti + " consonanti.");
    }

    static boolean contains(char c, char[] array) {
        for (char x : array) {
            if (x == c) {
                return true;
            }
        }
        return false;
    }
}
