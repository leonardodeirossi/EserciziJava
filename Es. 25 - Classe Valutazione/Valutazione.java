package com.company;

public class Valutazione {
    private String nomeStudente;
    private int puntiEsameFinale;
    private int puntiEsameIntermedio1;
    private int puntiEsameIntermedio2;
    private int puntiEsercizio1;
    private int puntiEsercizio2;

    private double mediaVoti;
    private double punteggioFinale;
    private char votoFinale;

    public String getNomeStudente() {
        return nomeStudente;
    }

    public int getPuntiEsameFinale() {
        return puntiEsameFinale;
    }

    public int getPuntiEsameIntermedio1() {
        return puntiEsameIntermedio1;
    }

    public int getPuntiEsameIntermedio2() {
        return puntiEsameIntermedio2;
    }

    public int getPuntiEsercizio1() {
        return puntiEsercizio1;
    }

    public int getPuntiEsercizio2() {
        return puntiEsercizio2;
    }

    public double getMediaVoti() {
        return mediaVoti;
    }

    public double getPunteggioFinale() {
        return punteggioFinale;
    }

    public char getVotoFinale() {
        return votoFinale;
    }

    public Valutazione(String nomeStudente) {
        this.nomeStudente = nomeStudente;
    }

    /*
     *  boolean: inserisciVotiEsami(int puntiEsameFinale, int puntiEsameIntermedio1, int puntiEsameIntermedio2)
     *  Inserisce i voti degli esami negli attributi della classe però prima verifica se i voti rispettano i rispettivi requisiti
     */
    public boolean inserisciVotiEsami(int puntiEsameFinale, int puntiEsameIntermedio1, int puntiEsameIntermedio2) {
        boolean opzCompletata;

        // Controllo per l'esame finale (voto minore o uguale a 100 e voto maggiore o uguale a 0)
        if (puntiEsameFinale <= 100 && puntiEsameFinale >= 0) {
            this.puntiEsameFinale = puntiEsameFinale;
        }

        // Controllo per l'esame intermedio n. 1 (voto minore o uguale a 100 e voto maggiore o uguale a 0)
        if (puntiEsameIntermedio1 <= 100 && puntiEsameIntermedio1 >= 0) {
            this.puntiEsameIntermedio1 = puntiEsameIntermedio1;
        }

        // Controllo per l'esame intermedio n. 2 (voto minore o uguale a 100 e voto maggiore o uguale a 0)
        if (puntiEsameIntermedio2 <= 100 && puntiEsameIntermedio2 >= 0) {
            this.puntiEsameIntermedio2 = puntiEsameIntermedio2;
        }

        // Controlla che l'inserimento per tutti i valori sia stato completato
        if (this.puntiEsameFinale == puntiEsameFinale && this.puntiEsameIntermedio1 == puntiEsameIntermedio1 && this.puntiEsameIntermedio2 == puntiEsameIntermedio2) {
            opzCompletata = true;
        } else {
            opzCompletata = false;
        }

        return opzCompletata;
    }

    /*
     *  boolean: inserisciVotiEsercizi(int puntiEsercizio1, int puntiEsercizio2)
     *  Inserisce i voti degli esercizi negli attributi della classe però prima verifica se i voti rispettano i rispettivi requisiti
     */
    public boolean inserisciVotiEsercizi(int puntiEsercizio1, int puntiEsercizio2) {
        boolean opzCompletata;

        // Controllo per l'esercizio n. 1 (voto minore o uguale a 10 e voto maggiore o uguale a 0)
        if (puntiEsercizio1 <= 10 && puntiEsercizio1 >= 0) {
            this.puntiEsercizio1 = puntiEsercizio1;
        }

        // Controllo per l'esercizio n. 2 (voto minore o uguale a 10 e voto maggiore o uguale a 0)
        if (puntiEsercizio2 <= 10 && puntiEsercizio2 >= 0) {
            this.puntiEsercizio2 = puntiEsercizio2;
        }

        // Controlla che l'inserimento per tutti i valori sia stato completato
        if (this.puntiEsercizio1 == puntiEsercizio1 && this.puntiEsercizio2 == puntiEsercizio2) {
            opzCompletata = true;
        } else {
            opzCompletata = false;
        }

        return opzCompletata;
    }

    /*
     *  void: calcolaMedia()
     *  Calcola la media ponterata dei voti delle varie prove e aggiorna l'attributo della classe
     */
    public void calcolaMedia() {
        int sommaVoti;

        // Somma dei voti = > denominatore della frazione
        sommaVoti = this.puntiEsameFinale + this.puntiEsameIntermedio1 + this.puntiEsameIntermedio2 + this.puntiEsercizio1 + this.puntiEsercizio1;

        double numeratoreMedia;

        // Numeratore della frazione => (voto * peso) + (voto * peso) + ...
        // numeratoreMedia = (this.puntiEsameFinale * 0.50) + ((this.puntiEsameIntermedio1 + this.puntiEsameIntermedio2) * 0.25) + ((this.puntiEsercizio1 + this.puntiEsercizio1) * 0.25);
        numeratoreMedia = this.puntiEsameFinale * 0.50 + (this.puntiEsameIntermedio1 + this.puntiEsameIntermedio2) * 0.25 + (this.puntiEsercizio1 + this.puntiEsercizio1) * 0.25;

        this.mediaVoti = numeratoreMedia / sommaVoti;
    }

    /*
     *  void: calcolaVotoFinale()
     *  Calcola il voto in centesimi partendo dalla media calcolata in calcolaMedia()
     */
    public void calcolaVotoFinale() {
        double votoFinale;
        votoFinale = this.mediaVoti * 100;

        this.punteggioFinale = votoFinale;
    }

    /*
     *  void: calcolaVotoLettera()
     *  Calcola il voto in lettere partendo dal voto finale (in centesimi) calcolato in calcolaVotoFinale()
     */
    public void calcolaVotoLettera() {
        char voto;

        if (this.votoFinale >= 90) {
            voto = 'A';
        } else {
            if (this.votoFinale >= 80 && this.votoFinale <= 89) {
                voto = 'B';
            } else {
                if (this.votoFinale >= 70 && this.votoFinale <= 79) {
                    voto = 'C';
                } else {
                    if (this.votoFinale >= 60 && this.votoFinale <= 69) {
                        voto = 'D';
                    } else {
                        voto = 'F';
                    }
                }
            }
        }

        // Aggiorna l'attributo della classe
        this.votoFinale = voto;
    }

    /*
     *  void: toString()
     *  Restituisce i dati della classe sotto forma di stringa testuale comprensibile dall'utente
     */
    @Override
    public String toString() {
        String returnString;

        returnString = "Dettaglio voti dell'alunno " + this.nomeStudente + "\n";
        returnString += "Punteggio del 1° esercizio: " + this.puntiEsercizio1 + "\n";
        returnString += "Punteggio del 2° esercizio: " + this.puntiEsercizio2 + "\n";
        returnString += "Punteggio del 1° esame parziale: " + this.puntiEsameIntermedio1 + "\n";
        returnString += "Punteggio del 2° esame parziale: " + this.puntiEsameIntermedio2 + "\n";
        returnString += "Punteggio dell'esame finale: " + this.puntiEsameFinale + "\n";
        returnString += "Punteggio finale: " + this.punteggioFinale + "\n";
        returnString += "Voto finale: " + this.votoFinale;

        return returnString;
    }
}
