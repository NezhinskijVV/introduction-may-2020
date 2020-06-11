package ru.itsjava;


public class Main {

    public static void main(String[] args) { //psvm

        // write your code here
        System.out.println("Hi!");
        System.out.println("Privet!"); //sout

        System.out.println("Привет, Настя кстати!");

        int num1 = -1;
        int num2 = 8;

        int sum = num1 + num2;
        System.out.println("Сумма " + num1 + " и " + num2 + " равна " + sum);

        //ctrl + alt + l форматирование кода

        num1++;
//        num1 = num1 + 1;
        System.out.println(num1);
        System.out.println(5 > 3);
        System.out.println(5 != 3);
        System.out.println(5 < 3);

        System.out.println("Начало оператора if");
        if (5 > 3) {
            System.out.println("Условие выполнено");
        } else {
            System.out.println("Условие не выполнено");
        }
        System.out.println("Конец оператора if");

        int num3 = 3;
        int num4 = 3;
        if (num3 > num4) {
            System.out.println(num3 + ">" + num4);
        } else if (num3 < num4) {
            System.out.println(num3 + "<" + num4);
        } else {
            System.out.println(num3 + "==" + num4);
        }

        // 1 условие или 2 условие
        if ((num3 > num4) || (num3 < num4)) {
            System.out.println(num3 + " != " + num4);
        }


        char ch = 'c';
        System.out.println(ch);

        char ch2 = '\u1002';
        System.out.println(ch2);

        boolean bool = true;
        System.out.println(bool);

        double d1 = 5.4;
        System.out.println(d1);

        float f1 = 5.4f;
        System.out.println(f1);
        System.out.println(-f1);



    }
}

//HW: 1. Вывести для всех операторов. (арифметические, сравнения и отношения)
//    2. Таблица истинности (вывести ее)
//    3.* Побитовые операции
//pastebin.com