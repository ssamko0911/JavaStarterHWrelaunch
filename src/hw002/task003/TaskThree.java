package hw002.task003;

/*
Задание 3
Используя IntelliJ IDEA, создайте проект.
Создайте три строковые переменные и присвойте им значения:
"\nмоя строка 1"
"\tмоя строка 2"
"\aмоя строка 3"
Выведите значение каждой переменной на экран. Какие отличия вы увидели. Сделайте выводы.
 */

public class TaskThree {
    public static void main(String[] args) {
        String stringOne = "\nмоя строка 1";
        String stringTwo = "\tмоя строка 2";
        String stringThree = "\\aмоя строка 3";
        System.out.println(stringOne);
        System.out.println(stringTwo);
        System.out.println(stringThree);
        // Каждая комбинация символов имеет своё назначение - \n (новая строка (перенос каретки)),
        // \t (табуляция (пробел 4 раза)) и \ - служебный слеш, который заэкратировал, чтобы сделать
        // частью строки.
    }
}