package com.company;


public class Main {

    public static void main(String[] args) {
        short[] array = new short [30];
        double x = 0, y = 0;
        System.out.println("Массив:");
        for (int i = 0; i<30; i++) {
            array[i]=(short)Math.round(30*Math.random());
            System.out.print(array[i]+", ");
        }
        for (int i = 0; i<30; i++) {
            if (array[i]%2 == 0) {
                x+=array[i];
            } else {
                y+=array[i];
            }
        }
        System.out.println("\nСумма четных элементов: " + x + "\nСумма нечетных элементов: " + y);
    }
}