package com.anurag.introduction.problem05;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");

            String s1=sc.next();
            int x=sc.nextInt();
            System.out.println(String.format("%-15s%03d",s1,x));

        System.out.println("================================");

    }
}
