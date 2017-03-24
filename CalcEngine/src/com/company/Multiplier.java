package com.company;

/**
 * Created by Andrei on 3/1/2017.
 */
public class Multiplier extends CalculateBase implements MathProcessing {

    public Multiplier(){}

    public Multiplier(double leftVal, double rightval) {
        super(leftVal, rightval);
    }

    public void calculate(){
        double value = getLeftVal() * getRightval();
        setResult(value);
    }

    @Override
    public String getKeyword() {
        return "multiply";
    }

    @Override
    public char getSymbol() {
        return '*';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setRightval(rightVal);
        setLeftVal(leftVal);
        calculate();
        return getResult();
    }
}
