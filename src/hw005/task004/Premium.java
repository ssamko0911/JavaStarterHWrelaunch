package hw005.task004;

import java.util.Scanner;

/*
Задание 4
Используя IntelliJ IDEA, создайте класс Premium.
Напишите программу расчета начисления премий сотрудникам. Премии рассчитываются согласно
выслуге лет.
Если выслуга до 5 лет, премия составляет 10% от заработной платы.
Если выслуга от 5 лет (включительно) до 10 лет, премия составляет 15% от заработной платы.
Если выслуга от 10 лет (включительно) до 15 лет, премия составляет 25% от заработной платы.
Если выслуга от 15 лет (включительно) до 20 лет, премия составляет 35% от заработной платы.
Если выслуга от 20 лет (включительно) до 25 лет, премия составляет 45% от заработной платы.
Если выслуга от 25 лет (включительно) и более, премия составляет 50% от заработной платы.
Результаты расчета, выведите на экран.
 */

public class Premium {
    public static final double BONUS_ONE = 0.10;
    public static final double BONUS_TWO = 0.15;
    public static final double BONUS_THREE = 0.25;
    public static final double BONUS_FOUR = 0.35;
    public static final double BONUS_FIVE = 0.45;
    public static final double BONUS_SIX = 0.50;

    public static void main(String[] args) {
        System.out.println("This is bonus calculator. Input your period of work (years):");
        Scanner in = new Scanner(System.in);
        int periodOfWork = in.nextInt();
        System.out.println("Input your salary (UAH):");
        int salary = in.nextInt();
        if (periodOfWork < 5) {
            System.out.printf("\nYour bonus is %.2f UAH.", salary * BONUS_ONE);
        } else if (periodOfWork > 5 && periodOfWork < 10) {
            System.out.printf("\nYour bonus is %.2f UAH.", salary * BONUS_TWO);
        } else if (periodOfWork > 10 && periodOfWork < 15) {
            System.out.printf("\nYour bonus is %.2f UAH.", salary * BONUS_THREE);
        } else if (periodOfWork > 15 && periodOfWork < 20) {
            System.out.printf("\nYour bonus is %.2f UAH.", salary * BONUS_FOUR);
        } else if (periodOfWork > 20 && periodOfWork < 25) {
            System.out.printf("\nYour bonus is %.2f UAH.", salary * BONUS_FIVE);
        } else {
            System.out.printf("\nYour bonus is %.2f UAH.", salary * BONUS_SIX);
        }
        in.close();
    }
}