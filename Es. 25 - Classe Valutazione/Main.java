package com.company;

import java.util.Scanner;

public class Main {
    public static Valutazione studente1;
    public static Valutazione studente2;
    public static Valutazione studente3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opzioneScelta = 0;
        boolean datiInseriti = false;

        while (opzioneScelta != 6) {
            System.out.println("Sistema per l'inserimento di voti e calcolo delle medie ponterate");
            System.out.println("--- MENU' PRINCIPALE ---");

            System.out.println("    1.  Inserimento dei voti dei tre studenti");

            if (datiInseriti) {
                System.out.println("    2.  Visualizza la Media Ponderata dei tre studenti");
                System.out.println("    3.  Voto in lettera dei tre studenti");
                System.out.println("    4.  Voti, media e lettera dei tre studenti");
                System.out.println("    5.  Stampare a video lo stato degli oggetti in ordine decrescente di media totale.");
            }

            System.out.println("    6.  Esci dal programma");

            if(!datiInseriti) {
                System.out.print("\nNota: le altre opzioni compariranno dopo l'inserimento dei dati iniziali.\n");
            }

            System.out.print("\nSeleziona l'opzione desiderata: ");
            opzioneScelta = input.nextInt();

            switch (opzioneScelta) {
                case 1:
                    // Input per caricare i dati in formato String
                    Scanner inputString1 = new Scanner(System.in);
                    Scanner inputString2 = new Scanner(System.in);
                    Scanner inputString3 = new Scanner(System.in);

                    // Input per caricare i dati in formato int
                    Scanner inputNumber = new Scanner(System.in);

                    /* PRIMO STUDENTE */
                    System.out.print("Inserisci il nome del primo studente: ");
                    String nomeStudente1 = inputString1.next();

                    studente1 = new Valutazione(nomeStudente1);
                    boolean studente1OK = false;

                    System.out.print("Inserisci il punteggio dell'esame finale: ");
                    int studente1EsameFinale = inputNumber.nextInt();

                    System.out.print("Inserisci il punteggio dell'esame esame intermedio n. 1: ");
                    int studente1EsameIntermedio1 = inputNumber.nextInt();

                    System.out.print("Inserisci il punteggio dell'esame esame intermedio n. 2: ");
                    int studente1EsameIntermedio2 = inputNumber.nextInt();

                    boolean votiEsameStudente1 = studente1.inserisciVotiEsami(studente1EsameFinale, studente1EsameIntermedio1, studente1EsameIntermedio2);

                    System.out.print("Inserisci il punteggio del 1° esercizio: ");
                    int studente1Esercizio1 = inputNumber.nextInt();

                    System.out.print("Inserisci il punteggio del 2° esercizio: ");
                    int studente1Esercizio2 = inputNumber.nextInt();

                    boolean votiEserciziStudente1 = studente1.inserisciVotiEsercizi(studente1Esercizio1, studente1Esercizio2);

                    if (!votiEsameStudente1 && !votiEserciziStudente1) {
                        System.out.println("Attenzione: si è verificato un errore nell'inserimento (proseguire pure, sarà necessario inserirli in seguito).");
                    } else {
                        studente1OK = true;
                    }


                    /* SECONDO STUDENTE */
                    System.out.print("Inserisci il nome del secondo studente: ");
                    String nomeStudente2 = inputString2.next();

                    studente2 = new Valutazione(nomeStudente2);
                    boolean studente2OK = false;

                    System.out.print("Inserisci il punteggio dell'esame finale: ");
                    int studente2EsameFinale = inputNumber.nextInt();

                    System.out.print("Inserisci il punteggio dell'esame esame intermedio n. 1: ");
                    int studente2EsameIntermedio1 = inputNumber.nextInt();

                    System.out.print("Inserisci il punteggio dell'esame esame intermedio n. 2: ");
                    int studente2EsameIntermedio2 = inputNumber.nextInt();

                    boolean votiEsameStudente2 = studente2.inserisciVotiEsami(studente2EsameFinale, studente2EsameIntermedio1, studente2EsameIntermedio2);

                    System.out.print("Inserisci il punteggio del 1° esercizio: ");
                    int studente2Esercizio1 = inputNumber.nextInt();

                    System.out.print("Inserisci il punteggio del 2° esercizio: ");
                    int studente2Esercizio2 = inputNumber.nextInt();

                    boolean votiEserciziStudente2 = studente2.inserisciVotiEsercizi(studente2Esercizio2, studente2Esercizio2);

                    if (!votiEsameStudente2 && !votiEserciziStudente2) {
                        System.out.println("Attenzione: si è verificato un errore nell'inserimento (proseguire pure, sarà necessario inserirli in seguito).");
                    } else {
                        studente2OK = true;
                    }


                    /* TERZO STUDENTE */
                    System.out.print("Inserisci il nome del terzo studente: ");
                    String nomeStudente3 = inputString3.next();

                    studente3 = new Valutazione(nomeStudente3);
                    boolean studente3OK = false;

                    System.out.print("Inserisci il punteggio dell'esame finale: ");
                    int studente3EsameFinale = inputNumber.nextInt();

                    System.out.print("Inserisci il punteggio dell'esame esame intermedio n. 1: ");
                    int studente3EsameIntermedio1 = inputNumber.nextInt();

                    System.out.print("Inserisci il punteggio dell'esame esame intermedio n. 2: ");
                    int studente3EsameIntermedio2 = inputNumber.nextInt();

                    boolean votiEsameStudente3 = studente3.inserisciVotiEsami(studente3EsameFinale, studente3EsameIntermedio1, studente3EsameIntermedio2);

                    System.out.print("Inserisci il punteggio del 1° esercizio: ");
                    int studente3Esercizio1 = inputNumber.nextInt();

                    System.out.print("Inserisci il punteggio del 2° esercizio: ");
                    int studente3Esercizio2 = inputNumber.nextInt();

                    boolean votiEserciziStudente3 = studente3.inserisciVotiEsercizi(studente3Esercizio1, studente3Esercizio2);

                    if (!votiEsameStudente3 && !votiEserciziStudente3) {
                        System.out.println("Attenzione: si è verificato un errore nell'inserimento (proseguire pure, sarà necessario inserirli in seguito).");
                    } else {
                        studente3OK = true;
                    }

                    // Se tutti gli inserimenti sono completati sblocco le altre opzioni
                    if (studente1OK && studente2OK && studente3OK) {
                        datiInseriti = true;
                    }

                    break;
                case 2:
                    if (datiInseriti) {
                        // Calcolo le medie nelle rispettive istanze della classe
                        studente1.calcolaMedia();
                        studente2.calcolaMedia();
                        studente3.calcolaMedia();

                        // Stampo a video
                        System.out.println("La media di " + studente1.getNomeStudente() + " è: " + studente1.getMediaVoti());
                        System.out.println("La media di " + studente2.getNomeStudente() + " è: " + studente2.getMediaVoti());
                        System.out.println("La media di " + studente3.getNomeStudente() + " è: " + studente3.getMediaVoti());

                    } else {
                        System.out.println("Attenzione: i dati non sono stati inseriti.");
                    }
                    break;
                case 3:
                    if (datiInseriti) {
                        // Calcolo il voto finale nelle rispettive classi (formato int)
                        studente1.calcolaVotoFinale();
                        studente2.calcolaVotoFinale();
                        studente3.calcolaVotoFinale();

                        // Calcolo il voto finale nelle rispettive classi (formato char)
                        studente1.calcolaVotoLettera();
                        studente2.calcolaVotoLettera();
                        studente3.calcolaVotoLettera();

                        // Stampo a video
                        System.out.println("La media di " + studente1.getNomeStudente() + " è: " + studente1.getVotoFinale());
                        System.out.println("La media di " + studente2.getNomeStudente() + " è: " + studente2.getVotoFinale());
                        System.out.println("La media di " + studente3.getNomeStudente() + " è: " + studente3.getVotoFinale());
                    } else {
                        System.out.println("Attenzione: i dati non sono stati inseriti.");
                    }
                    break;
                case 4:
                    if (datiInseriti) {
                        // Calcolo le medie nelle rispettive istanze delle classi
                        studente1.calcolaMedia();
                        studente2.calcolaMedia();
                        studente3.calcolaMedia();

                        // Calcolo il voto finale nelle rispettive classi (formato int)
                        studente1.calcolaVotoFinale();
                        studente2.calcolaVotoFinale();
                        studente3.calcolaVotoFinale();

                        // Calcolo il voto finale nelle rispettive classi (formato char)
                        studente1.calcolaVotoLettera();
                        studente2.calcolaVotoLettera();
                        studente3.calcolaVotoLettera();

                        // Stampo a video
                        System.out.println(studente1.toString());
                        System.out.println(studente2.toString());
                        System.out.println(studente3.toString());
                    } else {
                        System.out.println("Attenzione: i dati non sono stati inseriti.");
                    }
                    break;
                case 5:
                    if (datiInseriti) {
                        // Recupero la media dei voti
                        double mediaStudente1 = studente1.getMediaVoti();
                        double mediaStudente2 = studente2.getMediaVoti();
                        double mediaStudente3 = studente3.getMediaVoti();

                        // Stringhe per la stampa
                        String maggiore = "";
                        String medio = "";
                        String minore = "";

                        int studenteMaggiore, studenteMinore, studenteMedio;

                        // Trovo lo studente con la media maggiore
                        if (mediaStudente1 > mediaStudente2 && mediaStudente1 > mediaStudente3) {
                            maggiore = studente1.toString();
                            studenteMaggiore = 1;
                        } else {
                            if (mediaStudente2 > mediaStudente1 && mediaStudente2 > mediaStudente3) {
                                maggiore = studente2.toString();
                                studenteMaggiore = 2;
                            } else {
                                maggiore = studente3.toString();
                                studenteMaggiore = 3;
                            }
                        }

                        // Trovo lo studente con la media minore
                        if (mediaStudente1 < mediaStudente2 && mediaStudente1 < mediaStudente3) {
                            minore = studente1.toString();
                            studenteMinore = 1;
                        } else {
                            if (mediaStudente2 < mediaStudente1 && mediaStudente2 < mediaStudente3) {
                                minore = studente2.toString();
                                studenteMinore = 2;
                            } else {
                                minore = studente3.toString();
                                studenteMinore = 3;
                            }
                        }

                        // Trovo lo studente con la media media
                        if (studenteMaggiore == 1 && studenteMinore == 2) {
                            medio = studente3.toString();
                        } else {
                            if (studenteMaggiore == 1 && studenteMinore == 3) {
                                medio = studente2.toString();
                            } else {
                                if (studenteMaggiore == 2 && studenteMinore == 1) {
                                    medio = studente3.toString();
                                } else {
                                    if (studenteMaggiore == 3 && studenteMinore == 1) {
                                        medio = studente2.toString();
                                    } else {
                                        if (studenteMaggiore == 3 && studenteMinore == 2) {
                                            medio = studente1.toString();
                                        } else {
                                            if (studenteMaggiore == 2 && studenteMinore == 3) {
                                                medio = studente1.toString();
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        // Stampo a video
                        System.out.println(maggiore);
                        System.out.println(medio);
                        System.out.println(minore);
                    } else {
                        System.out.println("Attenzione: i dati non sono stati inseriti.");
                    }
                    break;
                case 6:
                    System.out.println("Grazie e arrivederci :)");
                    break;
            }
        }
    }
}
