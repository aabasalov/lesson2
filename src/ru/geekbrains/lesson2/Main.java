package ru.geekbrains.lesson2;

public class Main {

    public static void main(String[] args) {

        int [] array1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        findMaxMin(array1);

        int[] array2 = {1, 0, 1, 8, 4, 0, 13, 1};
        System.out.println(findEq(array2));
    }
//  1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] == 0) {
//                arr1[i] = 1;
//            }
//            else {
//                arr1[i] = 0;
//            }
//            System.out.println(arr1[i]);
//        }

//  2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
//        int[] arr2 = new int[8];
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = i * 3;
//            System.out.println(arr2[i]);
//        }

//  3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        for (int i = 0; i < arr3.length; i++) {
//            if (arr3[i] < 6) {
//                arr3[i] *= 2;
//                System.out.println(arr3[i]);
//            }
//            else {
//                System.out.println(arr3[i]);
//                continue;
//            }
//        }

//  4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
//        int[][] table = new int[5][5];
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i == j) {
//                    table[i][j] = 1;
//                } else {
//                    table[i][j] = 0;
//                }
//                System.out.println(table[i][j]);
//            }
//        }

    //  5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void findMaxMin(int[] arr) {

        int maxI = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxI) {
                maxI = arr[i];
            } else {
                continue;
            }
        }
        System.out.println("Максимальное число: " + maxI);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < maxI) {
                maxI = arr[i];
            } else {
                continue;
            }
        }
        System.out.println("Минимальное число: " + maxI);
    }

//  6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    public static boolean findEq(int[] arr) {

        int [] result = new int [arr.length];
        int R = 0;

        for (int i = 0; i < arr.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < arr.length; j++) {
                if (i >= j) {
                    leftSum += arr[j];
                }
                else {
                    rightSum += arr[j];
                }
            }

            if (leftSum == rightSum) {
                result[i] = 1;
            }
            else {
                result[i] = 0;
            }
        }

        for (int r = 0; r < result.length; r++) {
            R += result[r];
        }

        if (R>0)    {
            return true;
        }
        else {
            return false;
        }
    }

}


