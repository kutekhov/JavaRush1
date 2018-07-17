package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        dfm(i,j);
    }

    public static void dfm ( int i, int j){
        if (i<j)
            System.out.println(i);
        else if (i>j)
            System.out.println(j);
        else if (i==j)
            System.out.println(i);

    }



}