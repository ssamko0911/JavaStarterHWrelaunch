package hw003.task003;

/*
Задание 3
Используя IntelliJ IDEA, создайте класс Circle.
Создайте константу с именем PI (число π «пи»), создайте переменную радиус с именем – r. Используя
формулу πR2, вычислите площадь круга и выведите результат на экран.
 */

import java.util.Scanner;

public class Circle {
    public static final double PI = Math.PI;

    public static void main(String[] args) {
        System.out.println("Input radius to calculate the square of circle:");
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        System.out.printf("The area of circle is %.2f.", PI * r * r);
        in.close();
    }
}