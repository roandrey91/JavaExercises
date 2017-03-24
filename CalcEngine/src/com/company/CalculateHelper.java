package com.company;

/**
 * Created by Andrei on 3/2/2017.
 */
public class CalculateHelper {
    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DEVIDE_SYMBOL = '/';


    MathCommand command;
    double leftValue;
    double rightValue;
    double result;


    public void process (String statement) throws InvalidStatementException {
        // add 1.0'2.0

        String[] parts = statement.split(" ");
        if (parts.length !=3)
            throw new InvalidStatementException("incorect numbar of fields " , statement);
        String commandString = parts[0]; // add

        try {

            leftValue = Double.parseDouble(parts[1]); //1.0
            rightValue = Double.parseDouble(parts[2]); //2.0
        }catch (NumberFormatException e){
            throw new InvalidStatementException("Non-numeric data", statement, e );
        }

        setCommandFromString(commandString);
        if (command == null)
            throw new InvalidStatementException("Invalid command", statement);

        CalculateBase calculator = null;
        switch (command)  {
            case Add:
                calculator = new Adder(leftValue,rightValue);
                break;
            case Substract:
                calculator = new Subtracter(leftValue,rightValue);
                break;
            case Devide:
                calculator = new Devider(leftValue,rightValue);
                break;
            case Multiply:
                calculator = new Multiplier(leftValue,rightValue);
                break;

        }

        calculator.calculate();
        result = calculator.getResult();
    }

    public void setCommandFromString (String commandString){
        // add - MathCommand.Add

        if (commandString.equalsIgnoreCase(MathCommand.Add.toString()))
            command = MathCommand.Add;
        else if (commandString.equalsIgnoreCase(MathCommand.Substract.toString()))
            command = MathCommand.Substract;
        else if (commandString.equalsIgnoreCase(MathCommand.Devide.toString()))
            command = MathCommand.Devide;
        else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command = MathCommand.Multiply;
        else
            System.out.println("CACAT");

    }

    @Override
    public String toString(){
      // 1.0 + 2.0 = 3.0
       char symbol = ' ';
       switch (command)  {
           case Add:
               symbol = ADD_SYMBOL;
               break;
           case Substract:
               symbol = SUBTRACT_SYMBOL;
               break;
           case Devide:
               symbol = DEVIDE_SYMBOL;
               break;
           case Multiply:
               symbol = MULTIPLY_SYMBOL;
               break;
       }
     StringBuilder sb = new StringBuilder(20);
       sb.append(leftValue);
       sb.append(' ');
       sb.append(symbol);
        sb.append(' ');
        sb.append(rightValue);
        sb.append(" = ");
        sb.append(result);


     return sb.toString();
    }
}
