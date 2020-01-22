package lesson2.homework;
/*
Test pull request.
 */

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {11, 3, -4, -15, 7, 0, 77, 5, 9};

        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальное число в массиве: " + min);

        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальное число в массиве: " + max);
    }
}
