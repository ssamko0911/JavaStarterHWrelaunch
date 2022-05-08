package hw003.task002;

/*
Задание 2
Используя IntelliJ IDEA, создайте класс ArithmeticAverage.
Вычислите среднее арифметическое трех целочисленных значений и выведите его на экран.
С какой проблемой вы столкнулись? Какой тип переменных лучше использовать для корректного
отображения результата?
 */

import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {
        System.out.println("Insert three digits to receive average (each digit should be separated with Enter):");
        Scanner in = new Scanner(System.in);
        System.out.printf("The average is %.2f.", (double) (in.nextInt() + in.nextInt() + in.nextInt()) / 3);
        // Чтобы избежать кастинг к типу данных дабл, можно сразу использовать этот тип данных
    }
}