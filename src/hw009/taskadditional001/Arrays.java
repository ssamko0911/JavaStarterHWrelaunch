package hw009.taskadditional001;

/*
Задание
Используя IntelliJ IDEA, создайте класс Arrays.
Создайте массив размерностью в 10 элементов, выведите на экран все элементы массива в обратном
порядке.
 */

public class Arrays {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        printArray(array);
        reverseArray(array);
    }

    public static void reverseArray(int[] someArray) {
        System.out.println("\nThis is reversed array:");
        for (int i = 0; i < someArray.length; i++) {
            System.out.printf("%d | ", someArray[someArray.length - 1 - i]);
        }
    }

    public static void printArray(int[] someArray) {
        System.out.println("This is given array:");
        for (int arrayElement : someArray) {
            System.out.printf("%d | ", arrayElement);
        }
    }
}