package ru.itsjava.arrays;

public class WhilePractice {

    public static void main(String[] args) {
        int count = 4;

        System.out.println("while начало");
        while (count < 5){
            System.out.println("Я люблю Java!"); //sout
            count++;
        }
        System.out.println("while конец");

//        while (true){
//            System.out.print(1);
//        }

        //Вывести на консоль 7 раз "Я люблю делать ДЗ" через цикл while


        int countOfHW = 1;

        System.out.println("while начало");
        while (countOfHW < 8){
            System.out.println("Я люблю делать ДЗ"); //sout
            countOfHW++;
        }
        System.out.println("while конец");

    }
}