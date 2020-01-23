package lesson2.homework;

/*
Создать квадратный двумерный целочисленный массив (количество строк и столбцов
одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
 */

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] arr = new int[15][15];
        for (int i = 0; i < arr.length; i++) {
            int newIndex = arr.length - 1 - i;
            arr[i][i] = arr[i][newIndex] = 1;
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
