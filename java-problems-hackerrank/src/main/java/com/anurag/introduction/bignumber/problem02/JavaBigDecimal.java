package com.anurag.introduction.bignumber.problem02;

import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        Arrays.sort(s,0,n,(a,b)->-1 * new BigDecimal(a).compareTo(new BigDecimal(b)));

//        List<BigDecimal> list=new ArrayList<>();
//        for(int i=0;i<n;i++)
//        {
//            list.add(new BigDecimal(s[i]));
//        }
//        Collections.sort(list,(a,b)->-1 * a.compareTo(b));
//
//        for(int i=0;i<n;i++)
//        {
//            s[i]=list.get(i).toString();
//        }



        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
