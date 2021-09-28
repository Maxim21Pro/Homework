package by.tms.homework1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        int num = in.nextInt();
        int a, x1 = 1, x2 = 2;
        System.out.println(x1);
        System.out.println(x2);
        while (num > x2) {
            x1 += x2;
            x2 += x1;
            System.out.println(x1);
            System.out.println(x2);
        }

    }
}
