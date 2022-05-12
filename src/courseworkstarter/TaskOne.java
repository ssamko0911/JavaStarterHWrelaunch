package courseworkstarter;

/*
Задача 1.
Напишите метод, который принимает число и возвращает сумму цифр данного числа.
 */

import java.util.Locale;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println("Input a number to get the sum of it's all digits:".toUpperCase(Locale.ROOT));
        Scanner in = new Scanner(System.in);
        System.out.printf("The sum is %d.", getSumOfDigits(in.nextInt()));
        in.close();
    }

    public static int getSumOfDigits(int someNumber) {
        int result = 0;
        while (someNumber > 0) {
            result += someNumber % 10;
            someNumber = someNumber / 10;
        }
        return result;
    }
}