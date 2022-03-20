package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int eta1, eta2, eta3, media;

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci la prima età: ");
        eta1 = input.nextInt();

        System.out.print("Inserisci la seconda età: ");
        eta2 = input.nextInt();

        System.out.print("Inserisci la terza età: ");
        eta3 = input.nextInt();

        media = (eta1 + eta2 + eta3) / 3;

        System.out.println("L'età media è: " + media);
    }
}
