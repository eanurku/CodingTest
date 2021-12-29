package com.anurag.introduction.problem06;

import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();


            for(int j=0;j<n;j++){
                int result=a+b * ((int)Math.pow(2,j+1)-1);
                System.out.print(String.format("%d%s",result,j<n-1?" ":""));
            }
            System.out.println();
        }
        in.close();
    }


}
