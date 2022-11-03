package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */

class PrimeNumber {
    private int number;
    private boolean check = true;

    public PrimeNumber(int num) {
        number = num;
    }

    public boolean checkNum() {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}

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
