package hw008.task002;

/*
Задание 2
Используя IntelliJ IDEA, создайте класс Bank.
Представьте, что вы реализуете программу для банка, которая помогает определить, погасил ли клиент
кредит или нет. Допустим, ежемесячная сумма платежа должна составлять 100 грн. Клиент должен
выполнить 7 платежей, но может платить реже большими суммами. Т.е., может двумя платежами по 300
и 400 грн. Закрыть весь долг.
Создайте метод, который будет в качестве аргумента принимать сумму платежа, введенную экономистом
банка. Метод выводит на экран информацию о состоянии кредита (сумма задолженности, сумма
переплаты, сообщение об отсутствии долга).
 */

import java.util.Locale;
import java.util.Scanner;

public class Bank {
    public static final double REGULAR_PAYMENT = 100;
// Мог не совсем корректно трактовать задачу, готов исправить.
    public static void main(String[] args) {
        System.out.println("Input your initial credit amount (UAH):");
        Scanner in = new Scanner(System.in);
        double credit = in.nextDouble();
        System.out.println("Input your current payment (UAH):");
        double sumOfPayment = in.nextDouble();
        showCreditInfo(sumOfPayment, credit);
        in.close();
    }

    public static void showCreditInfo(double someAmount, double someCreditSize) {
        System.out.println("Current information:".toUpperCase(Locale.ROOT));
        if (someAmount == REGULAR_PAYMENT) {
            System.out.printf("You've paid %.2f UAH.", someAmount);
            System.out.printf("\nRest of payment is %.2f UAH.", someCreditSize - someAmount);
            System.out.printf("\nDebt for a current payment is %.2f UAH.", 0.0);
        } else if (someAmount > REGULAR_PAYMENT) {
            System.out.printf("You've paid %.2f UAH.", someAmount);
            System.out.printf("\nRest of payment is %.2f UAH.", someCreditSize - someAmount);
            System.out.printf("\nOverpayment is %.2f UAH.", someAmount - REGULAR_PAYMENT);
        } else {
            System.out.printf("You've paid %.2f UAH.", someAmount);
            System.out.printf("\nRest of payment is %.2f UAH.", someCreditSize - someAmount);
            System.out.printf("\nDebt for a current payment is %.2f UAH. You need pay this debt ASAP!", REGULAR_PAYMENT - someAmount);
        }
    }
}