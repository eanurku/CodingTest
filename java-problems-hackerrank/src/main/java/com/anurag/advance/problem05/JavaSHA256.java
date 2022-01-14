package com.anurag.advance.problem05;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();


        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] messageBytes = md.digest(str.getBytes());
        BigInteger number = new BigInteger(1, messageBytes);
        String hash = number.toString(16);

        while (hash.length() < 64) {
            hash = "0" + hash;
        }

        System.out.println(hash);

    }
}
