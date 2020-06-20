package ru.itsjava.hw;

import java.util.Scanner;

public class HWPractice {

    public static void main(String[] args) {
        int[] numbers = new int[]{-3, -5, -1, 4, -5, 11, -21, 10, 21, 10};
        int[] numbers2 = new int[]{0, 2, 7, -10, -3, 0};

// вывести элементы больше нуля в обратном порядке
        printPositiveElements(numbers);
        System.out.println();
        printPositiveElements(numbers2);
        System.out.println();

        printIndexesZeroElements(numbers);
        System.out.println();
        printIndexesZeroElements(numbers2);
        System.out.println();

        int prodNum1 = productOfElemsInArray(numbers);
        System.out.println(prodNum1);
        int prodNum2 = productOfElemsInArray(numbers2);
        System.out.println(prodNum2);

        double midSumNum = midSumArray(numbers);
        System.out.println(midSumNum);
        double midSumNum2 = midSumArray(numbers2);
        System.out.println(midSumNum2);

        int evenSumNum = sumElementsOfEvenIndexes(numbers);
        System.out.println(evenSumNum);
        int evenSumNum2 = sumElementsOfEvenIndexes(numbers2);
        System.out.println(evenSumNum2);

        int prodOddNum1 = prodOddNumArray(numbers);
        System.out.println(prodOddNum1);
        int prodOddNum2 = prodOddNumArray(numbers2);
        System.out.println(prodOddNum2);


//        7. Вывести число вида: num = d * 5 + r Например, 21 = 4 * 5 + 1 (делитель 5)
//        9. Найти среднее из трех чисел

        System.out.println("7. Вывести число вида: num = d * 5 + r Например, 21 = 4 * 5 + 1 (делитель 5)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число, дорогой брат!");
        int num = scanner.nextInt();
        System.out.println(num + " = " + (num / 5) + " * 5 + " + (num % 5));
        System.out.println("9. Найти среднее из трех чисел");
        System.out.println("Введите 3 целых числа, дорогой брат и купи арбуз!");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if ((num2 >= num1) && (num2 <= num3)) {
            System.out.println("Среднее: " + num2);
        } else if ((num1 >= num2) && (num1 <= num3)) {
            System.out.println("Среднее: " + num1);
        } else {
            System.out.println("Среднее: " + num3);
        }

        // Числа Фибоначчи

        System.out.println("fibnocci(5) = " + fibnocci(5));

        System.out.println("recursion(4) = " + recursion(4));

    }

    public static String recursion(int n) {
        // Базовый случай
        if (n == 1) {
            return "1";
        }
        // Шаг рекурсии/рекурсивное условие
        return recursion(n - 1) + " " + n;
    }

    // 0 1 1 2 3 5 8 13 21 34
    //Определение чисел Фибоначчи:
    // fib(1)  0
    // fib (2)  1
    // fib(n) = fib(n-1) + fib(n-2)
    public static int fibnocci(int num) {
        //Базовый случай
        if (num == 1) {
            return 0;
        }

        if (num == 2) {
            return 1;
        }

        //Шаг рекурсии
        return fibnocci(num - 1) + fibnocci(num - 2);
    }

    public static void printPositiveElements(int[] array) {
        System.out.println("Напечатать элементы массива больше нуля");
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                System.out.print(array[i] + " ");
            }
        }
    }


    //вывести индексы элементов равных нулю - как тут использовать елс? если таких элементов нет
    public static void printIndexesZeroElements(int[] array) {
        System.out.println("Вывести индексы элементов равных нулю");
        boolean areExistZeroElements = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.print("Индекс: " + i + " ");
                areExistZeroElements = true;
            }
        }
        if (!areExistZeroElements) {
            System.out.print("Таких элементов нет");
        }
    }


    //Найти произведение всех элементов массива - вопрос про 0?
    public static int productOfElemsInArray(int[] array) {
        System.out.println("Найти произведение всех элементов массива");
        int prodNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == 0) {
                return 0;
            }
            prodNum *= array[i];
        }
        return prodNum; //почему это именно в конце а елс работает дальше
    }

    //найти среднеарифметическое массива
    public static double midSumArray(int[] array) {
        System.out.println("Найти среднеарифметическое массива");
        double sum = array[0]; //вопрос про инт и дабл
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    //Найти сумму элементов с четными индексами
    public static int sumElementsOfEvenIndexes(int[] array) {
        System.out.println("Найти сумму элементов с четными индексами");
        int evenSum = array[0];
        for (int i = 2; i < array.length; i += 2) {
            evenSum += array[i];
        }
        return evenSum;
    }

    //Найти проиведение элементов с нечетными индексами
    public static int prodOddNumArray(int[] array) {
        System.out.println("Найти проиведение элементов с нечетными индексами");
        int prodOddNum = array[1];
        for (int i = 3; i < array.length; i += 2) {
            prodOddNum *= array[i];
        }
        return prodOddNum;
    }
}