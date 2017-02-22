package com.Andrei;

public class Main {

    public static void main(String[] args) {
	// write your code here


   int diceOne = rollDice();
   int diceTwo = rollDice();

        System.out.println("arunca zarurile  primul: " + diceOne + " al doilea: " + diceTwo  );

    }


    public static int rollDice (){
         // numar intre 0 -1 , exemplu  0.999 sau 0.233
        double randomNumber = Math.random();
         // inmultind  cu 6 avem numere intre 0 si aproape 6
        randomNumber = randomNumber * 6;
        // adunand 1  ajungem la un maxim de 6.99 ;
        randomNumber = randomNumber + 1;
        // transformand in int  orice numar ca 6.999 devine 6
        int randomInt = (int) randomNumber;
        return randomInt;
    }










}


