package com.bridgelabz;

public class TestMax {

    static int maxNumber(Integer a1, Integer a2, Integer a3) {
        if (a1.compareTo(a2) == 1) {
            if (a1.compareTo(a3) == 1) {
                return a1;
            } else
                return a3;
        } else if (a2.compareTo(a3) == 1) {
            return a2;
        } else {
            return a3;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Test of maximum 3 variables program ");

        Integer a1 = 7, a2 = 82, a3 = 50;

        System.out.println("maximum number is : " + maxNumber(a1, a2, a3));
    }
}