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
