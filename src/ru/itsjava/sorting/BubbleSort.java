package ru.itsjava.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{9, 8, 4, 5, 7, 6, 2, 3, 1};
        System.out.println("До: " + Arrays.toString(array));

        //сортировка
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1]; //меняем местами соседние элементы
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }


        System.out.println("После: " + Arrays.toString(array));


    }
}
