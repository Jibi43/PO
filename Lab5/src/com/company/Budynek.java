package com.company;

public class Budynek {
    String Nazwa;
    int RokBudowy, LiczbaPieter, RokAktualny;

    public Budynek(String nazwa, int rokBudowy, int liczbaPieter, int rokAktualny) {
        Nazwa = nazwa;
        RokBudowy = rokBudowy;
        LiczbaPieter = liczbaPieter;
        RokAktualny = rokAktualny;
    }
    public void Starosc(){
        System.out.println("Budynek "+Nazwa+" ma "+(RokAktualny-RokBudowy)+" lat i "+LiczbaPieter+" pięter.");
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public int getRokBudowy() {
        return RokBudowy;
    }

    public void setRokBudowy(int rokBudowy) {
        RokBudowy = rokBudowy;
    }

    public int getLiczbaPieter() {
        return LiczbaPieter;
    }

    public void setLiczbaPieter(int liczbaPieter) {
        LiczbaPieter = liczbaPieter;
    }

    public int getRokAktualny() {
        return RokAktualny;
    }

    public void setRokAktualny(int rokAktualny) {
        RokAktualny = rokAktualny;
    }
}

