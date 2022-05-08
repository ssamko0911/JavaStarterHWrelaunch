package hw003.task001;

/*
Задание 1
Имеется 3 переменные типа int x = 10, y = 12, и z = 3;
Выполните и рассчитайте результат следующих операций для этих переменных:
 x += y - x++ * z;
 z = --x – y * 5;
 y /= x + 5 % z;
 z = x++ + y * 5;
 x = y - x++ * z;
 */

public class Task001 {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int z = 13;
        System.out.printf("x += y - x++ * z = %d", x += y - x++ * z);
        System.out.printf("\nz = --x – y * 5 = %d", z = --x - y * 5);
        System.out.printf("\ny /= x + 5 %s z = %d", "%", y /= x + 5 % z);
        System.out.printf("\nz = x++ + y * 5 = %d", z = x++ + y * 5);
        System.out.printf("\nx = y - x++ * z = %d", x = y - x++ * z);
    }
}