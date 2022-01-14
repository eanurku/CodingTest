package com.anurag.advance.problem04;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();


        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] messageBytes = md.digest(str.getBytes());
        BigInteger number = new BigInteger(1, messageBytes);
        String hash = number.toString(16);

        while (hash.length() < 32) {
            hash = "0" + hash;
        }

        System.out.println(hash);

    }
}
