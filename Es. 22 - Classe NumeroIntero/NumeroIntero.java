package com.company;

public class NumeroIntero {
    public static int numero;

    public NumeroIntero(int numero) {
        this.numero = numero;
    }

    public static String stampa() {
        String returnNumero;
        returnNumero = Integer.toString(numero);

        return returnNumero;
    }

    public static boolean pari() {
        boolean numeroPari = false;

        if (numero % 2 == 0) {
            numeroPari = true;
        }

        return numeroPari;
    }

    public static void aggiungi(int numeroAggiungi) {
        numero = numero + numeroAggiungi;
    }

    public static void togli(int numeroTogli) {
        numero = numero - numeroTogli;
    }

    public static boolean primo() {
        boolean numeroPrimo = true;
        int numeroDivisione = 2;

        while (numeroPrimo == true && numeroDivisione == numero - 1) {
            if (numero % numeroDivisione == 0) {
                numeroPrimo = true;
            } else {
                numeroPrimo = false;
            }

            numeroDivisione = numeroDivisione + 1;
        }

        return numeroPrimo;
    }
}
