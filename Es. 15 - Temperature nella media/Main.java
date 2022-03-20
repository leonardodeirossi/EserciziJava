package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroTemperature = 10;
        float[] temperature = new float[numeroTemperature];
        float media = 0.0F;
        float sommaTemperature = 0.0F;
        int sottoMedia = 0;

        int i = 0;
        while (i < numeroTemperature) {
            System.out.print("Inserisci la temperatura da registrare: ");
            temperature[i] = input.nextFloat();

            i++;
        }

        for (int j = 0; j < numeroTemperature; j++) {
            sommaTemperature = sommaTemperature + temperature[j];
        }

        media = sommaTemperature / numeroTemperature;

        for (int k = 0; k < numeroTemperature; k++) {
            if (temperature[k] < media) {
                sottoMedia = sottoMedia + 1;
                System.out.println("Il giorno " + (k + 1) + " è sotto la media con una temperatura di " + temperature[k]);
            }
        }

        System.out.println("Il numero di temperature sotto la media è " + sottoMedia + " (media: " + media + ")");
    }
}
