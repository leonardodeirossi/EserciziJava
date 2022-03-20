package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean[] binaryNumber1;
        boolean[] binaryNumber2;
        int len, decimalNumber1, decimalNumber2, mcd;

        System.out.print("Inserisci la lunghezza del numero binario: ");
        len = input.nextInt();

        binaryNumber1 = new boolean[len];
        binaryNumber2 = new boolean[len];

        loadBinaryNumber(binaryNumber1, len);

        System.out.println("Numero 1 inserito");

        loadBinaryNumber(binaryNumber2, len);

        System.out.println("Numero 2 inserito");

        decimalNumber1 = binaryToDecimal(binaryNumber1, len);
        decimalNumber2 = binaryToDecimal(binaryNumber2, len);

        System.out.println("Num 1: " + decimalNumber1 + " - Num 2: " + decimalNumber2);

        mcd = mcd(decimalNumber1, decimalNumber2);

        System.out.println("MCD: " + mcd);
    }

    public static void loadBinaryNumber(boolean[] binaryNumber, int binaryNumberLenght) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < binaryNumberLenght; i++) {
            System.out.print("Inserisci il numero 0 o 1: ");
            if (input.nextInt() == 1) {
                binaryNumber[i] = true;
            } else {
                binaryNumber[i] = false;
            }
        }
    }

    public static int binaryToDecimal(boolean[] binaryNumber, int binaryNumberLenght) {
        int decimalNumber = 0;

        for (int i = 0; i < binaryNumberLenght; i++) {
            if (binaryNumber[binaryNumberLenght - i - 1]) {
                decimalNumber += Math.pow(2, i);
            }
        }

        return decimalNumber;
    }

    public static int mcd(int decimalNumber1, int decimalNumber2) {
        int mul, max;

        if (decimalNumber1 > decimalNumber2) {
            max = decimalNumber1;
        } else {
            max = decimalNumber2;
        }

        mul = max;

        while (!((mul % decimalNumber1 == 0) && (mul % decimalNumber2 == 0))) {
            mul = mul + max;
        }

        return mul;
    }
}
