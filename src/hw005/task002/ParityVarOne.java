package hw005.task002;

import java.util.Scanner;

/*
Задание 2
Известно, что у четных чисел младший бит имеет значение 0
Используя IntelliJ IDEA, создайте класс Parity.
Напишите программу, которая будет выполнять проверку чисел на четность.
Предложите два варианта решения поставленной задачи.
 */
public class ParityVarOne {
    public static void main(String[] args) {
        System.out.println("Input digit: ");
        Scanner in = new Scanner(System.in);
        int digit = in.nextInt();
        System.out.printf("%s.", digit % 2 == 0 ? "YES, it's even digit" : "NO, it's not even digit");
        in.close();
    }
}