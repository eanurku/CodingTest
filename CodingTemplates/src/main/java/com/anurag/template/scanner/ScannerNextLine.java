package com.anurag.template.scanner;

import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            System.out.println(line);
        }
    }
}
