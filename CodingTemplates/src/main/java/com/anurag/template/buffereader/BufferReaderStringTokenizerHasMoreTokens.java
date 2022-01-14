package com.anurag.template.buffereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferReaderStringTokenizerHasMoreTokens {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(bufferedReader.readLine().trim());
        int sum;
        while (testcases > 0) {
            String inputLine = bufferedReader.readLine().trim();
            StringTokenizer tokenizer = new StringTokenizer(inputLine);

            sum = 0;
            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                sum += Integer.parseInt(token);
            }

            System.out.println("sum=" + sum);

            testcases--;
        }
    }
}
/*
  read testcase t as int
  read a line ,convert each words on line to taken by StringTokenizer

   example:
    find sum of numbers separated by spaces on a line
    input:
    2--->test cases
    12 13 14
    33 22 44 55

    output:
    sum=39
    sum=154
*/