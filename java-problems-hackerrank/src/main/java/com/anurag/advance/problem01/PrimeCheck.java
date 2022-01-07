package com.anurag.advance.problem01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.in;

class Prime {

    public void checkPrime(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                System.out.print(numbers[i] + (i == numbers.length - 1 ? "" : " "));
            }
        }
        System.out.println();
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
public class PrimeCheck {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
//            int n1=Integer.parseInt(br.readLine());
//            int n2=Integer.parseInt(br.readLine());
//            int n3=Integer.parseInt(br.readLine());
//            int n4=Integer.parseInt(br.readLine());
//            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(5);
            ob.checkPrime(6);
            ob.checkPrime(7);
            ob.checkPrime(8);
//            ob.checkPrime(n1,n2);
//            ob.checkPrime(n1,n2,n3);
//            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
