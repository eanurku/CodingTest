package com.anurag.template.scanner;

import java.util.Scanner;

public class ScannerReadStringIntDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases=scanner.nextInt();

        while(testcases>0){

            int intNumber = scanner.nextInt();
            float floatNumber=scanner.nextFloat();
            scanner.nextLine();
            String inputString=scanner.nextLine();

            System.out.println(intNumber);
            System.out.println(floatNumber);
            System.out.println(inputString);
            testcases--;
        }

    }
}
/*
 input:
    2--->test case
    12
    33.5
    jf fjer er erfje
    12
    33.5
    jf fjer er erfje
 */