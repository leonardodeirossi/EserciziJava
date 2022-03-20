package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int numero1, numero2;
        int temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        numero1 = input.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        numero2 = input.nextInt();

        temp = numero1;
        numero1 = numero2;
        numero2 = temp;

        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);
    }
}
