package com.anurag.datastructures.easy.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfLines = scan.nextInt();
        int counter;
        int noofdigits;
        int digitsCounter;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> listOfElements = null;
        for (counter = 0; counter < noOfLines; counter++) {
            noofdigits = scan.nextInt();
            listOfElements = new ArrayList<>();
            for (digitsCounter = 1; digitsCounter <= noofdigits; digitsCounter++) {
                listOfElements.add(scan.nextInt());
            }
            list.add(listOfElements);
        }

        int queries = scan.nextInt();
        int x;
        int y;
        for (counter = 1; counter <= queries; counter++) {
            x = scan.nextInt();
            y = scan.nextInt();

            if (x >= 1 && x <= list.size()) {
                listOfElements = list.get(x - 1);

                if (y >= 1 && y <= listOfElements.size()) {
                    System.out.println(listOfElements.get(y - 1));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }

        }

    }
}
