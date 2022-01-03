package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float costoFisso = (float) 0.10;
        float tariffaNormale = (float) 0.15;
        float tariffaOltre80 = (float) 0.09;
        float costoTotale = (float) 0.00;

        int secondi;
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero di secondi: ");
        secondi = input.nextInt();

        int secondiInseriti = 0;

        while(secondiInseriti < secondi) {
            if(secondiInseriti > 80) {
                costoTotale = costoTotale + tariffaOltre80;
            } else {
                costoTotale = costoTotale + tariffaNormale;
            }

            secondiInseriti = secondiInseriti + 1;
        }

        costoTotale = costoTotale + costoFisso;

        System.out.println("Il costo della telefonata è " + costoTotale + "€");
    }
}
