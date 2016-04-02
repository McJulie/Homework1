package ru.levelp;

/**
 * Created by Юлия on 02.04.2016.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Решение линейного уравнения вида ax+b=0");
        double a;
        double b;
        Scanner sc1;
        Scanner sc2;
        boolean var = false;
        do {
            System.out.println("Введите коэффициент а: ");
            sc1 = new Scanner(System.in);
            if (sc1.hasNextDouble() == var) {
                System.out.println("Вы ввели не число!");
            }
        } while (sc1.hasNextDouble() == var);
        a = sc1.nextDouble();
        if (a == 0) {
            System.out.println("Нет решений!");
            return;
        }
        do {
            System.out.println("Введите коэффициент b: ");
            sc2 = new Scanner(System.in);
            if (sc2.hasNextDouble() == var) {
                System.out.println("Вы ввели не число!");
            }
        } while (sc2.hasNextDouble() == var);
        b = sc2.nextDouble();
        double result = -b / a;
        if (b == 0) {
            System.out.println("Ваше уравнение: " + a + "x" + "=0");
            System.out.println("Решение: 0");
        } else {
            if (b < 0) {
                System.out.println("Ваше уравнение: " + a + "x" + "-" + Math.abs(b) + "=0");
            } else {
                System.out.println("Ваше уравнение: " + a + "x" + "+" + Math.abs(b) + "=0");
            }
            System.out.println("Решение: " + result);

        }

    }
}


