package hw005.taskadditionak001;
/*
Задание 1
Известно, что у чисел, которые являются степенью двойки, только один бит имеет значение 1.
Используя IntelliJ IDEA, создайте класс PowerOfTwo.
Напишите программу, которая будет выполнять проверку – является ли указанное число степенью
двойки или нет.
 */

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Input number:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.printf("%s.", (number > 0 && (number & (number - 1)) == 0 ?
                "This number is Pow of 2" : "This number isn't Pow of 2"));
    }
}