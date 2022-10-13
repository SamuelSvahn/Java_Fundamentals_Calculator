package se.lexicon;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean condition = true;

        while (condition) {

            CalculatorMathematics.displayMenu();
            System.out.println("Enter operation type (+ , - , / , *) ");
            char operationType = scanner.next().charAt(0);


            System.out.println("Enter your number");
            double number1 = scanner.nextInt();
            System.out.println("Enter the second number");
            double number2 = scanner.nextInt();


            double result;

            switch (operationType) {
                case '+':
                    result = CalculatorMathematics.addition(number1, number2);
                    System.out.println("The answer is " + result);
                    break;

                case '-':
                    result = CalculatorMathematics.subtraction(number1, number2);
                    System.out.println("The answer is " + result);
                    break;

                case '/':
                    result = CalculatorMathematics.division(number1, number2);
                    System.out.println("The answer is " + result);
                    break;

                case '*':
                    result = CalculatorMathematics.multiplication(number1, number2);
                    System.out.println("The answer is " + result);
                    break;

                default:
                    System.out.println("Something went wrong try again");

            }


            condition = CalculatorMathematics.isContinue();


        }
    }
}