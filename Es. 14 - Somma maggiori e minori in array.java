package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeri;
        int[] maggiori;
        int[] minori;

        int totNumeri = 50;
        numeri = new int[totNumeri];
        maggiori = new int[totNumeri];
        minori = new int[totNumeri];

        int sommaMaggiori = 0;
        int sommaMinori = 0;

        Random random = new Random();

        for (int i = 0; i < totNumeri; i++) {
            numeri[i] = random.nextInt(0, 100);
        }

        for (int i = 0; i < totNumeri; i++) {
            if (numeri[i] > 50) {
                maggiori[i] = numeri[i];
                sommaMaggiori = sommaMaggiori + numeri[i];
            } else {
                minori[i] = numeri[i];
                sommaMinori = sommaMinori + numeri[i];
            }
        }

        System.out.println("I numeri maggiori di 50 sono: " + Arrays.toString(maggiori) + " (somma: " + sommaMaggiori + ")");
        System.out.println("I numeri minori di 50 sono: " + Arrays.toString(minori) + " (somma: " + sommaMinori + ")");

        if (sommaMaggiori > sommaMinori) {
            System.out.println("La somma maggiore è quella dei numeri maggiori.");
        } else {
            System.out.println("La somma maggiore è quella dei numeri minori.");
        }
    }
}
