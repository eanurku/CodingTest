package com.anurag.datastructures.easy.problem05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> set=new HashSet<>();
        for(int counter=0;counter<t;counter++){
            set.add(pair_left[counter]+" "+pair_right[counter]);
            System.out.println(set.size());
        }
        System.out.println(set.size());

    }
}
