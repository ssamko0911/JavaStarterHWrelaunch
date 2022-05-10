package hw007.task002;

/*
Задание 2
Используя IntelliJ IDEA, создайте класс Arithmetics.
Создайте четыре метода для выполнения арифметических операций, с именами: add – сложение, sub –
вычитание, mul – умножение, div – деление. Каждый метод должен принимать два целочисленных
аргумента и выводить на экран результат выполнения арифметической операции соответствующей
имени метода. Метод деления div, должен выполнять проверку попытки деления на ноль.
Требуется предоставить пользователю возможность вводить с клавиатуры значения операндов и знак
арифметической операции, для выполнения вычислений.
 */

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        System.out.println("This is simple calculator. Input first digit:");
        Scanner in = new Scanner(System.in);
        int operandOne = in.nextInt();
        System.out.println("Input second digit:");
        int operandTwo = in.nextInt();
        System.out.println("Input math sign:");
        String mathSign = in.next();

        switch (mathSign) {
            case "+" -> add(operandOne, operandTwo);
            case "-" -> sub(operandOne, operandTwo);
            case "*" -> mul(operandOne, operandTwo);
            case "/" -> div(operandOne, operandTwo);
            default -> System.out.printf("Unknown math sign - %s, impossible to calculate result.", mathSign);
        }
        in.close();
    }

    public static void add(int operandOne, int operandTwo) {
        System.out.printf("Result: %.2f.", (double) operandOne + operandTwo);
    }

    public static void sub(int operandOne, int operandTwo) {
        System.out.printf("Result: %.2f.", (double) operandOne - operandTwo);
    }

    public static void mul(int operandOne, int operandTwo) {
        System.out.printf("Result: %.2f.", (double) operandOne * operandTwo);
    }

    public static void div(int operandOne, int operandTwo) {
        if (operandTwo == 0) {
            System.err.println("Division by zero is prohibited.");
        } else {
            System.out.printf("Result: %.2f.", (double) operandOne / operandTwo);
        }
    }
}