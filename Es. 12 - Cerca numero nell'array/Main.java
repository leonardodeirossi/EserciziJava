package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numeri;
        numeri = new int[15];

        int numeroInput;
        int totVolteNumero;
        Scanner input = new Scanner(System.in);

        Random random = new Random();

        int i;
        // Caricamento dell'array
        for (i = 0; i < 15; i++) {
            int numero = random.nextInt();
            numeri[i] = numero;
        }


        System.out.print("Inserisci il numero da cercare: ");
        numeroInput = input.nextInt();

        totVolteNumero = 0;

        for (i = 0; i < 15; i++) {
            int numeroTemp = numeri[i];

            if (numeroTemp == numeroInput) {
                totVolteNumero = totVolteNumero + 1;
            }
        }

        if (totVolteNumero > 0) {
            System.out.println("Il numero inserito è presente " + totVolteNumero + " volte");
        } else {
            System.out.println("Il numero inserito non è presente.");
        }
    }
}
