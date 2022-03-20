package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float resto, dueEuro, unEuro, cinquantaCent, ventiCent, dieciCent, cinqueCent, dueCent, unCent;
        int totDueEuro, totUnEuro, totCinquantaCent, totVentiCent, totDieciCent, totCinqueCent, totDueCent, totUnCent;

        Scanner input = new Scanner(System.in);

        dueEuro = 2;
        unEuro = 1;
        cinquantaCent = (float) 0.5;
        ventiCent = (float) 0.2;
        dieciCent = (float) 0.1;
        cinqueCent = (float) 0.05;
        dueCent = (float) 0.02;
        unCent = (float) 0.01;

        totDueEuro = 0;
        totUnEuro = 0;
        totCinquantaCent = 0;
        totVentiCent = 0;
        totDieciCent = 0;
        totCinqueCent = 0;
        totDueCent = 0;
        totUnCent = 0;

        System.out.print("Inserisci il resto: ");
        resto = input.nextFloat();

        while (resto >= dueEuro) {
            resto = resto - dueEuro;
            totDueEuro = totDueEuro + 1;
        }

        while (resto >= unEuro) {
            resto = resto - unEuro;
            totUnEuro = totUnEuro + 1;
        }

        while (resto >= cinquantaCent) {
            resto = resto - cinquantaCent;
            totCinquantaCent = totCinquantaCent + 1;
        }

        while (resto >= ventiCent) {
            resto = resto - ventiCent;
            totVentiCent = totVentiCent + 1;
        }

        while (resto >= dieciCent) {
            resto = resto - dieciCent;
            totDieciCent = totDieciCent + 1;
        }

        while (resto >= cinqueCent) {
            resto = resto - cinqueCent;
            totCinqueCent = totCinqueCent + 1;
        }

        while (resto >= dueCent) {
            resto = resto - dueCent;
            totDueCent = totDueCent + 1;
        }

        if (resto >= unCent) {
            resto = resto - unCent;
            totUnCent = totUnCent + 1;
        }


        System.out.println("Monete 2€: " + totDueEuro);
        System.out.println("Monete 1€: " + totUnEuro);
        System.out.println("Monete 0.5€: " + totCinquantaCent);
        System.out.println("Monete 0.20€: " + totVentiCent);
        System.out.println("Monete 0.10€: " + totDieciCent);
        System.out.println("Monete 0.05€: " + totCinqueCent);
        System.out.println("Monete 0.02€: " + totDueCent);
        System.out.println("Monete 0.01€: " + totUnCent);

        System.out.println("Nota: se manca qualcosa sono le commissioni :)");
    }
}
