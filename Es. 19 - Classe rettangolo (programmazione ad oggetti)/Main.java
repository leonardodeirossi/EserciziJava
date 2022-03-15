package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Dichiarazione delle variabili
        float base1, altezza1, base2, altezza2;
        float perimetro1, area1, perimetro2, area2;

        Scanner input = new Scanner(System.in);

        /* Raccolta dati - 1° rettangolo */
        System.out.print("Inserisci la base del primo rettangolo: ");
        base1 = input.nextFloat();

        System.out.print("Inserisci l'altezza del primo rettangolo: ");
        altezza1 = input.nextFloat();

        /* Raccolta dati - 2° rettangolo */
        System.out.print("Inserisci la base del secondo rettangolo: ");
        base2 = input.nextFloat();

        System.out.print("Inserisci l'altezza del secondo rettangolo: ");
        altezza2 = input.nextFloat();

        // Assegnazione delle variabili - creazione istanza classe "Rettangolo"
        Rettangolo r1 = new Rettangolo(base1, altezza1);
        Rettangolo r2 = new Rettangolo(base2, altezza2);

        /* Calcolo - 1° rettangolo */
        perimetro1 = r1.perimetro();
        area1 = r1.area();

        System.out.println("Il perimetro del primo rettangolo é " + perimetro1 + " cm e l'area è " + area1);

        /* Calcolo - 2° rettangolo */
        perimetro2 = r2.perimetro();
        area2 = r2.area();

        System.out.println("Il perimetro del primo rettangolo é " + perimetro2 + " cm e l'area è " + area2);
    }
}
