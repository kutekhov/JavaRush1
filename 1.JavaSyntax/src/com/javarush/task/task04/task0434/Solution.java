package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int s = 1;
        int e=1;
        while (s < 11){

           while (e<11) {
               System.out.print(s*e + " ");

                e++;
           }
            System.out.println();
           e=1;
            s++;
        }

    }
}
