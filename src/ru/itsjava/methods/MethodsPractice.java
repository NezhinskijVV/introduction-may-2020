package ru.itsjava.methods;

public class MethodsPractice {

    public static void main(String[] args) { //psvm
        int[] numbersArray1 = new int[]{1, 5, 7, 0};
        int[] numbersArray2 = {1, -1, 3, -7};

        printArray(numbersArray1);
//        printArray(numbersArray2);
//
//        switchFirstAndLastElems(numbersArray1);
//        switchFirstAndLastElems(numbersArray2);
//
//        printArray(numbersArray1);
//        printArray(numbersArray2);

//        int max = getMaxValue(5, 7);
//        int max = 0;
//        recordMaxValue(max, 5, 7);
//        System.out.println(max);


//        subArray(numbersArray1, 1);  //{1 5 7 0}   ->  {5 7 0}
//        System.out.println("After subArray:");
//        printArray(numbersArray1);


//        int value = 5;
//        int[] oneElemArray = {5};
//        changeValueInZero(value);
//        changeValueInZero(oneElemArray);
//
//        System.out.println("Аргентина - Ямайка: " + value + " " + oneElemArray[0]);


    }

    private static void changeValueInZero(int value) {
        value = 0;
    }

    private static void changeValueInZero(int[] array) {
        array[0] = 0;
    }


    public static void subArray(int[] array, int index) {
        int[] resArray = new int[array.length - index]; // 0 0 0


        // 0 1 2    //0 1 2 3
        // 0 0 0    //1 5 7 0
        for (int i = index; i < array.length; i++) {
            resArray[i - index] = array[i];
        }

        array = resArray;
    }


    public static void recordMaxValue(int variable, int num1, int num2) {
        variable = getMaxValue(num1, num2);
    }


    public static int getMaxValue(int num1, int num2) {
//        if (num1 > num2) {
//            return num1;
//        } else {
//            return num2;
//        }

        int res = (num1 > num2) ? num1 : num2;

        return res;
    }

    //метод печати массива
    public static void printArray(int[] array) { //ctrl + alt +l
        System.out.print("{"); //sout
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("}\n");
    }

    //метод смены первого и последнего значения элементов массива
    public static void switchFirstAndLastElems(int[] array) {  // 1   2   3  4
        int temp = array[0];  //temp =1
        array[0] = array[array.length - 1];  //4 2 3 4
        array[array.length - 1] = temp;  //4 2 3 1
    }

}