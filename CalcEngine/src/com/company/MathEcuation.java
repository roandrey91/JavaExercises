package com.company;

/**
 * Created by Andrei on 2/27/2017.
 */
public class MathEcuation {
    private double leftVal;
    private double rightVal;
    private double result;
    private char opCode;

    public double getLeftVal() {
        return leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public double getResult() {
        return result;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public MathEcuation(){}

    public MathEcuation(char opCode){
        this.opCode = opCode;
    }

    public MathEcuation(double leftVal, double rightVal, char opCode){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }

    public void execute (){
        switch (opCode){
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default :
                System.out.println("error - invalid code");
                result = 0.0d;
                break;
        }








    }








}
