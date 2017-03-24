package com.company;

/**
 * Created by Andrei on 3/1/2017.
 */
public class Devider extends CalculateBase implements MathProcessing {

    public Devider(){}

    public Devider(double leftVal, double rightval) {
        super(leftVal, rightval);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() / getRightval();
        setResult(value);


    }

    @Override
    public String getKeyword() {
        return "devide";
    }

    @Override
    public char getSymbol() {
        return '/';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
       setRightval(rightVal);
       setLeftVal(leftVal);
       calculate();
        return getResult();
    }
}
