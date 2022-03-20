package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero1, numero2, numero3;
        int maggiore, minore, differenza;

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        numero1 = input.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        numero2 = input.nextInt();

        System.out.print("Inserisci il terzo numero: ");
        numero3 = input.nextInt();

        if(numero1 > numero2 && numero1 > numero3) {
            maggiore = numero1;
        } else {
            if(numero2 > numero1 && numero2 > numero3) {
                maggiore = numero2;
            } else {
                maggiore = numero3;
            }
        }

        if(numero1 < numero2 && numero1 < numero3) {
            minore = numero1;
        } else {
            if(numero2 < numero1 && numero2 < numero3) {
                minore = numero2;
            } else {
                minore = numero3;
            }
        }

        differenza = maggiore - minore;

        System.out.println("Il numero maggiore è : " + maggiore);
        System.out.println("Il numero minore è : " + minore);
        System.out.println("La differenza è : " + differenza);
    }
}
