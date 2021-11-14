package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int a = sc.nextInt();
        if (a == 1 || a == 2 || a == 12) {
            System.out.println("Данный месяц относится к зиме");
        } else if (a == 3 || a == 4 || a == 5) {
                System.out.println("Данный месяц относится к весне");
            } else if (a == 6 || a == 7 || a == 8 ) {
                    System.out.println("Данный месяц относится к лету");
                } else if (a == 9 || a == 10 || a == 11) {
                        System.out.println("Данный месяц относится к осени");
                    } else if (a > 12) {
                            System.out.println("Такого месяца не существует");
                        }
        }
    }
