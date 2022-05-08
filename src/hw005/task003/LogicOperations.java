package hw005.task003;

/*
Задание 3
Используя IntelliJ IDEA, создайте класс LogicOperations.
Имеется 3 переменные типа int x = 5, y = 10, и z = 15;
Выполните и рассчитайте результат следующих операций для этих переменных:
 x += y >> x++ * z;
 z = ++x & y * 5;
 y /= x + 5 | z;
 z = x++ & y * 5;
 x = y << x++ ^ z;
 */

import java.util.Locale;

public class LogicOperations {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 15;
        System.out.println("Results:".toUpperCase(Locale.ROOT));
        x += y >> x++ * z;
        System.out.printf("x += y >> x++ * z = %d", x);
        z = ++x & y * 5;
        System.out.printf("\nz = ++x & y * 5 = %d", z);
        y /= x + 5 | z;
        System.out.printf("\ny /= x + 5 | z = %d", y);
        z = x++ & y * 5;
        System.out.printf("\nz = x++ & y * 5 = %d", z);
        x = y << x++ ^ z;
        System.out.printf("\nx = y << x++ ^ z = %d", x);
    }
}