package ru.itsjava.arrays;


import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {
        int[] numbers = new int[]{-3, 5, 0, 1, 4, -5, 0};

        System.out.println(Arrays.toString(numbers));

        //Вывести элементы массива, которые не деляться на 4
        System.out.println("Вывести элементы массива, которые не деляться на 4:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 4 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

        //Вывести элементы массива, которые больше 0
        System.out.println("Вывести элементы массива, которые больше 0:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

        //Вывести элементы массива, которые меньше 0

        System.out.println("Вывести элементы массива, которые меньше 0:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

        //Найти количество элементов в массиве равных 0.
        System.out.println("Найти количество элементов в массиве равных 0.");
        int zeroCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zeroCount++;
            }
        }
        System.out.println("Количество 0 элементов: " + zeroCount);


        //Найти индекс первого элемента в массиве равного 0.
        System.out.println("Найти индекс первого элемента в массиве равного 0");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                System.out.println(i);
                break;
            }
        }

        //Найти сумму всех элементов массива.
        System.out.println("Найти сумму всех элементов массива:");
        int elementsSum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            elementsSum += numbers[i];
        }
        System.out.println(elementsSum);

        //Найти максимальный элемент массива
        System.out.println("Найти максимальный элемент массива");
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max элемент равен " + max);

    }
}