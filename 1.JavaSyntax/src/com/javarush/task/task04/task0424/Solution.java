package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        smr(a,b,c);


    }
    public static void smr ( int a, int b,int c){
        int q = 1;
        int w = 2;
        int e = 3;

        if (a==b && c>b || a==b && c < b){
            System.out.println(e);
        }else if (a==c && b > c || a==c && b<c)
            System.out.println(w);
        else if (b==c && a>b || b==c && a<b)
            System.out.println(q);
    }


}
