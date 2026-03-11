package com.rajesh.selflearning.gfg.Recurssion;

public class RopeCuttingProblem {
    public static int max(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }

    }

    public static int maxpiece(int n, int a, int b, int c) {
        int r;
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }

        r = max(maxpiece(n - a, a, b, c), maxpiece(n - b, a, b, c), maxpiece(n - c, a, b, c));

        if (r == -1)
            return -1;

        return r + 1;
    }

    public static void main(String[] args) {
        int n = 23, a = 11, b = 9, c = 12;
        int ans = maxpiece(n, a, b, c);
        System.out.println(ans);
    }
}
