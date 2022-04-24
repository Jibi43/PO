package com.company;

public class Prostokat {
    int wysokosc, dlugosc;

    public Prostokat(int wysokosc, int dlugosc) {
        this.wysokosc = wysokosc;
        this.dlugosc = dlugosc;
    }
    public void oblicz(){
        System.out.println("Pole jest równe: "+(wysokosc * dlugosc));
        System.out.println("Obwód jest równy: "+((2* wysokosc)+(2* dlugosc)));

    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }
}

