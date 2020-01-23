package lesson2.homework;

/*
Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, ||
2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(checkBalance(new int[] {2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println(checkBalance(new int[] {1, 1, 1, 2, 1}));
        System.out.println(checkBalance(new int[] {1, 1, 2, 2, 1}));
        System.out.println(checkBalance(new int[] {5, 1, 2, 2, 1}));
        System.out.println(checkBalance(new int[] {5, 1, 2, 2, 11}));
        System.out.println(checkBalance(new int[] {1, 1, 1, 2, 1, 5, 6, 1, 0, 2, 2}));
        System.out.println(checkBalance(new int[] {1, 1, 2, 0, 0, 0, 0, 2, 2}));

    }

    private static boolean checkBalance (int[] array) {
        System.out.println("\n");
        boolean result = false;
        int leftSum = 0;
        int rightSum = sum(array, 0, array.length);
        for (int i = 1; i < array.length; i++) {
            leftSum += array[i - 1];
            rightSum -= array[i - 1];
            if (leftSum == rightSum) {
                System.out.println("Common sum = " + leftSum + "; index = " + i);
                result = true;
            }
        }
        return result;
    }

    private static int sum (int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
