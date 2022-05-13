package hw008.task003;

/*
Задание 3
Имеется - N клиентов, которым компания производитель должна доставить товар. Сколько существует
возможных маршрутов доставки товара, с учетом того, что товар будет доставлять одна машина?
Используя IntelliJ IDEA, создайте класс Delivery.
Напишите программу, которая будет рассчитывать и выводить на экран количество возможных вариантов
доставки товара. Для решения задачи, используйте факториал N!, рассчитываемый с помощью рекурсии.
Объясните, почему не рекомендуется использовать рекурсию для расчета факториала. Укажите слабые
места данного подхода.
 */

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        System.out.println("Input the amount of customers, waiting for delivery:");
        Scanner in = new Scanner(System.in);
        System.out.printf("Number of possible routes to deliver goods is %d.", getQuantityRoutes(in.nextInt()));
        in.close();
    }

    public static int getQuantityRoutes(int someCustomersQuantity) {
        int quantityOfRoutes = someCustomersQuantity--;
        if (someCustomersQuantity != 0) {
            quantityOfRoutes *= getQuantityRoutes(someCustomersQuantity);
        }
        return quantityOfRoutes;
    }
}