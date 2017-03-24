package com.company;

/**
 * Created by Andrei on 3/1/2017.
 */
public class Adder extends CalculateBase implements MathProcessing {

    public Adder(){}

    public Adder(double leftVal, double rightval) {
        super(leftVal, rightval);
    }
    @Override
    public void calculate(){
        double value = getLeftVal() + getRightval();
        setResult(value);


    }


    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightval(rightVal);
        calculate();
        return getResult();
    }
}
