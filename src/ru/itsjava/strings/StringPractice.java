package ru.itsjava.strings;

public class StringPractice {

    public static void main(String[] args) {
        String str = "Я строка";
        System.out.println(str);

        System.out.println("Длина строки: " + str.length());
        System.out.println("Строка 1 " + "Строка 2");
        char firstSymbol = str.charAt(0);
        System.out.println(firstSymbol);

        //сравнение примитивов и ссылок ==
        System.out.println(5 == 5);

        //сравнить ссылочные типы используем equals
        System.out.println("Privet".equals("privet"));

        System.out.println("Privet".equalsIgnoreCase("prIveT"));

        System.out.println("str.substring(2) = " + str.substring(2));

    }
}