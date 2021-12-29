package com.anurag.introduction.problem04;

import java.util.Scanner;

public class Stdinout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();//to skip new line not read by nextDouble
        String s = scan.nextLine();

        scan.close();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
