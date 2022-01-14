package com.anurag.datastructures.medium.problem05;

import java.util.*;

public class JavaDeque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set=new HashSet<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int num;
        int max;

        for (int i = 0; i < m; i++) {
            num = scanner.nextInt();
            deque.addLast(num);
            set.add(num);
        }

        System.out.println(deque);
        System.out.println(set);
        max = set.size();

        for (int i = 0; i < n-m; i++) {
            num = scanner.nextInt();
            Integer removedElement = deque.removeFirst();
            if(!deque.contains(removedElement)){
                set.remove(removedElement);
            }
            deque.addLast(num);
            set.add(num);
            if (max< set.size()) {
                max=set.size();
            }
            System.out.println(deque);
            System.out.println(set);
        }
        System.out.println(max);


    }



//    private static Integer getUniqueCount(Deque deque) {
//        Map<Object, Object> map = new HashMap<>();
//        for (Iterator iterator = deque.iterator(); iterator.hasNext(); ) {
//            map.put(iterator.next(), 1);
//        }
//        return map.keySet().size();
//    }
}
