package com.javarush.task.task04.task0420;
import java.io.*;
/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        String third = reader.readLine();
        int a = Integer.parseInt(first);
        int b = Integer.parseInt(second);
        int c = Integer.parseInt(third);
        if (a > b && b > c)
            System.out.println(a +" "+ b +" "+ c);
        else if (a >= c && c >= b)
            System.out.println(a +" "+ c +" "+ b);
        else if (b >= a && a >= c)
            System.out.println(b +" "+ a +" "+ c);
        else if (b >= c && c >= a)
            System.out.println(b +" "+ c +" "+ a);
        else if (c >= a && a >= b)
            System.out.println(c +" "+ a +" "+ b);
        else if (c >= b && b >= a)
            System.out.println(c +" "+ b +" "+ a);

    }
}
