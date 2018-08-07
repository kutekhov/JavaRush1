package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int x = Integer.parseInt(s);
        int result = -1;
        while (x != -1) {
            result += x;
            x = Integer.parseInt(bf.readLine());
        }

            System.out.println(result);

    }
}