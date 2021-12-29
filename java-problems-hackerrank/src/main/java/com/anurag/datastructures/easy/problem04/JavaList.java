package com.anurag.datastructures.easy.problem04;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new LinkedList<>();

        int counter;
        for (counter = 0; counter < n; counter++) {
            list.add(scan.nextInt());
        }
        System.out.println(list);

        int queries = scan.nextInt();
        int indexPosition;
        int element;
        for (counter = 1; counter <= queries; counter++) {
            String operation = scan.next();
            if (operation.equals("Insert")) {
                indexPosition = scan.nextInt();
                element = scan.nextInt();
                list.add(indexPosition, element);
            } else if (operation.equals("Delete")) {
                indexPosition = scan.nextInt();
                list.remove(indexPosition);
            }
        }
        System.out.println(list.stream().map(item -> item + "").collect(Collectors.joining(" ")));

    }
}
