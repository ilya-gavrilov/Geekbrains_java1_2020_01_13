package lesson2.homework;

/*
Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
значениями 0 3 6 9 12 15 18 21;
 */

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i = 0, x = 0; i < arr.length; i++, x += 3) {
            arr[i] = x;
            System.out.println("index [" + i + "] = " + arr[i]);
        }
    }
}
