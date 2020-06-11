package ru.itsjava.arrays;

import java.util.Scanner;

public class ArraysPractice {

    public static void main(String[] args) {
////        int[] numbers = new int[5];
//
////        for (int i = 0; i < numbers.length; i++) {
////            System.out.println(numbers[i]);
////        }
//
//        int[] notEmptyNumbers = new int[]{4, 5, 7, -6, 3, 7};
//        //вывести последний элемент массива
//        System.out.println(notEmptyNumbers[notEmptyNumbers.length - 1]);
//
//
////        System.out.println(notEmptyNumbers[notEmptyNumbers.length]);   <- ArrayIndexOutOfBoundsException
//
////вывести все элементы массива
//
//        System.out.println("Вывод массива:");
//        for (int i = 0; i < notEmptyNumbers.length; i++) {
//            System.out.print(notEmptyNumbers[i] + " ");
//        }
//
//        //вывести все элементы начиная с 4 те -6 3 7
//        System.out.println("\nВывести все элементы начиная с 4 те -6 3 7");
//        for (int i = 3; i < notEmptyNumbers.length; i++) {
//            System.out.print(notEmptyNumbers[i] + " ");
//        }
//
//        //вывести первые 3 элемента 4, 5, 7
//        System.out.println("\nВывести первые 3 элемента 4, 5, 7");
//        for (int i = 0; i < 3; i++) {
//            System.out.print(notEmptyNumbers[i] + " ");
//        }
//
//        // вывести каждый 3 элемент 7 и 7
//        System.out.println("\nВывести каждый 3 элемент 7 и 7");
//        for (int i = 2; i < notEmptyNumbers.length; i = i + 3) {
//            System.out.print(notEmptyNumbers[i] + " ");
//        }
//
//
//        //вывести массив задом наперед
//        System.out.println("\nВывести массив задом наперед");
//        for (int i = notEmptyNumbers.length - 1; i >= 0; i--) {
//            System.out.print(notEmptyNumbers[i] + " ");
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите данные квадратного уравнения: а, b, c");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        System.out.println("Вы ввели данные для квадратного уравнения " + a + "X^2 " + " + " + b + "x" + " + " + c);


        if (a == 0) {
            System.out.println("Уравнение не является квадратным");
        }
        double D = b * b - 4 * a * c;

        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения " + x1 + "_" + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Корень уравнения " + x);
        } else {
            System.out.println("Уравнение не имеет корней ");
        }
    }
}
