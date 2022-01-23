package com.galinachitak;

public class Main {

    public static void main(String[] args) {
	// write your code here
        test();
        test2();
    }

    private static void test() {
        int coincidences = 0;
        for (int hour = 1; hour <= 24; hour++) {
            int minutes;
            for (minutes = 0; minutes <= 59; minutes++) {
                if (hour / 10 % 10 == minutes % 10 & hour % 10 == minutes / 10 % 10) {
                    coincidences++;
                }
            }
        }

        System.out.println("Всего " + coincidences + " совпадений");

    }
    private static void test2(){

    }

    }

