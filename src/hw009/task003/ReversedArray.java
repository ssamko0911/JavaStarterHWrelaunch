package hw009.task003;

/*
Задание 3
Используя IntelliJ IDEA, создайте класс ReversedArray.
Требуется:
1) Создать метод myReverse(int [] array), который принимает в качестве аргумента массив
целочисленных элементов и возвращает инвертированный массив (элементы массива в обратном
порядке).
2) Создайте метод int [] subArray(int [] array, int index, int count). Метод возвращает
часть полученного в качестве аргумента массива, начиная с позиции указанной в аргументе index,
размерностью, которая соответствует значению аргумента count.
Если аргумент count содержит значение больше чем количество элементов, которые входят в
выбираемую часть исходного массива (от указанного индекса index, до индекса последнего элемента),
то при формировании нового массива размерностью в count, заполните единицами те элементы,
которые не были скопированы из исходного массива.
 */

import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Initial array is:");
        printArray(array);
        System.out.println("\nResult of task#1");
        printArray(myReverse(array));
        System.out.println("\nTask#2:");
        Scanner in = new Scanner(System.in);
        System.out.println("Input index to start a new array with and a length of new array (after each digit press Enter):");
        printArray(subArray(array, in.nextInt(), in.nextInt()));
        in.close();
    }

    public static int[] myReverse(int [] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - i - 1];
        }
        return newArray;
    }

    public static int[] subArray(int[] array, int index, int count) {
        int[] newArray = new int[count];
        for (int i = 0; i < newArray.length; i++) {
            if (index + i <= array.length - 1) {
                newArray[i] = array[index + i];
            } else {
                newArray[i] = 1;
            }
        }
        return newArray;
    }

    public static void printArray(int[] someArray) {
        for (int arrayElement : someArray) {
            System.out.printf("%d | ", arrayElement);
        }
    }
}