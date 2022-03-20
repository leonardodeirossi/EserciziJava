package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Dichiarazione delle variabili
    int mese, giorni, anno;

    Scanner input = new Scanner(System.in);

    // Input
    System.out.print("Inserisci il numero del mese: ");
    mese = input.nextInt();

    // Elaborazione
    giorni = 0;

    if (mese == 4 || mese == 5 || mese == 9 || mese == 11) {
      giorni = 30;
    } else {
      if (mese == 2) {
        System.out.print("Per il mese di febbraio inserisci anche l'anno: ");
        anno = input.nextInt();

        if (anno % 400 == 0) {
          giorni = 29;
        } else {
          if (anno % 4 == 0 && anno % 100 != 0) {
            giorni = 29;
          } else {
            giorni = 28;
          }
        }
      } else {
        giorni = 31;
      }
    }

    // Output
    System.out.println("Il numero di giorni del mese è " + giorni);
  }
}
