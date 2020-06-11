package ru.itsjava.conditionals;


import java.util.Scanner;

public class WorkWithIf {

    public static void main(String[] args) {
        System.out.println("Лекция 2");

        int num1 = 5;
        int num2 = 3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //поменять значения переменных местами с помощью дополнительной переменной
        System.out.println("Поменяем значения переменных местами");
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число");
        int age = scan.nextInt();
        System.out.println("Вы ввели возраст равным " + age);

        //Программа Призывник
        //В зависимости от возраста программа выводит идти служить или нет

        if ((age < 0) || (age > 100)) {
            System.out.println("Возраст не валиден");
        } else if ((age >= 18) && (age < 27)) {
            System.out.println("Иди служить! Не служил -- значит не мужик!");
        } else {
            System.out.println("Служить не надо тебе! Yoda");
        }

        //Вывести количество выданных паспортов
        //от 14 - 20  1 паспорт
        //от 20 - 45  2 паспорта
        //от 45       3 паспорта

        System.out.println("Программа \"Количество выданных паспортов\"");
        System.out.println("Введите ваш возраст");
        int age2 = scan.nextInt();

        if ((age2 < 0) || (age2 > 100)) {
            System.out.println("Возраст не валиден");
        } else if (age2 > 45) {
            System.out.println("3 паспорта");
        } else if (age2 > 20) {
            System.out.println("2 паспорта");
        } else if (age2 > 14) {
            System.out.println("1 паспорт");
        }

        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("true && false = " + (true && false));

    }

}