package com.company;

import java.util.Arrays;

public class CLASSE {
    private int annoCorso;
    private String sezione;
    private String indirizzo;
    private String[] studenti = new String[30];
    private int numeroStudenti;

    public int getAnnoCorso() {
        return annoCorso;
    }

    public String getSezione() {
        return sezione;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public int numeroRegistro(String cognomeNomeAlunno) {
        boolean trovato = false;
        int numeroRegistro = 0;

        for (int i = 0; i < studenti.length && trovato == false; i++) {
            if (studenti[i].equals(cognomeNomeAlunno)) {
                numeroRegistro = i + 1;
                trovato = true;
            }
        }

        return numeroRegistro;
    }

    public void nomiStudenti() {
        for (int i = 0; i < studenti.length; i++) {
            System.out.println((i + 1) + ". " + studenti[i]);
        }
    }

    public void classe(int anno, String sezione, String indirizzo) {
        this.annoCorso = anno;
        this.sezione = sezione;
        this.indirizzo = indirizzo;
    }

    public void inserisciStudente(String cognomeNome) {
        int numeroStudenti = numeroStudenti();

        if (numeroStudenti < 30) {
            studenti[numeroStudenti + 1] = cognomeNome;
        } else {
            gestioneErrori("max_studenti_30");
        }
    }

    public int numeroStudenti() {
        return studenti.length;
    }

    public void gestioneErrori(String codiceErrore) {
        switch (codiceErrore) {
            case "max_studenti_30":
                System.out.println("Attenzione: numero massimo di studenti inseriti (30).");
                break;
        }
    }

    public void ordinaStudenti() {
        Arrays.sort(studenti);
    }
}
