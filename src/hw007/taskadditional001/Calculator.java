package hw007.taskadditional001;

/*
Задание
Используя IntelliJ IDEA, создайте класс Calculator.
Создайте метод с именем calculate, который принимает в качестве параметров три целочисленных
аргумента и выводит на экран среднее арифметическое значений аргументов.
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, input three digits to get the average (put Enter after each digit):");
        calculate(in.nextInt(), in.nextInt(), in.nextInt());
        in.close();
    }

    public static void calculate(int numberOne, int numberTwo, int numberThree) {
        System.out.printf("The average is %.2f.", (double) (numberOne + numberTwo + numberThree) / 3);
    }
}