package hw007.task003;

/*
Задание 3
Используя IntelliJ IDEA, создайте класс Conversion.
Напишите программу, которая будет выполнять конвертирование валют.
Пользователь вводит:
сумму денег в определенной валюте,
курс для конвертации в другую валюту.
Организуйте вывод результата операции конвертирования валюты на экран.
 */


import java.util.Scanner;

public class Conversion {
    // Решил модифицировать задачу - курсы уже есть, происходит выбор валюты и ввод суммы к обмену.
    // Если нужно переписать под условие, готов переделать.
    public static final double UAH_PER_USD = 29.2549;
    public static final double UAH_PER_EURO = 30.8595;
    public static double UAH_PER_GBP = 36.2497;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("For USD exchange press - 1,"
                + System.lineSeparator() + "For EURO exchange press - 2,"
                + System.lineSeparator() + "For GBP exchange press - 3.");
        int currencyChoice = in.nextInt();
        System.out.println("Enter the amount to exchange:");
        switch (currencyChoice) {
            case 1 -> System.out.printf("Your UAH amount is %.2f.", exchangeUSD(in.nextDouble()));
            case 2 -> System.out.printf("Your UAH amount is %.2f.", exchangeEURO(in.nextDouble()));
            case 3 -> System.out.printf("Your UAH amount is %.2f.", exchangeGBP(in.nextDouble()));
            default -> System.err.println("Unknown data. Exchange program is out of running.");
        }
    }

    public static double exchangeUSD(double amount) {
        return UAH_PER_USD * amount;
    }

    public static double exchangeEURO(double amount) {
        return UAH_PER_EURO * amount;
    }

    public static double exchangeGBP(double amount) {
        return UAH_PER_GBP * amount;
    }
}