package by.tms.homework1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        int num = in.nextInt();
        int a, x = 0;
        while (num > 0) {
            a = num % 10;
            x += a;
            num = num / 10;
        }
        System.out.printf("Сумма цифр введенного Вами числа = %d ", x);
    }
}
