package com.anurag.datastructures.easy.problem09;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);

        for (int operation = 1; operation <= M; operation++) {
            String operator = scanner.next();
            int value1 = scanner.nextInt();
            int value2 = scanner.nextInt();
            switch (operator) {
                case "AND":
                    if (value1 == 1) {
                        B1.and(B2);
                    } else {
                        B2.and(B1);
                    }
                    break;
                case "OR":
                    if (value1 == 1) {
                        B1.or(B2);
                    } else {
                        B2.or(B1);
                    }
                    break;
                case "XOR":
                    if (value1 == 1) {
                        B1.xor(B2);
                    } else {
                        B2.xor(B1);
                    }
                    break;
                case "SET":
                    if (value1 == 1) {
                        B1.set(value2);
                    } else {
                        B2.set(value2);
                    }
                    break;

                case "FLIP":
                    if (value1 == 1) {
                        B1.flip(value2);
                    } else {
                        B2.flip(value2);
                    }
                    break;
            }

            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }

    }
}
