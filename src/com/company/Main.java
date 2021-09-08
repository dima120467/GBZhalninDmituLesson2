package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 6;
        int b = 1;
        within10and20(a , b);

        int n = -10;
        isPositiveOrNegative(n);

        int d = -10;
        boolean flag = isNegative(d);
        System.out.println("Число отрицательное: " + flag);

        int x = 1;
        int y = 1;
        printWordNTimes(x , y);
    }

        public static void within10and20(int a , int b) {

            if ((a + b) >= 10 && (a + b) <= 20) {
                System.out.println("true");
            } else {
                System.err.println("False");
            }
        }

        public static void isPositiveOrNegative(int n) {
        if (n >= 0) {
            System.out.println("Положительное число");
        }
        if (n < 0) {
            System.out.println("Отрицательное число");
        }
    }

        public static boolean isNegative(int d) {

            if (d < 0) {
                return true;
            } else {
                return false;
            }
        }
        public static void printWordNTimes(int x , int y) {

            for (x = 1; x < 3; x++) {
            for (y = 1; y < 3; y++) {
                System.out.println("x = " + x + "; y = " + y);
                }
            }
    }


    }




























