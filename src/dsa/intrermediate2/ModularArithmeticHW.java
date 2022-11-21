package dsa.intrermediate2;

import java.util.Arrays;

public class ModularArithmeticHW {
    public static void main(String[] args) {

    }

    /**
     * #Question 1:
     * Given an integer A representing a year, Return 1 if it is a leap year else, return 0.
     * A year is a leap year if the following conditions are satisfied:
     * The year is multiple of 400.
     * or the year is multiple of 4 and not multiple of 100.
     * ---------------------
     * #Logic :
     * ---------------------
     * #ITR: NONE
     * #TC: O()
     * #SC: O(1)
     */
    private static int q1solve(int A) {
        if (A % 400 == 0) {
            return 1;
        }
        if (A % 100 == 0) {
            return 0;
        }
        if (A % 4 == 0) {
            return 1;
        }
        return 0;
    }

    /**
     * #Question 2:
     * You are given a number A in the form of a string. Check if the number is divisible by eight or not.
     * Return 1 if it is divisible by eight else, return 0.
     * ---------------------
     * #Logic :
     * 1. A.charAt(0) - '0' to get the digit value from ASCII (Basic math)
     *
     * 2. A number is divisible by eight if the number formed by the last three digits of it is divisible by 8.
     * ---------------------
     * #ITR:
     * #TC: O(1)
     * #SC: O(1)
     */
    private static int q2solve(String A) {
        int n = A.length();
        if (n == 1){
            if((A.charAt(0) - '0') % 8 == 0){
                return 1;
            }
            return 0;
        }
        if (n == 2) {
            int x = (A.charAt(0) - '0') * 10 + A.charAt(1) - '0';
            if(x % 8 == 0){
                return 1;
            }
            return 0;
        }

        //A number is divisible by eight if the number formed by the last three digits of it is divisible by 8.
        int a3 = (A.charAt(n-3) - '0') * 100 + (A.charAt(n-2) - '0') * 10 + (A.charAt(n-1) - '0');
        if(a3 % 8 == 0){
            return 1;
        }
        return 0;
    }

    /**
     * #Question 3: Given three 2-digit integers, A, B, and C, find out the minimum number obtained by concatenating them in any order.
     * Return the minimum result obtained.
     * --------------------
     * #Problem Constraints
     * 10 <= A, B, C <= 99
     * ---------------------
     * #Logic :
     * ---------------------
     * #ITR:
     * #TC: O()
     * #SC: O()
     */
    private static int q3solve(int A, int B, int C) {
        int a[] = {A, B, C};
        Arrays.sort(a);
        return 10000*a[0] + 100*a[1] + a[2];
    }
}
