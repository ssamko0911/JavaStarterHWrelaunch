package hw004.taskadditional001;

import java.util.Scanner;

/*
Задание 1
Используя IntelliJ IDEA, создайте класс Translator.
Напишите программу русско-английский переводчик. Программа знает 10 слов о погоде. Требуется,
чтобы пользователь вводил слово на русском языке, а программа давала ему перевод этого слова на
английском языке. Если пользователь ввел слово, для которого отсутствует перевод, то следует вывести
сообщение, что такого слова нет.
 */
public class Translator {
    public static void main(String[] args) {
        System.out.println("Перекладач погодних термінів. Вкажіть слово для перекладу на англійську мову: ");
        Scanner in = new Scanner(System.in);
        String word = in.next();
        switch (word) {
            case "Туман" -> System.out.print("Переклад - fog.");
            case "Сніг" -> System.out.println("Переклад - snow.");
            case "Дощ" -> System.out.println("Переклад - rain.");
            case "Вітер" -> System.out.println("Переклад - wind.");
            case "Ураган" -> System.out.println("Переклад - hurricane.");
            case "Хмарно" -> System.out.println("Переклад - cloudy.");
            case "Холодно" -> System.out.println("Переклад - cold.");
            case "Мороз" -> System.out.println("Переклад - frost.");
            case "Тепло" -> System.out.println("Переклад - warm.");
            case "Блискавка" -> System.out.println("Переклад - lightning.");
            default -> System.err.println("Відсутній термін у словнику.");
        }
    }
}