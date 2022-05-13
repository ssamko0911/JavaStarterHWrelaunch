package courseworkstarter;

/*
Задача 4.
Создайте программу, которая выводит в консоль число даты. Например, на вход 02/11/1995 = 0 +
2 + 1 + 1 + 1 + 9 + 9 + 5 = 28 на выход = 28
 */

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        System.out.println("Input date to receive a sum of all digits:");
        Scanner in = new Scanner(System.in);
        System.out.printf("Sum is %d.", getSumOfAllDateDigits(in.next()));
        in.close();
    }

    public static int getSumOfAllDateDigits(String someValue) {
        int sum = 0;
        for (char item : someValue.toCharArray()) {
            if (Character.isDigit(item)) {
                sum += Integer.parseInt(String.valueOf(item));
            }
        }
        return sum;
    }
}