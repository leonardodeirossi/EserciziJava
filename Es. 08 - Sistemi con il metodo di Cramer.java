package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a, b, c;
        float a1, b1, c1;
        float ds, dx, dy;
        float x, y;

        Scanner input = new Scanner(System.in);

        // Prima equazione
        System.out.print("Inserisci il coefficiente a della prima equazione: ");
        a = input.nextInt();

        System.out.print("Inserisci il coefficiente b della prima equazione: ");
        b = input.nextInt();

        System.out.print("Inserisci il coefficiente c della prima equazione: ");
        c = input.nextInt();

        // Seconda equazione
        System.out.print("Inserisci il coefficiente a della seconda equazione: ");
        a1 = input.nextInt();

        System.out.print("Inserisci il coefficiente b della seconda equazione: ");
        b1 = input.nextInt();

        System.out.print("Inserisci il coefficiente c della seconda equazione: ");
        c1 = input.nextInt();


        ds = (a * b1) - (a1 * b);
        dx = (c * b1) - (c1 * b);
        dy = (a * c1) - (a1 * c);

        if(ds == 0 && dx == 0) {
            System.out.println("Il sistema è indeterminato.");
        }

        if(ds == 0 && dx != 0) {
            System.out.println("Il sistema è impossibile.");
        }

        if(ds != 0) {
            x = dx / ds;
            y = dy / ds;

            System.out.println("Il valore di x è: " + x);
            System.out.println("Il valore di y è: " + y);
        }
    }
}
