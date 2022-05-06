package hw004.task003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Задание 3
 Используя IntelliJ IDEA, создайте класс Interval.
 Напишите программу определения, попадает ли указанное пользователем число от 0 до 100 в числовой
 промежуток [0 - 14] [15 - 35] [36 - 50][51 - 100]. Если да, то укажите, в какой именно промежуток. Если
 пользователь указывает число, не входящее ни в один из имеющихся числовых промежутков, то
 выводится соответствующее сообщение.
 */

public class Interval {
    public static void main(String[] args) throws IOException {
        System.out.println("Input digit from 0 to 100: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        System.out.println(number >= 0 && number <= 14 ? "Digit belongs to interval [0 - 14]." :
                (number >= 15 && number <= 35 ? "Digit belongs to interval [15 - 35]." :
                        (number >= 36 && number <= 50 ? "Digit belongs to interval [36 - 50]." :
                                (number >= 51 && number <= 100 ? "Digit belongs to interval [51 - 100]." : "This digit out of range"))));
        reader.close();
    }
}