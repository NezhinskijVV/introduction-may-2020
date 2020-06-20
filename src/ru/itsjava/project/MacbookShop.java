package ru.itsjava.project;

import java.util.Scanner;

public class MacbookShop {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать, у нас лучший магазин макбуков в мире"); //выводим на консоль приветствие
        String[] items = new String[]{"Pro2020", "Air2015", "air2017", "Ipad2016", "IphoneXS"}; //задаем начальный массив
        printItems(items);  //вызываем метод, который выводит на консоль товары

        printMenu();  //метод печатает меню для пользователя
        Scanner scanner = new Scanner(System.in); //создаем сканнер с помощью него будем считывать то, что введет пользователь
        System.out.println("Введите номер меню: ");  // подсказака для пользователя (введите номер меню)
        int menuNum;   //переменная которая отвечает за ввод номера меню
        while ((menuNum = scanner.nextInt()) != 0) {  //продолжаем работу программы до тех пор,пока пользователь не введет 0
            if (menuNum == 1) {   // если 1, то выполняем первый пункт меню
                printItems(items); // выводим все товары
            } else if (menuNum == 2) { //если пользователь ввел 2, то второй пункт
                items = addItem(items, scanner); //добавляем элемент ( сканнер нужен для считывания товара)
            } else if (menuNum == 3) {
                items = buyItem(items, scanner);
            } else if (menuNum == 6) {
                ///Вывести все товары, которые начинаются на А.
                printItemsStartedWithA(items);
            } else if (menuNum == 7) {
                items = sendItem(items, scanner);
            }

            System.out.println("Введите номер меню: ");  // подсказка для пользователя (введите номер меню)
        }
    }

    private static String[] sendItem(String[] items, Scanner scanner) {
        System.out.println("Введите адрес");
        String address = scanner.next(); // считали адрес

        String[] resArray = buyItem(items, scanner); //покупка товара
        System.out.println("Спасибо, мы отправили по указанному адресу: " + address);

        return resArray;

    }

    public static void printItemsStartedWithA(String[] items) {
        System.out.print("Вывод элементов, начинающихся на А:");
        for (String item : items) {
            if (item.substring(0, 1).equalsIgnoreCase("A")) {
                System.out.print(item + " ");
            }
        }
        System.out.println();
    }

    // a b c d e f            d?
    // a b c e f
    private static String[] buyItem(String[] items, Scanner scanner) {
        String[] resItems = new String[items.length - 1]; //создаем массив меньшей длины (удаляем ведь элемент)
        System.out.println("Введите товар: ");
        String item = scanner.next(); //товар введенный пользователем

        int indexDelElem;  //со временем тут будет лежать индекс элемента, который мы хотим удалить
        for (indexDelElem = 0; indexDelElem < items.length; indexDelElem++) {
            if (items[indexDelElem].equals(item)) {
                break;
            }
            resItems[indexDelElem] = items[indexDelElem];
        }

        for (int i = indexDelElem; i < resItems.length; i++) {
            resItems[i] = items[i + 1];
        }

        return resItems;

    }


    //  items   a b c         d?
    // resItems a b c d
    private static String[] addItem(String[] items, Scanner scanner) {
        String[] resItems = new String[items.length + 1]; //массив на 1 большей длины, тк нет места под новый товар
        System.out.println("Введите товар: ");
        String item = scanner.next(); //товар введенный пользователем

        for (int i = 0; i < items.length; i++) {  //скопировали массив
            resItems[i] = items[i];
        }

        resItems[items.length] = item;

        return resItems;
    }

    public static void printItems(String[] items) {
        System.out.print("Наши товары: ");
        for (String elem : items) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void printMenu() {
        System.out.println("Меню:\n" +
                "1. Показать весь ассортимент\n" +
                "2. Добавить товар\n" +
                "3. Купить товар\n" +
                "4. Проверить на наличие\n" +
                "5. Отсортировать товары\n" +
                "6. Вывести все товары, которые начинаются на А\n" +
                "7. Отправить товар по адресу\n" +
                "8.\n" +
                "0. Выход");
    }


}

//Меню:
//1. Показать весь ассортимент
//2. Добавить товар
//3. Купить товар
//4. Проверить на наличие
//5. Отсортировать товары
//6. Вывести в обратном порядке
//7. Отправить по адресу (Вводит адрес после этого вы вызываете метод купить товар)
//8. Вывести все товары, которые начинаются на А.
//Проверить на наличие и если нет, то добавить товар
//Вывести все макбуки
//
//0. Выход
