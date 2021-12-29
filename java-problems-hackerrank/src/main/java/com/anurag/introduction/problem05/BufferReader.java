package com.anurag.introduction.problem05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args) throws IOException {

        BufferedReader buffereRreader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(buffereRreader.readLine().trim());

        for(int i=1;i<=10;i++){
            int result = number * i;
            System.out.println(String.format("%d x %d = %d",number,i,result));
        }







    }
}
