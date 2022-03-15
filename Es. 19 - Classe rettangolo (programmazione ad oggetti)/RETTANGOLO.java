package com.company;

public class Rettangolo {
    private float base;
    private float altezza;

    public Rettangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public float getBase() {
        return base;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public float perimetro() {
        return (base * 2) + (altezza * 2);
    }

    public float area() {
        return base * altezza;
    }
}
