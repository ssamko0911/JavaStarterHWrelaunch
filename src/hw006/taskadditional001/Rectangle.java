package hw006.taskadditional001;

/*
Задание
Используя IntelliJ IDEA, создайте класс Rectangle.
Создайте две целочисленные переменные и задайте им некоторые значения. Применяя технику
вложенных циклов, нарисуйте прямоугольник из звездочек. Используйте значения ранее созданных
переменных для указания высоты и ширины прямоугольника.
 */

import java.util.Locale;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println("To draw rectangle, please, input height: ");
        Scanner in = new Scanner(System.in);
            int height = in.nextInt();
            System.out.println("Input width: ");
            int width = in.nextInt();
            System.out.println("Rectangle:".toUpperCase(Locale.ROOT));
            for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}