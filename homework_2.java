package ru.geekbrains;

public class homework_2 {

    public static void main(String[] args) {
        taskNumberOne();
        taskNumberTwo();
        taskNumberThree();
        taskNumberFour();
        taskNumberFive();


    }
    // Задание 1
    private static void taskNumberOne() {
        System.out.println("\r\nЗадание 1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
            System.out.print(arr[i] + " ");
        }
    }

    // Задание 2
    private static void taskNumberTwo() {
        System.out.println("\r\nЗадание 2");
        int[] arr1 = new int[8];
        for (int i = 0, a = 1; i < arr1.length; i++, a = a + 3) {
            arr1[i] = a;
            System.out.print(arr1[i] + " ");
        }
    }

    // Задание 3
    private static void taskNumberThree() {
        System.out.println("\r\nЗадание 3");
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
            System.out.print(arr2[i] + " ");
        }
    }

    //Задание 4
    private static void taskNumberFour() {
        System.out.println("\r\nЗадание 4");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int minimum = arr3[0];
        int maximum = arr3[0];
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < minimum) {
                minimum = arr3[i];
            }
            if (arr3[i] > maximum) {
                maximum = arr3[i];
            }
        }
        System.out.println("Мимимальное значение в массиве " + minimum);
        System.out.println("максимальное значение в массиве " + maximum);
    }

    //Задание 5*
    private static void taskNumberFive() {
        System.out.println("\r\nЗадание 5");
        int[][] arr4 = new int[10][10];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                if (i == j) {
                    arr4[i][j] = 1;
                }
                if (i == (j2-1)) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }

            System.out.print("\r\n");
        }
    }
}




