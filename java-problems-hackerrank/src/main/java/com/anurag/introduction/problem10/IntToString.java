package com.anurag.introduction.problem10;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        //String s=???; Complete this line below
        StringBuilder string = new StringBuilder();
        int num;
        boolean isNegative = false;
        if (n == 0) {
            string.append("0");
        } else {
            if (n < 0) {
                num = Math.abs(n);
                isNegative = true;
            } else {
                num = n;
            }
            while (num > 0) {
                string.append(num % 10);
                num = num / 10;
            }


        }

        String s = string.reverse().toString();
        s = isNegative ? "-" + s : s;
        System.out.println(s);
    }
}
