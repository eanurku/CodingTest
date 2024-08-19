package com.anurag.template.scanner;

import java.util.Scanner;

public class ScannerReadIntDoubleWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();

        while (testcases > 0) {

            int intNumber = scanner.nextInt();
            float floatNumber = scanner.nextFloat();
            String word = scanner.next();

            System.out.print(intNumber + " " + floatNumber + " " + word);
            testcases--;
        }

    }
}
/*
input:
2
12 13 sss

12 13 ldle dcscs
output:
12 13 sss
12 13 ldle
 */