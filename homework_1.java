package ru.geekbrains;

public class homework_1 {

    // Задание 1

    public static void main(String[] args) {
        System.out.println(taskNumberThree(2, 3, 10, 5));
        System.out.println(taskNumberFour(15, 6));
        taskNumberFive(0);
        System.out.println(taskNumberSix(0));
        taskNumberSeven("Maksim");
        taskStar(400);
    }

    // Задание 2
    byte a = 32;
    short b = 31000;
    int c = 2147000000;
    long d = 3L;
    float e = 65.56F;
    double f = 15.3234D;
    char g = 'G';
    boolean h = true;

    // Задание 3

    public static int taskNumberThree(int a, int b, int c, int d) {
        return a * (b + c / d);
    }

    // Задание 4

    public static boolean taskNumberFour(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    // Задание 5

    public static void taskNumberFive(int a) {
        if (a >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }

    }

    // Задание 6

    public static boolean taskNumberSix(int a) {
        return a < 0;
    }

    // Задание 7

    public static void taskNumberSeven(String name) {
        System.out.println("Привет, " + name + "!");
    }

    //Задание 8*

    public static void taskStar(int a) {
        if ((a % 4 != 0 || a % 100 == 0) && a % 400 != 0) {
            System.out.println("год не високосный");
        } else {
            System.out.println("год високосный");
        }

    }
}