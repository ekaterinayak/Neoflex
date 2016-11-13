package com.ekaterinayak.task1;

/**
 * Created by Ekaterina Yakovleva on 13.11.2016.
 */
public class Type {

    public static void main(String[] args) {
        System.out.println("Минимальное значение byte: " + Byte.MIN_VALUE);
        System.out.println("Максимальное значение byte: " + Byte.MAX_VALUE);

        System.out.println("Минимальное значение short: " + Short.MIN_VALUE);
        System.out.println("Максимальное значение short: " + Short.MAX_VALUE);

        System.out.println("Минимальное значение int: " + Integer.MIN_VALUE);
        System.out.println("Максимальное значение int: " + Integer.MAX_VALUE);

        System.out.println("Минимальное значение long: " + Long.MIN_VALUE);
        System.out.println("Максимальное значение long: " + Long.MAX_VALUE);

        System.out.println("Минимальное значение float: " + Float.MIN_VALUE);
        System.out.println("Максимальное значение float: " + Float.MAX_VALUE);

        System.out.println("Минимальное значение double: " + Double.MIN_VALUE);
        System.out.println("Максимальное значение double: " + Double.MAX_VALUE);

        System.out.println("Минимальное значение boolean: " + false);
        System.out.println("Максимальное значение boolean: " + true);

        System.out.println("Минимальное значение char: " + Character.MIN_VALUE);
        System.out.println("Максимальное значение char: " + Character.MAX_VALUE);

        int a = 3;
        int b = 5;
        int ab = a + b;

        System.out.println("Сумма чисел а и b: " + ab);
    }
}
