package com.anurag.template.buffereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderNextLine {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReder = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(bufferedReder.readLine().trim());


        while(testcases >0){
            String num1 = bufferedReder.readLine().trim();
            String num2 = bufferedReder.readLine().trim();

            System.out.println("sum="+(Integer.parseInt(num1)+Integer.parseInt(num2)));

            testcases--;
        }


    }
}
/*
  read testcase count t  in first line
  read t lines where each line is terminated by '\n'

   example:
    find sum of two numbers
    input:
    2--->test cases
    12-->num1
    13-->num2
    33--->num1
    44-->num2

    output:
    sum=25
    sum=77
*/
