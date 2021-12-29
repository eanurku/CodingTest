package com.anurag.introduction.problem17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Anagram {

    static boolean isAnagram1(String first, String second) {
        // Complete the function

        if (first.length() != second.length()) {
            return false;
        }

        Map<Character, Integer> firstMap = new TreeMap<>();
        Map<Character, Integer> secondMap = new TreeMap<>();

        for (int i = 0; i < first.length(); i++) {
            Character character = Character.toLowerCase(first.charAt(i));
            firstMap.put(character, firstMap.get(character) == null ? 1 : firstMap.get(character) + 1);
        }
        for (int i = 0; i < second.length(); i++) {
            Character character = Character.toLowerCase(second.charAt(i));
            secondMap.put(character, secondMap.get(character) == null ? 1 : secondMap.get(character) + 1);
        }
        for (Map.Entry entry : firstMap.entrySet()) {

            if (entry.getValue() != secondMap.get(entry.getKey())) {
                return false;
            }

        }


        return true;
    }

    static boolean isAnagram(String first, String second) {
        // Complete the function
        final int SIZE = 26;
        if (first.length() != second.length()) {
            return false;
        }
        int[] array1 = new int[SIZE];
        int[] array2 = new int[SIZE];
        for (int i = 0; i < first.length(); i++) {
            char character = Character.toUpperCase(first.charAt(i));
            array1[character - 65] += 1;
        }
        for (int i = 0; i < second.length(); i++) {
            char character = Character.toUpperCase(second.charAt(i));
            array2[character - 65] += 1;
        }
        for (int i = 0; i < SIZE; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
