package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {
        int number;
        boolean check;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Введите число: ");
            number = sc.nextInt();
        } while (number <= 1);
        PrimeNumber prime = new PrimeNumber(number);
        check = prime.checkNum();
        if (check == true) {
            System.out.println("число простое ");
        } else {
            System.out.println("число не простое ");
        }


    }
}
