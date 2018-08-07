package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        String s = String.valueOf(bf.readLine());
        int f = Integer.parseInt(bf.readLine());

        while (f>0) {
            System.out.println(s);

            f--;
        }
    }
}