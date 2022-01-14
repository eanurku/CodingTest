package com.anurag.template.buffereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferReaderStringTokenizer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testcases=Integer.parseInt(bufferedReader.readLine().trim());

        int sum;

        while(testcases>0){
            String inputLine = bufferedReader.readLine().trim();
            StringTokenizer tokenizer = new StringTokenizer(inputLine);

            String token1 = tokenizer.nextToken();
            String token2 = tokenizer.nextToken();

            sum=Integer.parseInt(token1)+Integer.parseInt(token2);

            System.out.println("sum="+sum);

            testcases--;
        }

    }
}
/*
  read testcase t as int
  read a line ,convert each word to taken by StringTokenizer

   example:
    find sum of two numbers
    input:
    2--->test cases
    12 13
    33 44

    output:
    sum=25
    sum=77
*/

