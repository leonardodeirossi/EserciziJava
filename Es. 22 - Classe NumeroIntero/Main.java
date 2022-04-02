package com.company;

import java.util.Scanner;

public class Main {
    public static boolean numeroInserito;
    public static NumeroIntero numeroIntero;

    public static void main(String[] args) {
        numeroInserito = false;

        stampaMenu();
    }

    public static void stampaMenu() {
        System.out.println("    1. Inserisci il numero");
        System.out.println("    2. Incrementa il numero");
        System.out.println("    3. Decrementa il numero");
        System.out.println("    4. Il numero e' pari?");
        System.out.println("    5. Il numero e' un numero primo?");
        System.out.println("    6. Visualizza il numero");
        System.out.println("    0. Esci");

        Scanner input = new Scanner(System.in);

        System.out.print("\nInserisci l'opzione desiderata: ");
        int opzione = input.nextInt();

        switch (opzione) {
            case 1:
                System.out.print("Inserisci il numero: ");
                int numero = input.nextInt();

                numeroIntero = new NumeroIntero(numero);
                numeroInserito = true;

                stampaMenu();
                break;
            case 2:
                if (numeroInserito) {
                    System.out.print("Inserisci il numero da aggiungere: ");
                    int numeroIncrementa = input.nextInt();

                    numeroIntero.aggiungi(numeroIncrementa);
                } else {
                    System.out.println("Utilizza prima la voce 1 per inserire un numero.");
                }

                stampaMenu();
                break;
            case 3:
                if (numeroInserito) {
                    System.out.print("Inserisci il numero da togliere: ");
                    int numeroDecrementa = input.nextInt();

                    numeroIntero.togli(numeroDecrementa);
                } else {
                    System.out.println("Utilizza prima la voce 1 per inserire un numero.");
                }

                stampaMenu();
                break;
            case 4:
                if (numeroInserito) {
                    boolean numeroPari = numeroIntero.pari();

                    if (numeroPari) {
                        System.out.println("Il numero e' pari.");
                    } else {
                        System.out.println("Il numero NON e' pari.");
                    }
                } else {
                    System.out.println("Utilizza prima la voce 1 per inserire un numero.");
                }

                stampaMenu();
                break;
            case 5:
                if (numeroInserito) {
                    boolean numeroPrimo = numeroIntero.primo();

                    if (numeroPrimo) {
                        System.out.println("Il numero e' primo.");
                    } else {
                        System.out.println("Il numero NON e' primo.");
                    }
                } else {
                    System.out.println("Utilizza prima la voce 1 per inserire un numero.");
                }

                stampaMenu();
                break;
            case 6:
                if (numeroInserito) {
                    System.out.println("Il numero inserito e': " + numeroIntero.stampa());
                } else {
                    System.out.println("Utilizza prima la voce 1 per inserire un numero.");
                }

                break;
            case 0:
                System.out.println("Arrivederci.");
                break;
            default:
                break;
        }
    }
}
