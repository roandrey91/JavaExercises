package com.company;

/**
 * Created by Andrei on 2/24/2017.
 */
public class Stuff {

    public void negativeNumber (int number){
        System.out.println(number < 0 ? "Negativ" : "Pozitiv");
    }



    public void alfabet (){

        for (char a ='a'; a <= 'z' ; a++){
            System.out.println(a);

        }

    }

    public void numarNatural (double numar){
        int numar1 = (int) numar;
        if (numar == numar1 && numar1 >= 0){
            System.out.println("numarul este natural");
        }else {
            System.out.println("numarul nu este natural");
        }



    }













    public void blabla (int[] a ,int b){
        for(int i=0; i<a.length; i++){
            if(b == a[i]){
                System.out.println(b);
            }
        }
    }

    public boolean sirulFibonacii(int numar){
        int i = 0;
        numar = i +1;

        return false;
    }



}
