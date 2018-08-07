package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int f = scanner.nextInt();
        int g = scanner.nextInt();

        chisla(i, f, g);
    }

    private static void chisla(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            System.out.println("3");

        } else if (a > 0 && b > 0 && c <= 0) {
            System.out.println("2");
        } else if (a > 0 && c > 0 && b <= 0) {
            System.out.println("2");
        } else if (b > 0 && c > 0 && a <= 0) {
            System.out.println("2");
        } else if (a > 0 && b <= 0 && c <= 0) {
            System.out.println("1");
        } else if (a <= 0 && b <= 0 && c > 0) {
            System.out.println("1");
        } else if (a <= 0 && b > 0 && c <= 0) {
            System.out.println("1");
        } else if (a<=0 && b<=0 && c<=0){
            System.out.println("0");
        }

    }
}