package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Dichiarazione delle variabili
        float base1, altezza1, base2, altezza2;
        float perimetro1, area1, perimetro2, area2;

        Scanner input = new Scanner(System.in);

        // Assegnazione delle variabili - creazione istanza classe "Rettangolo"
        Rettangolo r1 = new Rettangolo();
        Rettangolo r2 = new Rettangolo();

        /* 1° rettangolo */
        System.out.print("Inserisci la base del primo rettangolo: ");
        base1 = input.nextFloat();

        System.out.print("Inserisci l'altezza del primo rettangolo: ");
        altezza1 = input.nextFloat();

        r1.setBase(base1);
        r1.setAltezza(altezza1);

        perimetro1 = r1.perimetro();
        area1 = r1.area();

        System.out.println("Il perimetro del primo rettangolo é " + perimetro1 + " cm e l'area è " + area1);

        /* 2° rettangolo */
        System.out.print("Inserisci la base del secondo rettangolo: ");
        base2 = input.nextFloat();

        System.out.print("Inserisci l'altezza del secondo rettangolo: ");
        altezza2 = input.nextFloat();

        r2.setBase(base2);
        r2.setAltezza(altezza2);

        perimetro2 = r2.perimetro();
        area2 = r2.area();

        System.out.println("Il perimetro del primo rettangolo é " + perimetro2 + " cm e l'area è " + area2);
    }
}


public class Rettangolo {
    private float base;
    private float altezza;

    public float getBase() {
        return base;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public float perimetro() {
        return (base * 2) + (altezza * 2);
    }

    public float area() {
        return base * altezza;
    }
}
