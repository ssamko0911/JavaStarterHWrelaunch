package hw003.task004;

/*
Задание 4
Используя IntelliJ IDEA, создайте класс Volume.
Напишите программу расчета объема - V и площади поверхности -S цилиндра.
Объем V цилиндра радиусом – R и высотой – h, вычисляется по формуле: V = πR2h
Площадь S поверхности цилиндра вычисляется по формуле: S = 2πR2 + 2πR2 = 2πR(R+h)
Результаты расчетов выведите на экран.
 */

import java.util.Scanner;

public class Volume {
    public static final double PI = Math.PI;

    public static void main(String[] args) {
        System.out.println("To make calculations about Cylinder input radius:");
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        System.out.println("And input height:");
        int h = in.nextInt();
        System.out.printf("The volume is %.2f.", PI * r * r * h);
        System.out.printf("\nThe surface area is %.2f.", 2 * PI * r * (r + h));
        in.close();
    }
}