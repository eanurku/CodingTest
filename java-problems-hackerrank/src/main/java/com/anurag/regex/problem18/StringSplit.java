package com.anurag.regex.problem18;

import java.util.Arrays;
import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] tokens = s.split("[^a-zA-Z]");
        int tokensCount = 0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].length()>0){
                tokensCount++;
            }
        }
        System.out.println(tokensCount);
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].length()>0){
                System.out.println(tokens[i]);
            }
        }
        scan.close();
    }
}
