package com.anurag.introduction.problem15;

import java.util.Scanner;

public class AllSubstring {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        //get all substring with length as k
        int startIndex = 0;
        int endIndex = s.length() - 1;
        int counter = 1;
        while (counter <= s.length()) {
            while (startIndex <= endIndex) {
                String substring = s.substring(startIndex, endIndex + 1);
                if (substring.length() == k) {
                    if (smallest.equals("")) {
                        smallest = substring;
                    } else if (smallest.compareTo(substring) > 0) {
                        smallest = substring;
                    }
                    if (largest.equals("")) {
                        largest = substring;
                    } else if (largest.compareTo(substring) < 0) {
                        largest = substring;
                    }
                }
                endIndex--;
            }
            endIndex = s.length() - 1;
            startIndex++;

            counter++;
        }


        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
