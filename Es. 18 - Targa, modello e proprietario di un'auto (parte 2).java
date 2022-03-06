package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Dichiarazione delle variabili */
        String[] targhe;
        String[] modelli;
        String[] proprietari;

        int sceltaMenuPrincipale = 1;
        boolean scelta1 = false;
        int scelta2 = 0;
        int len = 100;
        int lenLogica = 0;
        int i;

        Scanner input = new Scanner(System.in);

        targhe = new String[len];
        modelli = new String[len];
        proprietari = new String[len];

        /* Menù principale */
        while (sceltaMenuPrincipale > 0 && sceltaMenuPrincipale <= 5) {
            if (scelta1 == false) {
                System.out.println("\nCosa si desidera fare");
                System.out.println("    1) Inserisci i dati nel sistema");
                System.out.println("    2) Ordina i vettori in base alla targa");
                System.out.println("    3) Trova i veicoli dato il proprietario");
                System.out.println("    4) Trova il proprietario data la targa");
                System.out.println("    5) Stampa a video i dati grezzi");
                System.out.println("    0) Esci dal programma");
                System.out.print("\nCosa si desidera fare: ");
                sceltaMenuPrincipale = input.nextInt();
            } else {
                sceltaMenuPrincipale = 1;
                scelta1 = false;
            }

            switch (sceltaMenuPrincipale) {
                case 1:
                    while (scelta2 < 1 || scelta2 > 2) {
                        System.out.println("Per inserire i dati di una persona premi 1, per un inserimento multiplo premi 2.");
                        System.out.print("Scelta: ");
                        scelta2 = input.nextInt();
                    }

                    if (scelta2 == 2) {
                        lenLogica = caricaArray(targhe, modelli, proprietari, len);
                    } else {
                        lenLogica = caricaSingolo(targhe, modelli, proprietari, len, lenLogica);
                    }

                    scelta2 = 0;

                    break;

                case 2:
                    if (riordinaLista(targhe, modelli, proprietari, lenLogica)) {
                        System.out.println("Vettori ordinati correttamente.");
                    } else {
                        System.out.println("Attenzione: non sono presenti dati nel sistema.");
                        System.out.println("Vuoi caricare i dati? (si/no)");
                        String sceltaStr = input.nextLine();
                        if (sceltaStr.equals("si")) {
                            scelta1 = true;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Inserisci il nome da cercare: ");
                    input = new Scanner(System.in);
                    String nome = input.nextLine();

                    int[] indiciProp = new int[lenLogica];

                    int logicaIndiciProprietario = cercaProprietario(proprietari, lenLogica, nome, indiciProp);

                    if (logicaIndiciProprietario == 0) {
                        System.out.println("Attenzione: nessun dato trovato.");
                    } else {
                        for (i = 0; i < logicaIndiciProprietario; i++) {
                            System.out.println((nome) + " ha il veicolo " + (modelli[indiciProp[i]]) + " con targa " + (targhe[indiciProp[i]]));
                        }
                    }
                    break;

                case 4:
                    System.out.print("Inserisci la targa da cercare: ");
                    input = new Scanner(System.in);
                    String targa = input.nextLine();

                    int[] indiciTar = new int[lenLogica];

                    int logicaIndiciTarghe = cercaTarga(targhe, targa, lenLogica, indiciTar);

                    if (logicaIndiciTarghe == 0) {
                        System.out.println("Attenzione: nessun dato trovato.");
                    } else {
                        for (i = 0; i < logicaIndiciTarghe; i++) {
                            System.out.println((targa) + " con proprietario " + (proprietari[indiciTar[i]]) + " e modello " + (modelli[indiciTar[i]]));
                        }
                    }
                    break;

                case 5:
                    stampaArray(targhe, modelli, proprietari, lenLogica);
                    break;

                case 0:
                    System.out.println("Grazie e arrivederci");
            }
        }
    }

    /* Definizione dei sottoprogrammi */

    public static int caricaArray(String[] t, String[] m, String[] p, int len) {
        Scanner input = new Scanner(System.in);

        int i, l;
        i = 0;

        System.out.print("Inserisci il numero di veicoli da inserire: ");
        l = input.nextInt();

        while (l > len) {
            System.out.println("Errore, inserisci nuovamente il numero.");
            System.out.print("Quanti dati vuoi inserire: ");
            l = input.nextInt();
        }

        for (i = 0; i < l; i++) {
            caricamento(t, m, p, i);
        }
        return l;
    }


    public static int caricaSingolo(String[] t, String[] m, String[] p, int len, int lenLog) {
        if ((lenLog + 1) > len) {
            System.out.println("Impossibile caricare i dati, sistema completo.");
        } else {
            caricamento(t, m, p, lenLog);
        }

        lenLog = lenLog + 1;

        return lenLog;
    }


    public static void caricamento(String[] t, String[] m, String[] p, int i) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci la targa del " + (i + 1) + "° veicolo: ");
        t[i] = input.nextLine();

        System.out.print("Inserisci il modello del " + (i + 1) + "° veicolo: ");
        input = new Scanner(System.in);
        m[i] = input.nextLine();

        System.out.print("Inserisci il nome del proprietario del " + (i + 1) + "° veicolo: ");
        input = new Scanner(System.in);
        p[i] = input.nextLine();
    }


    public static boolean riordinaLista(String[] tar, String[] mod, String[] prop, int log) {
        boolean vettoriRiordinati;

        if (log == 0) {
            vettoriRiordinati = false;
        } else {
            int i, j;

            String tmp_str;

            for (i = 0; i < log; i++) {
                for (j = 0; j < log; j++) {
                    if (tar[j].compareTo(tar[i]) < 0) {
                        tmp_str = tar[i];
                        tar[i] = tar[j];
                        tar[j] = tmp_str;

                        tmp_str = mod[i];
                        mod[i] = mod[j];
                        mod[j] = tmp_str;

                        tmp_str = prop[i];
                        prop[i] = prop[j];
                        prop[j] = tmp_str;
                    }
                }
            }

            vettoriRiordinati = true;
        }
        return vettoriRiordinati;
    }


    public static int cercaProprietario(String[] prop, int len, String nome, int[] indici) {
        int j = 0;

        for (int i = 0; i < len; i++) {
            if (nome.equals(prop[i])) {
                indici[j] = i;
                j = j + 1;
            }
        }

        return j;
    }


    public static int cercaTarga(String[] tar, String targa, int len, int[] indici) {
        int i, j;
        j = 0;

        for (i = 0; i < len; i++) {
            if (tar[i].equals(targa)) {
                indici[j] = i;
                j = j + 1;
            }
        }

        return j;
    }


    public static void stampaArray(String[] tar, String[] mod, String[] prop, int len) {
        int i;

        for (i = 0; i < len; i++) {
            System.out.println("Proprietario: " + prop[i]);
            System.out.println("Modello: " + mod[i]);
            System.out.println("Targhe: " + tar[i] + "\n");
        }
    }
}
