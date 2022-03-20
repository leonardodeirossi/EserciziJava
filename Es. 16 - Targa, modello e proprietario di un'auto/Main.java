package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean arrayCaricati = false;
    public static String[] vettoreTarghe;
    public static String[] vettoreModelli;
    public static String[] vettoreProprietari;

    public static void main(String[] args) {
        int maxValori = 100;

        vettoreTarghe = new String[maxValori];
        vettoreModelli = new String[maxValori];
        vettoreProprietari = new String[maxValori];

        menuPrincipale();
    }

    public static void menuPrincipale() {
        Scanner input = new Scanner(System.in);

        System.out.println("Sistema informativo della motorizzazione");
        System.out.println("----------------------------------------");
        System.out.println("Seleziona l'opzione desiderata:");
        System.out.println("     1. Carica i dati nel sistema");
        System.out.println("     2. Ordina i dati in base alla targa");
        System.out.println("     3. Cerca veicoli per cognome del proprietario");
        System.out.println("     4. Stampa i dati già salvati (x debug)");

        System.out.println("");
        System.out.print("Seleziona opzione: ");
        int opzioneScelta = input.nextInt();

        switch (opzioneScelta) {
            case 1:
                caricaArrayVeicoli(vettoreTarghe, vettoreModelli, vettoreProprietari);
            case 2:
                ordinaDatiTarga();
            case 3:
                cercaPerCognome();
            case 4:
                stampaTutto();
        }
    }

    public static void cercaPerCognome() {
        if (arrayCaricati == true) {
            Scanner input = new Scanner(System.in);
            String cognome;

            System.out.print("Inserisci il cognome da cercare: ");
            cognome = input.nextLine();

            int[] arrayCorrispondenze;
            arrayCorrispondenze = new int[vettoreModelli.length];

            int totaleCorrispondenze;
            totaleCorrispondenze = 0;

            for (int i = 0; i < vettoreProprietari.length; i++) {
                if (vettoreProprietari[i] == cognome) {
                    arrayCorrispondenze[i] = 1;
                    totaleCorrispondenze++;
                } else {
                    arrayCorrispondenze[i] = 0;
                }
            }

            if (totaleCorrispondenze > 0) {
                for (int j = 0; j < arrayCorrispondenze.length; j++) {
                    if (arrayCorrispondenze[j] == 1) {
                        System.out.println("Modello: " + vettoreModelli[j] + " - Targa: " + vettoreTarghe[j]);
                    }
                }
            } else {
                System.out.println("Nessuna corrispondenza trovata.");
            }
        } else {
            System.out.println("Non sono presenti dati nel sistema.");
        }

        menuPrincipale();
    }

    public static void ordinaDatiTarga() {
        if (arrayCaricati == true) {
            int i, j;
            String tempTarga, tempModello, tempProprietario;

            for (i = 0; i < vettoreTarghe.length - 1; i++) {
                for (j = i + 1; j < vettoreTarghe.length; j++) {
                    tempTarga = vettoreTarghe[i];
                    tempModello = vettoreModelli[i];
                    tempProprietario = vettoreProprietari[i];

                    vettoreTarghe[i] = vettoreTarghe[j];
                    vettoreTarghe[j] = tempTarga;

                    vettoreModelli[i] = vettoreModelli[j];
                    vettoreModelli[j] = tempModello;

                    vettoreProprietari[i] = vettoreProprietari[j];
                    vettoreProprietari[j] = tempProprietario;
                }
            }

            menuPrincipale();
        } else {
            System.out.println("Non sono presenti dati nel sistema.");
            menuPrincipale();
        }
    }

    public static void caricaArrayVeicoli(String[] targhe, String[] modelli, String[] proprietari) {
        Scanner input = new Scanner(System.in);
        int maxValori = targhe.length;

        for (int i = 0; i < maxValori; i++) {
            System.out.print("Inserisci la targa del " + (i + 1) + "° veicolo: ");
            targhe[i] = input.nextLine();

            System.out.print("Inserisci il modello del " + (i + 1) + "° veicolo: ");
            modelli[i] = input.nextLine();

            System.out.print("Inserisci il cognome del " + (i + 1) + "° veicolo: ");
            proprietari[i] = input.nextLine();
        }

        arrayCaricati = true;
        menuPrincipale();
    }

    public static void stampaTutto() {
        System.out.println(Arrays.toString(vettoreTarghe));
        System.out.println(Arrays.toString(vettoreModelli));
        System.out.println(Arrays.toString(vettoreProprietari));

        menuPrincipale();
    }
}

