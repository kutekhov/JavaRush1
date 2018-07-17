package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        sum(a, b, c);
    }

    public static void sum(int a, int b, int c) {
        if (a == b && b==c) {// && a>c && b >c && c>b && c>a) {
            System.out.print(a + " " + b+" "+c);
        } else if (a == c) {// && a>b && b>c && c>b && b>a){
            System.out.print(a + " " + c);
        } else if (b == c) {// && c>a && a>c && a>b&& b>a){
            System.out.print(b + " " + c);
        } else if (a==b) {
            System.out.println(a + " " + b);

        }
    }
}