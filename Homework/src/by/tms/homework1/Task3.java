package by.tms.homework1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество дней: ");
        int N = in.nextInt();
        int i = 1, a = 1, sum = 0, max = 0;
        do {
            System.out.printf("Введите количество осадков %d-го дня: ", i++);
            int A = in.nextInt();
            sum += A;
            if (A > max) {
                max = A;
            }
            a++;
        }
        while (a < N + 1);
        double sred = (double) sum / N;
        System.out.printf("Количество дней: %d \n", N);
        System.out.printf("Сумма осадков за %d дней: %d \n", N, sum);
        System.out.printf("Среднее количество осадков за %d дней: %f \n", N, sred);
        System.out.printf("Максимальное количество дневных осадков за %d дней: %d ", N, max);
    }
}
