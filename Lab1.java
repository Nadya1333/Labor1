package com.company;

	import java.util.Scanner;

    public class Lab1{
        public static void main(String[]args) {
            Scanner sc = new Scanner(System.in);
            int max = 0;
            int min = 1;
            for (int i = 1; i <= 5; i++) {
                System.out.println("Введите цифру: ");
                int a = sc.nextInt();
                if (a > max) {
                    max = a;
                } if (a < min) {
                    min = a;
                }
            } System.out.println("Наименьшее из цифр: " + min);
              System.out.println("Наибольшее из цифр: " + max);
        }

    }