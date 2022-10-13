package se.lexicon;

import java.util.Scanner;

public class CalculatorMathematics {

    public static double addition(double number1, double number2) {
        return number1 + number2;
    }

    public static double subtraction(double number1, double number2) {
        return number1 - number2;
    }

    public static double division(double number1, double number2) {
        return number1 / number2;
    }

    public static double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    public static void displayMenu() {
        System.out.println("Welcome to Calculator");
    }


    public static double getNUmber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");

        return scanner.nextInt();
    }


    public static void handleMathOperations(char operationType, double number1, double number2) {
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
    }


    public static boolean isContinue (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to continue? (Yes or no?");
        String continueOperation = scanner.next();
        if (continueOperation.equalsIgnoreCase("no")) {
            System.out.println("Thanks for trying the calculator");
            return false;
        }else return true;
    }
}
