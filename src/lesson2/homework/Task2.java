package lesson2.homework;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i = 0, x = 0; i < arr.length; i++, x += 3) {
            arr[i] = x;
            System.out.println("index [" + i + "] = " + arr[i]);
        }
    }
}
