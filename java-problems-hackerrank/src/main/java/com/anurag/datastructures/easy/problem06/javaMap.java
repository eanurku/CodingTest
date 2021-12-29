package com.anurag.datastructures.easy.problem06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class javaMap {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            map.put(name,phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            String result=map.containsKey(s)? s+"="+map.get(s):"Not found";
            System.out.println(result);
        }
    }
}
