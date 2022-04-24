package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/*int [] data;
    data = new int[10];
    int [] tab = new int[3]={1,11,111};
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]+" ");
        }
        System.out.println();
        for (int i; tab){
            System.out.println(i+" ");
        }
        int[][] macierz = new int[3][4];//[i][j], mxn
        String [][][] wymiary=new String[2][4][5];
        int [][]a = {
                {1,2,3},
                {4, 5, 6}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]+"\t");
            }
            for (int[]innerArray:a) {
                for (int data:innerArray){
                    System.out.println(data+ "\t");
                }
                     ) {

                }

            }

        }*/
        //kopiowanie tablic
    /*
        int[] tabA = {1,2,3,4,7,8,9,10};
        int[] tabB = new int[8];
        int[] tabC = new int[tabA.length];
        for (int i = 0; i < tabA.length; i++) {
            tabB[i]=tabA[i];
        }
        System.out.println(Arrays.toString(tabB));

        System.arraycopy(tabA,0,tabC,0,tabA.length);
        System.out.println(Arrays.toString(tabC));

        int[] tabD = Arrays.copyOfRange(tabA,0,tabA.length);
        System.out.println(Arrays.toString(tabD));

        int[] tabE = Arrays.copyOfRange(tabA,3,6);
        System.out.println(Arrays.toString(tabE));
    */
        //Sumrednia();
        //Bool();
        Dable();
    }
    public static void Sumrednia() {
        int s=0,ss=0;
        double[] tablica={55,44,33,22,11};
        for (int i = 0; i < tablica.length; i++) {
            s+=tablica[i];
            ss=i;
        }
        System.out.println("Suma elementow: "+s+" Srednia elementow: "+(s/ss));



    }
    public static void Bool(){
        int[] tabliczka;
        tabliczka = new int[20];
        for (int i = 0; i < tabliczka.length; i++) {



        }

    }
    public static double Los() {
        Random rand = new Random();
        double liczba = rand.nextInt(45);
        return liczba;

    }
    public static void Dable() {
        double[] array= new double[20];
        double suma =0, sumaroznic =0, srednia;

        System.out.println("elementy tablicy: ");
        for (int i = 0; i < array.length; i++) {
            array[i]=Los();
            suma+=array[i];
            System.out.println(array[i]+"\t");
        }
        srednia= suma/(double)array.length;
        System.out.println("\nSuma: "+suma+"\nSrednia pomiarow: "+srednia);

        //roznica ^2
        for (int i = 0; i < array.length; i++) {
            sumaroznic+=(array[i]-srednia)*(array[i]-srednia);
            //sumaRoznic+=Math.pow(array[i]-srednia,2.0);
        }
        System.out.println("suma roznic: "+sumaroznic);
        System.out.println("Wariancje: "+sumaroznic/((double)(array.length)-1));



    }


}
