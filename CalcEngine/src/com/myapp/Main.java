package com.myapp;

import com.company.*;

public class Main {

    public static void main(String[] args) {
//    double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
//    double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
//    char[] opsCodes = {'d', 'a', 's','m'};
//    double[] results = new double[opsCodes.length];
//	double val1 = 100.0d;
//	double val2 = 50.0d;
//	double result ;
//
//	char opCode ='d';

      //  useCalculateHelper();

        String[] statements = {

                "add 25.0 92.0",
                "power 5.0 2.0",
                "devide 25.0 3.0"

        };

        DynamicHelper helper = new DynamicHelper(new MathProcessing[]{
            new Adder(),
            new PowerOf(),
            new Devider()
        });

        for (String statement : statements) {
          String output = helper.process(statement);
            System.out.println(output);

        }


    }

    static void useCalculateHelper() {
        String[] statements = {
                "add 1.0",
                "add xx 25.0",
                "addx 0.0 0.0",  // first 3 errors for try and cath
                "devide 100.0 50.0",
                "add 25.0 92.0",
                "substract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        CalculateHelper helper = new CalculateHelper();
        for (String statement : statements) {
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null)
                    System.out.println("  original exception: " + e.getCause().getMessage());
            }

        }




        MathEcuation[] equations = new MathEcuation[4];
        equations[0] = new MathEcuation(100.0d,50.0d,'a');
        equations[1] = new MathEcuation(25.0d,92.0d,'s');
        equations[2] = new MathEcuation(225.0d,17.0d,'d');
        equations[3] = new MathEcuation(11.0d,3.0d,'m');


        for (MathEcuation equation : equations) {
            equation.execute();
            System.out.print("The results = ");
            System.out.println(equation.getResult());
        }


        System.out.println();
        System.out.println("using overloads");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEcuation ecuationoverload = new MathEcuation('d');
        ecuationoverload.execute(leftDouble,rightDouble);
        System.out.print("result = ");
        System.out.println(ecuationoverload.getResult());
// aici se intampla o conversie de largire  , transforma singur int-urile in double
        ecuationoverload.execute(leftInt,rightInt);
        System.out.print("result = ");
        System.out.println(ecuationoverload.getResult());


        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calcutators = {
            new Devider(100.0d,50.0d),
                new Adder(25.0d, 92.0d),
                new Subtracter(225.0d,17.0d),
                new Multiplier(11.0d, 3.0d)
        };

        for (CalculateBase calculator:calcutators){
            calculator.calculate();
            System.out.print("result = ");
            System.out.println(calculator.getResult());
        }








    }

//    public static MathEcuation create(double leftVal, double rightVal, char opCode) {
//        MathEcuation equation = new MathEcuation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//    }

}
