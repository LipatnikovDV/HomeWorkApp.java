package lesson3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class lesson3 {

    public static void main(String[] args) {
        System.out.println(" Задание №1");
        testReverse();
        System.out.println();
        System.out.println(" Задание №2");
        test100Array();
        System.out.println();
        System.out.println();
        System.out.println(" Задание №3");
        testx2();
        System.out.println();
        System.out.println(" Задание №4");
        testSqArr();
        System.out.println();
        System.out.println(" Задание №5");
        newArr(3,4);


        }

    private static void newArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println("[" + i + "]" + arr[i] + " ");
        }
    }

    private static void testSqArr() {
        int[][] sqArr = new int[4][4];
        for (int i = 0; i < sqArr.length; i++) {
            for (int j = 0; j < sqArr.length; j++) {
                if (i == j) {
                    sqArr[i][j] = 1;
                } else {
                    sqArr[i][j] = 0;
                }
                System.out.print(sqArr[i][j] + " ");
            }
            System.out.println();

        }


    }



    private static void testx2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println("[" + arr[i] + "]");

        }
    }

    private static void test100Array() {
        int[] arr = new int[100];
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n++;
            System.out.print("[" + arr[i] + "]");
        }


    }

    private static void testReverse() {
        int[] arr = {1, 1, 1, 1, 1, 0, 0, 0, 0, 0};
        int arrrevers = arr.length;
        for (int i = 0; i < arrrevers;  i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        for (int i = 0; i < arrrevers; i++) {
            System.out.println(i + " - " + arr[i]);
        }
    }



}