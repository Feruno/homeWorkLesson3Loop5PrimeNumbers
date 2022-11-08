package org.example;

public class PrimeNumber {
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
