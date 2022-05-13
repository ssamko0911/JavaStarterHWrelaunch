package hw009.task004;

/*
Задание 4
Используя IntelliJ IDEA, создайте класс UserArray.
Требуется:
Создать метод, который будет выполнять увеличение длины массива переданного в качестве аргумента,
на 1 элемент. Элементы массива, должны сохранить свое значение и порядок индексов.
Создайте метод, который принимает два аргумента, первый аргумент – типа int [] array, второй
аргумент – типа int value. В теле метода реализуйте возможность добавления второго аргумента
метода в массив по индексу 0, при этом длина нового массива, должна увеличиться на 1 элемент, а
элементы получаемого массива в качестве первого аргумента должны скопироваться в новый массив
начиная с индекса 1.
 */

import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {
        System.out.println("We have an example of array here:");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(arr);
        Scanner in = new Scanner(System.in);
        System.out.println("\nInput the value you'd like to put into index #0 and the result is:");
        printArray(changeArrayLength(arr, in.nextInt()));
        in.close();
    }

    public static int[] changeArrayLength(int[] someArray, int value) {
        int[] newArray = new int[someArray.length + 1];
        newArray[0] = value;
        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = someArray[i - 1];
        }
        return newArray;
    }

    public static void printArray(int[] someArray) {
        for (int arrayElement : someArray) {
            System.out.printf("%d | ", arrayElement);
        }
    }
}