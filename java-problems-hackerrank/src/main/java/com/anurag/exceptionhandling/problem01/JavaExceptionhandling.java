package com.anurag.exceptionhandling.problem01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionhandling {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try{
            int first = scan.nextInt();
            int second = scan.nextInt();
            System.out.println(first/second);


        }
        catch (ArithmeticException e){
            System.out.println(e.getClass().getName());
        }
        catch (InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
    }
}
