package hw005.task002;
/*
Задание 2
Известно, что у четных чисел младший бит имеет значение 0
Используя IntelliJ IDEA, создайте класс Parity.
Напишите программу, которая будет выполнять проверку чисел на четность.
Предложите два варианта решения поставленной задачи.
 */

import java.util.Scanner;

public class ParityVarTwo {
    public static void main(String[] args) {
        System.out.println("Input digit: ");
        Scanner in = new Scanner(System.in);
        int digit = in.nextInt();
        boolean checkEven = (digit & 1) == 0;
        System.out.printf("%s.", checkEven ? "EVEN digit" : "ODD digit");
        in.close();
    }
}