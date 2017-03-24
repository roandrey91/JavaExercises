package com.company;

/**
 * Created by Andrei on 3/1/2017.
 */
public abstract class CalculateBase {

    private double leftVal;
    private double rightval;
    private double result;


    public double getLeftVal() {
        return leftVal;
    }

    public double getRightval() {
        return rightval;
    }

    public double getResult() {
        return result;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public void setRightval(double rightval) {
        this.rightval = rightval;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public CalculateBase(){}

    public CalculateBase(double leftVal, double rightval) {
        this.leftVal = leftVal;
        this.rightval = rightval;
    }

    public abstract void calculate();
}
