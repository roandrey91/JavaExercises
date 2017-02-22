package com.Andrei;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(" Introduce-ti codul pentru cafeaua dorita\n"
                             + "Cafea expreso :  Cod 111\n"
                             + "Cafea mocacino : Cod 222 \n"
                             + "Cafea neagra :   Cod 333");

     int codCafea = scanner.nextInt();
      for(int i=0; i<11; i++){
          switch (codCafea) {
              case 111:
                  System.out.println("Cafea expresso");
                  break;
              case 222:
                  System.out.println("Cafea mocacino");
                  break;
              case 333:
                  System.out.println("Cafea neagra");
                  break;
          }

      }






    }
}
