package by.epam.jonline.part04;
// 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        int a;
        int b;

        a = enterFromConsole("a >> ");
        b = enterFromConsole("b >> ");

        System.out.println("Вы ввели: " + a + " и " + b);

        int gcd;
        gcd = gcd(a, b);

        double lcm;
        lcm = lcm(a, b, gcd);

        System.out.println("НОД чисел: " + a + " и " + b + " = " + gcd);
        System.out.println("НОК чисел: " + a + " и " + b + " = " + lcm);
    }

    public static double lcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int enterFromConsole(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int value;

        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print(message);
        }
        value = sc.nextInt();
        return value;
    }
}
