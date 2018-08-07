package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      String a = bf.readLine();
      String b = bf.readLine();
      int x = Integer.parseInt(a);
      int y = Integer.parseInt(b);
      prem(x,y);



    }
    public static void prem (int a, int b){
        for (int i = 0; i != a ; i++) {
            for (int y = 0; y !=b ; y ++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }



}
