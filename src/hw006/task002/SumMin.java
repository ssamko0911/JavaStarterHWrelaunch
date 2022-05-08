package hw006.task002;

/*
Задание 2
Используя IntelliJ IDEA, создайте класс SumMin.
Дано два числа A и B (A<B) выведите суму всех чисел, расположенных между данными числами на экран.
Дано два числа A и B (A<B) выведите все нечетные значения, расположенные между данными числами. 
 */

import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {
        System.out.println("Here's a condition - A < B. Input digit A:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Input B:");
        int b = in.nextInt();
        if (a < b) {
            int sum = 0; // A and B digits are excluded;
            System.out.println("Row of odds between A and B:");
            for (int i = a + 1; i < b; i++) {
                sum += i;
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.printf("\nSum of digits between A and B equals %d.", sum);
        } else {
            System.err.println("Unexpected situation - A is bigger than B (or equals B). Program is stopped.");
        }
        in.close();
    }
}