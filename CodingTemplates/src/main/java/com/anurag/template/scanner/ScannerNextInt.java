package com.anurag.template.scanner;

import java.util.Scanner;

public class ScannerNextInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases=scanner.nextInt();

        while(testcases>0){

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println("sum="+ (num1+num2));
            testcases--;
        }
    }
}
/*
 input:
    2--->testcases
    12 13
    33 322
 output:
    sum=25
    sum=355
 */
