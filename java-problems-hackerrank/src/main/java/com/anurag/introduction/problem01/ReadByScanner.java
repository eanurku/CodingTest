package com.anurag.introduction.problem01;

import java.util.Scanner;

public class ReadByScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        scanner.useDelimiter("\n");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        scanner.close();

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
