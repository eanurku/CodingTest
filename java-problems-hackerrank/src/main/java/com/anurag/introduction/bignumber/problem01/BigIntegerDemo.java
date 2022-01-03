package com.anurag.introduction.bignumber.problem01;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        BigInteger first = new BigInteger(s1);
        BigInteger second = new BigInteger(s2);

        BigInteger add = first.add(second);
        BigInteger multiply = first.multiply(second);
        
        System.out.println(add);
        System.out.println(multiply);
    }
}
