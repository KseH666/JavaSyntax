package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; ; i++) {
            list.add(reader.readLine());
            if (list.get(i).equals("end")) {
                break;
            }
        }
        list.remove("end");
        for (String s : list) {
            System.out.println(s);
        }
    }
}