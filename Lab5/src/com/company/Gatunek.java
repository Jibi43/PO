package com.company;

public class Gatunek {
    String NazwaR, NazwaG;
    int LiczbaCh2n, LiczbaChx;

    public Gatunek(String NazwaR, String NazwaG, int LiczbaCh2n, int LiczbaChx){
        this.NazwaR=NazwaR;
        this.NazwaG=NazwaG;
        this.LiczbaCh2n=LiczbaCh2n;
        this.LiczbaChx=LiczbaChx;
    }
    public void Nazwa(){
        System.out.println("Pelna nazwa Gatunku to: "+NazwaR+" "+NazwaG );
    }
    public void Chrom(){
        System.out.println("Haploidalna liczba chromosomow wynosi: "+LiczbaCh2n);
    }
    public void wszystko(){
        System.out.println(NazwaR+" "+NazwaG+" "+LiczbaCh2n+" "+LiczbaChx);
    }


    public String getNazwaR() {
        return NazwaR;
    }

    public void setNazwaR(String nazwaR) {
        NazwaR = nazwaR;
    }

    public String getNazwaG() {
        return NazwaG;
    }

    public void setNazwaG(String nazwaG) {
        NazwaG = nazwaG;
    }

    public int getLiczbaCh2n() {
        return LiczbaCh2n;
    }

    public void setLiczbaCh2n(int liczbaCh2n) {
        LiczbaCh2n = liczbaCh2n;
    }

    public int getLiczbaChx() {
        return LiczbaChx;
    }

    public void setLiczbaChx(int liczbaChx) {
        LiczbaChx = liczbaChx;
    }
}
