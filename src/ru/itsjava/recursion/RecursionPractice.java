package ru.itsjava.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class RecursionPractice {

    public static void main(String[] args) { //psvm
        //Задача: Найти факториал числа 5! = 1 * 2 * 3 * 4 * 5
        Scanner console = new Scanner(System.in);
//        System.out.println("Введите число для вычисления факториала");
//
//        int num = console.nextInt();
//        System.out.println("Факториал " + num + " = " + factorial(num));
//        System.out.println("Факториал " + num + " = " + recursionFactorial(num));

        System.out.println("Найти индекс элемента в отсортрованном массиве");
        int[] array = new int[]{-1, 5, 8, 10, 25, 47, 49, 65, 100};
        System.out.println(Arrays.toString(array));
        System.out.println("Введите число, индекс которого вы хотите найти");
        int numForBinarySearch = console.nextInt();
        System.out.println("Индекс равен " + binarySearch(numForBinarySearch, 0, array.length, array));

    }

    private static int binarySearch(int numForBinarySearch, int begin, int end, int[] array) {
        //базовый случай
        int midIndex = begin + (end - begin) / 2;

        if (numForBinarySearch == array[midIndex]) {
            return midIndex;
        }
        //шаг рекурсии
        //[-1, 5, 8, 10, 25, 47, 49, 65, 100]
        // Загадал numForBinarySearch = 65
        //array[midIndex] = 25
        if (numForBinarySearch > array[midIndex]) {
            return binarySearch(numForBinarySearch, midIndex + 1, end, array);
        }
        //[-1, 5, 8, 10, 25, 47, 49, 65, 100]
        // Загадал numForBinarySearch = 5
        // array[midIndex] = 25
        return binarySearch(numForBinarySearch, begin, midIndex - 1, array);
    }

    private static int recursionFactorial(int num) {
        //1. Базовый случай
        if ((num == 1) || (num == 0)) {
            return 1;
        }
        //2. Шаг рекурсии (сведение задачи к более простой)
        return num * recursionFactorial(num - 1);
    }


    public static int factorial(int num) {
        if (num < 0) {
            System.err.println("Ввели не корректное число для вычисления факториала: " + num);
            return -1;
        }

        if ((num == 0) || (num == 1)) {
            return 1;
        }

        int res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }

}