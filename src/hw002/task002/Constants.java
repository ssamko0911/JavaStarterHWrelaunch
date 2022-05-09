package hw002.task002;

/*
Задание 2
Используя IntelliJ IDEA, создайте проект.
Дано значение числа pi, которое равно 3,141592653 и значение числа Эйлера е, которое равно
2,7182818284590452. Создайте две переменные, присвойте им значения числа pi и числа е и выведите
их на экран без потери точности.
 */

public class Constants {
    public static void main(String[] args) {
        double pi = Math.PI;
        double e = Math.E;
        System.out.println("PI = " + pi);
        System.out.println("E = " + e);
        System.out.println("-".repeat(40));
        String piVariantTwo = "3.141592653589793";
        String eVariantTwo = "2.7182818284590452";
        System.out.println("PI = " + piVariantTwo);
        System.out.println("E = " + eVariantTwo);
    }
}