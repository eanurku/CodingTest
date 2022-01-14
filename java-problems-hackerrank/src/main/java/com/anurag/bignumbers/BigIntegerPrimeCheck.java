package com.anurag.bignumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigIntegerPrimeCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger val = new BigInteger(n);
        System.out.println(val.isProbablePrime(1));

        bufferedReader.close();
    }
}
