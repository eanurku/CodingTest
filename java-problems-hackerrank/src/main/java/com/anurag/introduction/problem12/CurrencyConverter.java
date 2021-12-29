package com.anurag.introduction.problem12;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat nfUs=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nfindia=NumberFormat.getCurrencyInstance();
        NumberFormat nfchina=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nfFrance=NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = nfUs.format(payment);
        String india ="Rs."+ nfindia.format(payment).substring(1);
        String china = nfchina.format(payment);
        String france = nfFrance.format(payment);
        // Write your code here.

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
