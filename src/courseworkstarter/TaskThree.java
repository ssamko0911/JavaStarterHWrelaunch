package courseworkstarter;

/*
Задача 3.
Создайте программу, которая выводит в консоль число имени, например, на вход Roman = R(18) +
О(15) + M(13) + A(1) + N(14) = 61 на выход 61.

 */

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        System.out.println("Input your name to receive a sum of all digits from letters:");
        Scanner in = new Scanner(System.in);
        System.out.printf("Sum is %d.", getSumOfAllDigitsFromLetters(in.next()));
        in.close();
    }

    public static int getSumOfAllDigitsFromLetters(String someString) {
        char[] charsFromString = someString.toCharArray();
        int sum = 0;
        for (char character : charsFromString) {
            sum += Character.getNumericValue(character);
        }
        return sum;
    }
}