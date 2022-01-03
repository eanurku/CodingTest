package com.anurag.datastructures.medium.problem01;

import java.util.Scanner;

public class JavaOneDGame {

    public static boolean canWin(int leap, int[] game) {

        return canWinRecursive(game, leap, 0);
    }

    private static boolean canWinRecursive(int[] game, int leap, int i) {

        if (i == game.length - 1 || i + leap >= game.length) {
            return true;
        }

        return  (i-1>=0 && canWinRecursive(game, leap, i - 1)) ||
                (i+1<=game.length && game[i+1] ==0 && canWinRecursive(game, leap, i + 1) ) ||
                (i+leap<=game.length && game[i+leap]==0 && canWinRecursive(game, leap, i + leap));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
