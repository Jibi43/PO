package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int zmienna1, zmienna2;
        double zmienna3, zmienna4, zmienna5;
        Scanner in = new Scanner(System.in);
        zadanie1();
        System.out.println("Podaj liczby calkowita");
        zmienna1 = in.nextInt();
        zmienna2 = in.nextInt();
        zadanie2(zmienna1,zmienna2);
        System.out.println("Podaj liczbe calkowita");
        zmienna1 = in.nextInt();
        zadanie3(zmienna1);
        System.out.println("Podaj liczbe calkowita");
        zmienna1 = in.nextInt();
        zadanie4(zmienna1);
        System.out.println("Podaj liczbe");
        zmienna3 = in.nextInt();
        zadanie5(zmienna3);
        System.out.println("Podaj liczbe");
        zmienna3 = in.nextInt();
        zadanie6(zmienna3);
        System.out.println("Podaj liczby");
        zmienna3 = in.nextInt();
        zmienna4 = in.nextInt();
        zmienna5 = in.nextInt();
        zadanie7(zmienna3, zmienna4, zmienna5);



    }

    public static void zadanie1() {
        String imie;
        int wiek;
        imie = "Jan";
        wiek = 37;
        System.out.println("Twoje podane imie to: "+imie+"\nTwoj podany wiek to: "+wiek);

    }

    public static void zadanie2(int a, int b) {
        System.out.println("Suma tych liczb jest rowna: "+(a+b)+"\nRoznica tych liczb jest rowna: "+(a-b)+" lub "+(b-a)+"\nIloczyn tych liczb jest rowny: "+(a*b));

    }

    public static boolean zadanie3(int a) {
        return a % 2 == 0;

    }
    public static boolean zadanie4(int a) {
        return (a % 3 == 0)&(a % 5 == 0);

    }

    public static void zadanie5(double a) {
        System.out.println(Math.pow(a,3));

    }
    public static void zadanie6(double a) {
        System.out.println(Math.sqrt(a));

    }
    public static void zadanie7(double a, double b, double c) {
        if((a>b)&(a>c)) {
            if (b + c > a)
                System.out.println("Podane odcinki tworza trojkat prostokotny");
            else
                System.out.println("Podane odcinki nie tworza trojkata prostokotnego");
        }
        if((b>a)&(b>c)) {
            if (a + c > b)
                System.out.println("Podane odcinki tworza trojkat prostokotny");
            else
                System.out.println("Podane odcinki nie tworza trojkata prostokotnego");
        }
        if((c>b)&(c>a)) {
            if (b + a > c)
                System.out.println("Podane odcinki tworza trojkat prostokotny");
            else
                System.out.println("Podane odcinki nie tworza trojkata prostokotnego");
        }

    }



}
