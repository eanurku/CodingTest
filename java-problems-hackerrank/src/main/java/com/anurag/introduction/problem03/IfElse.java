package com.anurag.introduction.problem03;

import java.util.Arrays;
import java.util.Scanner;

public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if(N%2!=0){
            System.out.print("Weired");
        }else if(N%2==0 && (N>=2 && N<=5)){
            System.out.print("Not Weird");
        }else if(N%2==0 && (N>=6 && N<=20)){
            System.out.print("Weird");
        }else if(N%2==0 &&  N>20){
            System.out.print("Not Weird");
        }
    }
}
