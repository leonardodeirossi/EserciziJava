package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sizeX, sizeY;
        System.out.println("BEVENUTO NEL SISTEMA CON LA MATRICE PAZZA SGRAVATA CHE MICROSOFT SPOSTATI PROPRIO");

        System.out.print("Numero di righe: ");
        sizeX = input.nextInt();

        System.out.print("Numero di colonne: ");
        sizeY = input.nextInt();

        Life life;

        if (sizeX == sizeY) {
            life = new Life(sizeX);
        } else {
            life = new Life(sizeX, sizeY);
        }

        String lastCommand;
        boolean cond = true;
        int cond2;

        while (cond) {

            do {
                System.out.println("Menu: \n---\n1)Genera numeri casuali \n2)Chide all'utente i valori da inserire \n3)Stampa i valori \n0)Esci dal programma");
                cond2 = input.nextInt();
            } while (cond2 > 3 || cond2 < 0);

            switch (cond2) {
                case 1:
                    life.generateInitialRandom();
                    break;

                case 2:
                    for (int iy = 0; iy < sizeY; iy++) {
                        for (int ix = 0; ix < sizeX; ix++) {
                            System.out.print("Inserisci il valore per la cella [" + iy + "][" + ix + "]: ");
                            if (input.nextInt() == 1) {
                                life.setState(ix, iy, true);
                            } else {
                                life.setState(ix, iy, false);
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Premi esci per uscire dal programma");
                    do {
                        System.out.println("Generazione: " + life.getCurrentGeneration());
                        System.out.print(life);

                        life.nextGeneration();
                        lastCommand = input.nextLine();
                    } while (!lastCommand.equals("esci"));
                    break;

                case 0:
                    System.out.println("Grazie e arrivederci");
                    cond = false;
                    break;
            }
        }
    }
}
