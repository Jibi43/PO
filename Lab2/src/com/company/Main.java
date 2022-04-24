package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        zadanie1();
        zadanie2();
        zadanie3();
        zadanie4();
        zadanie5();
        zadanie6();

    }

    public static void zadanie1() {
        double a,b,c,x1,x2, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj 3 liczby");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = b*b-4*a*c;
        if(d>0){
            x1 = ((-b+Math.sqrt(d))/(2*a));
            x2 = ((-b-Math.sqrt(d))/(2*a));
            System.out.println("Rozwiazaniami rownania sa liczby: "+x1+" i "+x2 );
        }
        else if(d==0){
            x1 = x2 = -b/(2*a);
            System.out.println("Rozwiazaniami rownania sa liczby: "+x1+" i "+x2 );
        }
        else{
            System.out.println("Rownanie nie ma rozwiazan w zbiorze liczby rzeczywistych");
        }


    }

    public static void zadanie2() {
        //Powninenem był zrobić Scanner w main, rozbić to na 3 metody i przekazywać z maina wartość x
        double x;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        x = in.nextDouble();
        if(x>=0){
            if(x==0){
                System.out.println("Wartosc x wynosi: "+x);
            }
            else{
                System.out.println("Wartosc x wynosi: "+(2*x));
            }
        }
        else{
            System.out.println("Wartosc x wynosi: "+(-3*x));
        }
        if (x>=1){
            System.out.println("Wartosc x wynosi: "+(x*x));
        }
        else{
            System.out.println("Wartosc x wynosi: "+(x));
        }
        if(x>=2){
            if(x==2){
                System.out.println("Wartosc x wynosi: "+8);
            }
            else{
                System.out.println("Wartosc x wynosi: "+(2+x));
            }
        }
        else{
            System.out.println("Wartosc x wynosi: "+(x-4));
        }



    }

    public static void zadanie3(){
        double x,y,z;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj 3 liczby");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        if((x<z)&&(x<y)){
            if(y<z){
                System.out.println("Liczby od najmniejszej do najwiekszej, to: "+x+" "+y+" "+z);
            }
            else{
                System.out.println("Liczby od najmniejszej do najwiekszej, to: "+x+" "+z+" "+y);
            }
        }
        if((y<x)&&(y<z)){
            if(x<z){
                System.out.println("Liczby od najmniejszej do najwiekszej, to: "+y+" "+x+" "+z);
            }
            else{
                System.out.println("Liczby od najmniejszej do najwiekszej, to: "+y+" "+z+" "+x);
            }

        }
        else{
            if(x<y){
                System.out.println("Liczby od najmniejszej do najwiekszej, to: "+z+" "+x+" "+y);
            }
            else{
                System.out.println("Liczby od najmniejszej do najwiekszej, to: "+z+" "+y+" "+x);
            }
        }
    }

    public static void zadanie4(){
        boolean deszcz, autobus;
        Scanner in = new Scanner(System.in);
        System.out.println("Czy pada deszcz?\n(true/false)");
        deszcz = in.nextBoolean();
        System.out.println("Czy na przystanku jest autobus?\n(true/false)");
        autobus = in.nextBoolean();
        if(deszcz && autobus)
            System.out.println("Weź parasol, dostaniesz się na uczelnie");
        if(deszcz && !autobus)
            System.out.println("„Nie dostaniesz się na uczelnie");
        if(!deszcz && autobus)
            System.out.println("„Dostaniesz się na uczelni, miłego dnia i pięknej pogody");

    }

    public static void zadanie5(){
        boolean znizka, podwyzka;
        Scanner in = new Scanner(System.in);
        System.out.println("Czy jest znizka na samochod?\n(true/false)");
        znizka = in.nextBoolean();
        System.out.println("Czy otrzymales podwyzke?\n(true/false)");
        podwyzka = in.nextBoolean();
        if (!znizka || podwyzka)
            System.out.println("Możesz kupić samochód! Zniżki na samochód nie ma");
        if(!znizka || !podwyzka)
            System.out.println("akup samochód trzebaodłożyć na później. Zniżki na samochód nie ma");
        if(znizka || podwyzka)
            System.out.println("Możesz kupić samochód ");

    }

    public static void zadanie6(){
        int wybor;
        double a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczby");
        a = in.nextDouble();
        b = in.nextDouble();
        System.out.println("Co chcesz zrobic:\n1.dodac\n2.odjac\n3.pomnozyc\n4.podzielic");
        wybor = in.nextInt();
        switch (wybor){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Wpisz liczbe od 1 do 4");
                break;

        }

    }
}
