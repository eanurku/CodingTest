package com.anurag.introduction.problem09;

import java.util.Scanner;

public class StaticBlock {

    static {
        Scanner scanner=new Scanner(System.in);
        int breadth = scanner.nextInt();
        int height = scanner.nextInt();
        try{
            if(breadth<=0 || height<=0){
                throw new Exception("Breadth and height must be positive");
            }
            System.out.println(breadth*height);
        }catch (Exception e){
            System.out.println(e);
        }


    }
    public static void main(String[] args) {

    }
}
