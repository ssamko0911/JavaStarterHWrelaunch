package hw006.task004;

/*
Задание 4
Имеется N клиентов, которым компания производитель должна доставить товар. Сколько существует
возможных маршрутов доставки товара, с учетом того, что товар будет доставлять одна машина?
Используя IntelliJ IDEA, создайте класс Delivery.
Напишите программу, которая будет рассчитывать, и выводить на экран количество возможных
вариантов доставки товара. Для решения задачи, используйте факториал N!, рассчитываемый с помощью
цикла do-while.
 */

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        System.out.println("To calculate routes, please, input amount of your company customers:");
        Scanner in = new Scanner(System.in);
        int customersAmount = in.nextInt();
        int factorial = 1;
        do {
            factorial *= customersAmount--;
        } while (customersAmount > 0);
        System.out.printf("Quantity of routes is %d.", factorial);
        in.close();
    }
}