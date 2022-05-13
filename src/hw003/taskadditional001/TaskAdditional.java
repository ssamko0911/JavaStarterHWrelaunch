package hw003.taskadditional001;

/*
Задание
Используя IntelliJ IDEA, создайте проект c классом main.
Создайте две целочисленные переменные и выведите на экран результаты всех арифметических
операций над этими двумя переменными.
 */

import java.util.Scanner;

public class TaskAdditional {
    public static void main(String[] args) {
        System.out.println("Insert first variable:");
        Scanner in = new Scanner(System.in);
        int variableOne = in.nextInt();
        System.out.println("Insert second variable:");
        int variableTwo = in.nextInt();
        System.out.printf("\nThe sum of variables is %d.", variableOne + variableTwo);
        System.out.printf("\nThe difference of the variables is %d.", variableOne - variableTwo);
        System.out.printf("\nThe division of variables is %.2f.", (double) variableOne / variableTwo);
        System.out.printf("\nThe multiplication of variables is %d.", variableOne * variableTwo);
    }
}