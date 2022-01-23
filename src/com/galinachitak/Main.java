package com.galinachitak;

public class Main {

    public static void main(String[] args) {
        // write your code here
        test();
        test2();
    }
    /*1) Электронные часы показывают время в формате от 00:00 до 23:59.
    Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается
     симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).*/

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
      /*2) Найти количество счастливых билетиков на трамвай от 000001 до 999999 - те у которых сумма
      первых 3 цифр равна сумме последних 3
       */


    private static void test2() {
        int sum = 0;
        for (int ticket = 000001; ticket <= 999999; ticket++) {
            int number1 = ticket / 100000;
            int number2 = (ticket % 100000) / 10000;
            int number3 = (ticket % 10000) / 1000;
            int number4 = (ticket % 1000) / 100;
            int number5 = (ticket % 100) / 10;
            int number6 = ticket % 10;

            if (number1 + number2 + number3 == number4 + number5 + number6) {
                sum++;
            }
        }
        System.out.println("Совпадений  " + sum);
    }
}


