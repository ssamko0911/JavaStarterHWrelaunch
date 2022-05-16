package courseworkstarter;

/*
Задача 2.
Напишите метод, который принимает число, которое не содержит нулей и возвращает цифры в
обратном порядке.
 Например, на вход: 789 на выход: 987
 */

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        System.out.println("Input number to receive a reversed number (each digit shouldn't be equal to zero):");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (!String.valueOf(number).contains("0")) {
            System.out.printf("The reversed number is %d.", reversNumber(number));
        } else {
            System.err.println("It's not allowed to input zeroes in number!");
        }
        in.close();
    }

    public static int reversNumber(int someNumber) {
        StringBuilder stringResult = new StringBuilder();
        while (someNumber > 0) {
            stringResult.append(someNumber % 10);
            someNumber = someNumber / 10;
        }
        return Integer.parseInt(String.valueOf(stringResult));
    }
}