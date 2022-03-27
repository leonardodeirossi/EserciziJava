package com.company;

class Data {
    private int giorno, mese, anno;
    private String giorno2, mese2;

    public Data(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;

        formattaVariabili(); // Formatto le variabili all'inizio così sono già pronte
    }

    private void formattaVariabili() {
        if (giorno < 10) {
            giorno2 = "0" + giorno;
        } else {
            giorno2 = String.valueOf(giorno);
        }

        if (mese < 10) {
            mese2 = "0" + mese;
        } else {
            mese2 = String.valueOf(mese);
        }
    }

    public int numeroGiorni(int mese) {
        int giorniMese;

        if (mese == 1 || mese == 3 || mese == 7 || mese == 8 || mese == 10 || mese == 12) {
            giorniMese = 31; // tutti gli altri ne han trentuno.
        } else {
            if (mese == 4 || mese == 6 || mese == 9 || mese == 11) {
                giorniMese = 30; // Trenta giorni ha Novembre, con April, Giugno e Settembre.
            } else {
                if (annoBisestile()) {
                    giorniMese = 29;
                } else {
                    giorniMese = 28; // Di ventotto ce n’è uno
                }
            }
        }

        return giorniMese;
    }

    public boolean annoBisestile() {
        boolean annoBisestile;

        if (anno % 4 != 0) {
            annoBisestile = false; // NON divisibile per 4
        } else {
            if (anno % 100 != 0) {
                annoBisestile = true; // Divisibile per 4, NON divisibile per 100
            } else {
                if (anno % 400 == 0) {
                    annoBisestile = true; // Divisibile per 4, Divisibile per 100, Divisibile per 400
                } else {
                    annoBisestile = false; // Divisibile per 4, Divisibile per 100, NON Divisibile per 400 
                }
            }
        }

        return annoBisestile;
    }

    public int giorniFineAnno() {
        // Vado a creare il timestamp della data
        int timestampGiorno = giorno * 86400;
        int timestampMese = timestampGiorno * numeroGiorni(mese);
        int timestampAnno = timestampMese * 12; // Numero di secondi dall'inizio dell'anno (alla data impostata)

        int timestampGiornoFinale = 31 * 86400;
        int timestampMeseFinale = timestampGiornoFinale * 31;
        int timestampAnnoFinale = timestampMeseFinale * 12; // Numero di secondi in un anno

        int secondiDifferenza = timestampAnnoFinale - timestampAnno;
        int giorniFineAnno = secondiDifferenza / 86400;

        return giorniFineAnno;
    }

    public void aggiungiGiorni(int numGiorni) {
        int numGiorniMese = numeroGiorni(mese);
        int giorniInseriti = 0;

        while (giorniInseriti < numGiorni) {
            // Se il giorno attuale supera il numero di giorni del mese vado al mese dopo
            if (giorno == numGiorniMese) {
                if (mese == 12) {
                    // Sono arrivato a fine anno
                    giorno = 1;
                    mese = 1;
                    anno = anno + 1;
                    numGiorniMese = numeroGiorni(mese);
                } else {
                    giorno = 1;
                    mese = mese + 1;
                    numGiorniMese = numeroGiorni(mese);
                }
            } else {
                giorno = giorno + 1;
            }

            giorniInseriti = giorniInseriti + 1;
        }

        formattaVariabili(); // Sistemo a livello globale le variabili del mese e del giorno
    }

    public String nomeMese(int mese) {
        String nomeMese = "";

        switch(mese) {
            case 01:
                nomeMese = "gennaio";
                break;
            case 02:
                nomeMese = "febbraio";
                break;
            case 03:
                nomeMese = "marzo";
                break;
            case 04:
                nomeMese = "aprile";
                break;
            case 05:
                nomeMese = "maggio";
                break;
            case 06:
                nomeMese = "giugno";
                break;
            case 07:
                nomeMese = "luglio";
                break;
            case 8:
                nomeMese = "agosto";
                break;
            case 9:
                nomeMese = "settembre";
                break;
            case 10:
                nomeMese = "ottobre";
                break;
            case 11:
                nomeMese = "novembre";
                break;
            case 12:
                nomeMese = "dicembre";
                break;
        }

        return nomeMese;
    }

    public String getGiorno() {
        return this.giorno2; // this.giorno => attributo della classe
    }

    public String getMese() {
        return this.mese2; // this.mese => attributo della classe
    }

    public int getAnno() {
        return this.anno; // this.anno => attributo della classe
    }

    public void setGiorno(int giorno) {
        this.giorno = giorno; // this.giorno => attributo della classe, giorno => parametro attuale
        formattaVariabili(); // Formatto le variabili all'inizio così sono già pronte
    }

    public void setMese(int mese) {
        this.mese = mese; // this.mese => attributo della classe, mese => parametro attuale
        formattaVariabili(); // Formatto le variabili all'inizio così sono già pronte
    }

    public void setAnno(int anno) {
        this.anno = anno; // this.anno => attributo della classe, anno => parametro attuale
    }

    public String stampaData() {
        String returnString;

        returnString = anno + "-" + mese2 + "-" + giorno2; // 2022-03-16
        return returnString;
    }
}
