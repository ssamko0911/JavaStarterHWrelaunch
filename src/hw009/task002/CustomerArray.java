package hw009.task002;

/*
Задание 2
Используя IntelliJ IDEA, создайте класс CustomerArray.
Требуется:
Создать массив размера N элементов, заполнить его произвольными целыми значениями (размер
массива задает пользователь).
Вывести на экран: наибольшее значение массива, наименьшее значение массива, общую сумму всех
элементов, среднее арифметическое всех элементов, вывести все нечетные значения.
 */

import java.util.Locale;
import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        System.out.println("Input array length to fill it and receive an info:");
        Scanner in = new Scanner(System.in);
        int[] array = new int[in.nextInt()];
        fillArray(array);
        printArray(array);
        showArrayInfo(array);
        in.close();
    }

    public static void fillArray(int[] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = (int) (Math.random() * 89);
        }
    }

    public static void printArray(int[] someArray) {
        System.out.println("Values in given array:");
        for (int arrayElement : someArray) {
            System.out.printf("%d | ", arrayElement);
        }
    }

    public static void writeLines() {
        System.out.println("_".repeat(40));
    }

    public static void showArrayInfo(int[] someArray) {
        System.out.println("\n\narray information:".toUpperCase(Locale.ROOT));
        int max = 0;
        int min = someArray[0];
        int sum = 0;
        writeLines();
        System.out.println("Odds in this array are:");
        for (int arrayElement : someArray) {
            if (arrayElement % 2 != 0) {
                System.out.printf("%d | ", arrayElement);
            }
            if (arrayElement > max) {
                max = arrayElement;
            }
            if (arrayElement < min) {
                min = arrayElement;
            }
            sum += arrayElement;
        }
        System.out.println();
        writeLines();
        System.out.printf("Max value in given array is %d.", max);
        System.out.printf("\nMin value in given array is %d.", min);
        System.out.printf("\nSum of all array values is %d.", sum);
        System.out.printf("\nAverage of all array values is %.2f.\n", (double) sum / someArray.length);
        writeLines();
    }
}