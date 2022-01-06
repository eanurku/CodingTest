package com.anurag.datastructures.medium.problem03;

import java.util.Scanner;
import java.util.Stack;

public class StackBalanceBraces {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            System.out.println(isBalanced(input));
        }

    }

    private static boolean isBalanced(String input) {

        Stack<Character> stack = new Stack<>();
        Character item, poppedElement;

        for (int i = 0; i < input.length(); i++) {
            item = input.charAt(i);
            if (item.charValue() == '(' || item.charValue() == '{' || item.charValue() == '[') {
                stack.push(item);
            } else {

                if (!stack.isEmpty()) {
                    poppedElement = stack.pop();
                    if (isMatched(item, poppedElement)) {
                        //do nothing
                    }else{
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();


    }

    private static boolean isMatched(Character item, Character poppedElement) {
        if (poppedElement.charValue() == '{' && item.charValue() == '}') {
            return true;
        } else if (poppedElement.charValue() == '(' && item.charValue() == ')') {
            return true;
        } else if (poppedElement.charValue() == '[' && item.charValue() == ']') {
            return true;
        } else {
            return false;
        }
    }
}
