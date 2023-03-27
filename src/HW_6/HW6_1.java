package HW_6;

import java.util.Arrays;

public class HW6_1 {
    public static void main(String[] args) {

        System.out.println("Задача №1 - вывести сумму всех значений массива\n");
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i]; // sum = sum + array[i]; 0+9 =9, 9 + 2=11 ....
        }
        System.out.println("Сумма всех значений массива: " + sum);

        System.out.println("\n=========================\n Задача №2 - вывести максимальное значение массива.\n");

        int max = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение массива: " + max);

        System.out.println("\n=========================\n Задача №3 - вывести минимальное значение массива.\n");
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (min > array[i] ) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение массива: " + min);

        System.out.println("\n=========================\n Задача №4 - среднее арифметическое всех значений массива.\n");
        double sum1 = 0;
        for (int i = 0; i < array.length ; i++) {
            sum1 += array[i];
        }
        double avg = sum1 / array.length;
        System.out.println("среднее арифметическое всех значений массива: " + avg );

        System.out.println("\n=========================\n Задача №5 - вывести сумму элементов массива.\n");
        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum2 = 0;
        for (int i = 0; i < array2.length ; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum2 += array2[i][j];
            }
        }
        System.out.println("Сумма элементов массива: " + sum2);

        System.out.println("\n=========================\n Задача №6 - вывести максимальное значение массива.\n");
        int max2 = array2[0][0] ;
        for (int i = 0; i < array2.length ; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (max2 < array2[i][j]) {
                    max2 = array2[i][j];
                }
            }
        }
       System.out.println("Максимальное значение массива: " + max2);

       System.out.println("\n=========================\n Задача №7 -  вывести количество элементов в массиве.\n");

        int elementsCount = 0;
        for (int i = 0; i < array2.length; i++) {
            elementsCount += array2[i].length;
        }

       System.out.println("количество элементов в массиве: " + elementsCount);
    }
}