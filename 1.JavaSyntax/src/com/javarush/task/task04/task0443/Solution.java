package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        String c = bf.readLine();
        String v = bf.readLine();
        String f = bf.readLine();
        int z = Integer.parseInt(c);
        int y = Integer.parseInt(v);
        int x = Integer.parseInt(f);
        System.out.println("Меня зовут "+s+".");
        System.out.println("Я родился "+ x+"."+y+"."+z);
    }
}
