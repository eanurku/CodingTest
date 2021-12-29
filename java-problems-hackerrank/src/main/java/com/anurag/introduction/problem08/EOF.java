package com.anurag.introduction.problem08;

import java.util.Scanner;

public class EOF {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int counter=0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            counter++;
            System.out.println(counter+" "+line);

        }
    }
}
