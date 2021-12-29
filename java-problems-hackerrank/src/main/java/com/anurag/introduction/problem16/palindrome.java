package com.anurag.introduction.problem16;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        StringBuilder newString=new StringBuilder();

        for(int index=string.length()-1;index>=0;index--){
            newString.append(string.charAt(index));
        }

        ;
        System.out.println(newString.toString().equals(string)?"Yes":"No");



    }
}
