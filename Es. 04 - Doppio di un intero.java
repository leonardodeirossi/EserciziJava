package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int numero, doppio;
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero da moltiplicare: ");
        numero = input.nextInt();

        doppio = numero * 2;

        System.out.println("Il doppio di " + numero + " è " + doppio);
    }
}
