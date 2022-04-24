package com.company;

public class Main {

    public static void main(String[] args) {
        //tworzenie obiektów klasy
        //Osoba ob1= new Osoba();
        //Osoba ob2= new Osoba("Juan","Nowak", 12);
        //Osoba ob3=new Osoba("Janina");
        //ob1.imie="Andrewh";
        //ob1.nazwisko="Nowhak";
        //ob1.wiek=43;
        //ob1.Info();
        //System.out.println(ob1.getImie());
        //ob1.setImie("Andrewh");
        //System.out.println(ob1.getImie());
        //ob1.Info();
        //ob2.Info();
        //System.out.println("Referencja do obiektu: \t"+ob3);
        Prostokat prst = new Prostokat(10,20);
        prst.oblicz();
        prst.setDlugosc(13);
        prst.oblicz();

        Budynek bud1 = new Budynek("Domek",1999,5,2022);
        bud1.Starosc();
        Budynek bud2 = new Budynek("Domeczek",1890,2,2022);
        bud2.Starosc();

        Zadanie3();
    }

    public static void Zadanie3() {
        Gatunek Zwierz1= new Gatunek("Prosalirius","Breviceps",26, 13);
        Zwierz1.Nazwa();
        Zwierz1.Chrom();
        Zwierz1.wszystko();
        



    }
}
