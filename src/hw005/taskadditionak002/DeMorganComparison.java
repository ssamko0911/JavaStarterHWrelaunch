package hw005.taskadditionak002;

/*
Задание 2
Используя IntelliJ IDEA, создайте класс DeMorganComparison.
Используя теорему Де Моргана, преобразуйте исходное выражение A | B, в эквивалентное выражение.
 */

public class DeMorganComparison {
    public static void main(String[] args) {
        // A | B = !(!(!A & !B));
        boolean a = true;
        boolean b = false;
        System.out.printf("Result of task: \"A | B = %s\".", !(!(!a & !b)));
    }
}