package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    zadanie1();
        zadanie2();
        zadanie3();
        zadanie4();
    }

    public static void zadanie1() {
        double n, x, max = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe studentow");
        n = in.nextDouble();
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbe punktow: ");
            x = in.nextDouble();
            max=max+x;
        }
        System.out.println("Srednia liczba punktow wynosi: "+(max/n));


    }

    public static void zadanie2(){
        double zmienna, ujemne=0, dodatnie=0;
        int ld = 0, lu =0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbe");
            zmienna = in.nextDouble();
            if(zmienna >=0){
                dodatnie += zmienna;
                ld++;
            }
            else {
                ujemne += zmienna;
                lu++;
            }
        }
        System.out.println("Suma "+ld+" liczb dodatnich wynosi: "+ dodatnie +"\nSuma "+lu+" liczb ujemnych wynosi: "+ ujemne);


    }

    public static void zadanie3(){
        double n, zmienna, p=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe n wieksza od 0");
        n = in.nextDouble();
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbe");
            zmienna = in.nextDouble();
            if(zmienna%2==0){
                p+=zmienna;
            }
            else{
                continue;
            }


        }


    }

    public static void zadanie4(){
        Random rand = new Random();
        int n,zmienna, suma=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb");
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            zmienna = rand.nextInt(56)-10;
            if(zmienna%2==0){
                suma+=zmienna;
            }
            else{
                continue;
            }


        }
        System.out.println("Suma losowych liczb parzystych wynosi: "+suma);







    }
}
