package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gg, mm, aa;

        System.out.print("Inserisci il giorno: ");
        gg = input.nextInt();

        System.out.print("Inserisci il mese: ");
        mm = input.nextInt();

        System.out.print("Inserisci l'anno: ");
        aa = input.nextInt();

        Data data = new Data(gg, mm, aa);

        System.out.println("Il mese " + data.nomeMese(mm) + " ha " + data.numeroGiorni(mm) + " giorni");
        System.out.println("Dalla data impostata a fine anno mancano " + data.giorniFineAnno() + " giorni");

        if(data.annoBisestile()) {
            System.out.println("L'anno " + data.getAnno() + " e' bisestile.");
        } else {
            System.out.println("L'anno " + data.getAnno() + " NON e' bisestile.");
        }
    }
}
