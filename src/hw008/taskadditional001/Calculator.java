package hw008.taskadditional001;

/*
Задание
Используя IntelliJ IDEA, создайте класс Calculator.
Создайте метод с именем calculate, который принимает в качестве параметров три целочисленных
значения и возвращает значение каждого аргумента, деленного на 5.
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Input three digits to receive result of division by 5 (after each digit press Enter):");
        Scanner in = new Scanner(System.in);
        getDivisionResult(in.nextInt(), in.nextInt(), in.nextInt());
        in.close();
    }

    public static void getDivisionResult(int someValueOne, int someValueTwo, int someValueThree) {
        System.out.printf("The division by 5 result for each digit is:\n%.2f, %.2f, %.2f.",
                (double) someValueOne / 5, (double) someValueTwo / 5, (double) someValueThree / 5);
    }
}