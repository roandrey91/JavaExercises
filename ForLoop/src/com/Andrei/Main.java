package com.Andrei;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for(int i=3; i<10 ; i++){
            System.out.println("Loop" + i + "hello");
        }
        for(int i=2; i<9; i++){
            System.out.println("10,000  at "+ i +"% interest" +calculateInter(10000.0,i));
        }
        for(int i=8; i>=2; i--){
            System.out.println("10,000  at "+ i +"% interest" +calculateInter(10000.0,i));
        }

    }
    public static double calculateInter(double amount, double interRest){
        return(amount *(interRest/100));
    }
}
