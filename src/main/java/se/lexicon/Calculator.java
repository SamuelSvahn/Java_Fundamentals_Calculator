package se.lexicon;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean condition = true;

        while (condition) {
            CalculatorMathematics.displayMenu();
            System.out.println("Enter operation type (+ , - , / , *) ");
            CalculatorMathematics.handleMathOperations(scanner.next().charAt(0), CalculatorMathematics.getNumber(), CalculatorMathematics.getNumber());
            condition = CalculatorMathematics.isContinue();

        }
    }

}