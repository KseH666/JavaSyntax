package com.javarush.task.task04.task0439;
import java.io.*;
/* 
Письмо счастья
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        for (int a = 1; a<=10; a++ )
            System.out.println(name + " любит меня.");

    }
}
