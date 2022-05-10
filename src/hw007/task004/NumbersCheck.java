package hw007.task004;

/*
Задание 4
Используя IntelliJ IDEA, создайте класс NumbersCheck.
Напишите метод, который будет определять:
1) является ли введенное число положительным или отрицательным.
2) Является ли оно простым (используйте технику перебора значений).
Простое число – это натуральное число, которое делится на 1 и само на себя. Чтобы определить простое
число или нет, следует найти все его целые делители. Если делителей больше 2-х, значит оно не простое.
3) Делится ли на 2, 5, 3, 6, 9 без остатка.
 */

import java.util.Locale;
import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        System.out.println("Input digit to get the information:".toUpperCase(Locale.ROOT));
        Scanner in = new Scanner(System.in);
        int digitToCheck = in.nextInt();
        showDigitInfo(digitToCheck);
        in.close();
    }

    public static void showDigitInfo(int someDigit) {
        System.out.println("digit information: ".toUpperCase(Locale.ROOT));
        if (someDigit >= 0) {
            System.out.println("Given digit is positive.");
        } else {
            System.out.println("Given digit is negative.");
        }

        int counter = 0;
        for (int i = 1; i <= someDigit; i++) {
            if (someDigit % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println("Given digit is simple");
        } else {
            System.out.println("Given digit isn't simple");
        }

        if (someDigit % 2 == 0) {
            System.out.println("Given digit is divisible by 2 without a remainder.");
        }
        if (someDigit % 3 == 0) {
            System.out.println("Given digit is divisible by 3 without a remainder.");
        }
        if (someDigit % 5 == 0) {
            System.out.println("Given digit is divisible by 5 without a remainder.");
        }
        if (someDigit % 6 == 0) {
            System.out.println("Given digit is divisible by 6 without a remainder.");
        }
        if (someDigit % 9 == 0) {
            System.out.println("Given digit is divisible by 9 without a remainder.");
        }
    }
}