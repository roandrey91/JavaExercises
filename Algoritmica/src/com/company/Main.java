package com.company;

public class Main {

    public static void main(String[] args) {
        medieAritmetica(5,6,4,8,7);

        


        Stuff stuff = new Stuff();
        //stuff.negativeNumber(0);
        //stuff.alfabet();
        //stuff.numarNatural(2.2);

        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }

        stuff.blabla(a, 5);
    }


    public static void medieAritmetica (double nr1, double nr2, double nr3, double nr4, double nr5){
        double rezultat = (nr1 + nr2 + nr3 + nr4 + nr5)/5;
        System.out.println(rezultat);
    }
}
