package com.company;

/**
 * Created by Andrei on 3/6/2017.
 */
public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyword(); // add
    char getSymbol(); // +
    double doCalculation(double leftVal , double rightVal);

}
