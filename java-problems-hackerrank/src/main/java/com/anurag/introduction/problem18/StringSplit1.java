package com.anurag.introduction.problem18;

import java.util.Arrays;
import java.util.Scanner;

public class StringSplit1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

            s=s.replaceAll("[^a-zA-Z]"," ");
            s=s.replaceAll("\\s+"," ");
            s=s.trim();

        if(s.length()==0){
            System.out.println(0);
        }else{
            String[] tokens = s.split(" ");

            System.out.println(tokens.length);
            Arrays.stream(tokens).forEach(str-> System.out.println(str));

        }



        scan.close();
    }
}
