package hw006.task003;

/*
Задание 3
Используя IntelliJ IDEA, создайте класс.
Используя циклы и метод:
System.out.print("*"), System.out.print(" "), System.out.print("\n") (для перехода на
новую строку).
Выведите на экран:
 прямоугольник
 прямоугольный треугольник
 равносторонний треугольник
 ромб
 */

import java.util.Scanner;

public class Draws {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input size of the rectangle's height:");
        int height = in.nextInt();
        System.out.println("Input width:");
        int width = in.nextInt();
        System.out.println("Rectangle:");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("-".repeat(40));

        System.out.println("Input size of the triangle's base:");
        int base = in.nextInt();
        System.out.println("Right Triangle:");

        for (int i = 1; i <= base; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("-".repeat(40));

        System.out.println("Input size of the triangle's height:");
        int heightOne = in.nextInt();
        System.out.println("Strict triangle:");
        for (int i = 1; i <= heightOne; i++) {
            for (int j = 0; j < heightOne * 2; j++) {
                if (j >= heightOne + i || j <= heightOne - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

        System.out.println("-".repeat(40));

        System.out.println("Input size from the TOP to the MIDDLE of the ROMB:");
        int heightTwo = in.nextInt();
        System.out.println("ROMB:");

        for (int i = 1; i <= heightTwo; i++) {
            for (int j = 0; j < heightTwo * 2; j++) {
                if (j >= heightTwo + i || j <= heightTwo - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

        for (int i = heightTwo - 1; i > 0; i--) {
            for (int j = 0; j < heightTwo * 2; j++) {
                if (j >= heightTwo + i || j <= heightTwo - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        in.close();
    }
}