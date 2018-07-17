package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String v = scanner.nextLine();
        int f = s.length() ;
        int g = v.length();
       // System.out.println(f);
       // int x = v.compareTo(s);
        if (s.equals(v)) {
            System.out.println("Имена идентичны");
        }else if (f == g)
            System.out.println("Длины имен равны");

        }


    }
