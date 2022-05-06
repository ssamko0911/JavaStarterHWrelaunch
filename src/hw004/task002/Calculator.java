package hw004.task002;

import java.util.Scanner;

/*
Задание 2
Используя IntelliJ IDEA, создайте класс Calculator.
Напишите программу – консольный калькулятор.
Создайте две переменные с именами operand1 и operand2. Задайте переменным некоторые
произвольные значения. Предложите пользователю ввести знак арифметической операции. Примите
значение, введенное пользователем и поместите его в строковую переменную sign.
Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch.
Выведите на экран результат выполнения арифметической операции.
В случае использования операции деления, организуйте проверку попытки деления на ноль. И если
таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
пользователя.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This is simple calculator. Input first digit:");
        double operandOne = in.nextDouble();
        System.out.println("Input second digit:");
        double operandTwo = in.nextDouble();
        String sign;
        System.out.println("Input math sign to interact with digits (+ \\ - \\ * \\ /):");
        sign = in.next();

        switch (sign) {
            case "+":
                System.out.printf("Result: %.2f", operandOne + operandTwo);
                break;
            case "-":
                System.out.printf("Result: %.2f", operandOne - operandTwo);
                break;
            case "*":
                System.out.printf("Result: %.2f", operandOne * operandTwo);
                break;
            case "/":
                if (operandTwo == 0) {
                    System.err.println("WARNING: / by zero is not allowed.");
                } else {
                    System.out.printf("Result: %.2f", operandOne / operandTwo);
                }
                break;
            default:
                System.out.println("Unknown math sign.");
        }
        in.close();
    }
}