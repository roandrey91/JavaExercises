package com.andrei;

import java.util.Scanner;

/**
 * Created by Andrei on 3/22/2017.
 */
public class NFactorial {

    // formula generala  N! = N * ( N -1 )!

  public void factorialNumber(){
      int n, c, fact = 1;

      System.out.println("Enter an integer to calculate it's factorial :");
      Scanner in = new Scanner(System.in);

      n = in.nextInt();

      if ( n < 0 )
          System.out.println("Number should't be negative.");
      else
      {
          for ( c = 1 ; c <= n ; c++ )
              fact = fact*c;

          System.out.println("Factorial of "+n+" is = "+fact);
      }

  }


}
