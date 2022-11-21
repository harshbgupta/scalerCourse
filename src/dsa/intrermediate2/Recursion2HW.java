package dsa.intrermediate2;

import java.util.ArrayList;

public class Recursion2HW {
    public static void main(String[] args) {

    }

    /**
     * #Question :
     * Given a number A, check if it is a magic number or not.
     * A number is said to be a magic number if the sum of its digits is calculated till a single digit recursively
     * by adding the sum of the digits after every addition. If the single digit comes out to be 1, then the number
     * is a magic number.
     * ---------------------
     * #Problem Constraints:
     * ---------------------
     * #Logic :
     * Approach 1. One approach is to recursively check the sum of digits until a single digit is left.
     * Now, check if the number is 1, then it is a magic number. Else NOT.
     * <p>
     * Approach 2. Efficient Approach:
     * There is also a shortcut method to verify Magic Number.
     * The function will determine if the remainder of dividing the input by 9 is 1 or not.
     * If it is 1, then the number is a magic number.
     * The divisibility rule of 9 says that a number is divisible by 9 if the sum of its digits is also divisible by 9.
     * Therefore, if a number is divisible by 9, then, recursively, all the digit sums are also divisible by 9.
     * The final digit sum is always 9. An increase of 1 in the original number will increase the ultimate value by 1,
     * making it 10, and the ultimate sum will be 1, thus verifying that it is a magic number.
     * ---------------------
     * #ITR:
     * #TC: O()
     * #SC: O()
     */
    private static int q1(int A) {
        if (A % 9 == 1) {
            return 1;
        }
        return 0;
    }

    /**
     * #Question :
     * On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each
     * occurrence of 0 with 01, and each occurrence of 1 with 10.
     * <p>
     * Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
     * ---------------------
     * #Problem Constraints:
     * ---------------------
     * #Logic :
     * ---------------------
     * #ITR:
     * #TC: O()
     * #SC: O()
     */
    public int q2solve(int A, int B) {
        return A_th_Row(A).get(B);
    }

    /**
     * q2solve helper message
     */
    private static ArrayList<Integer> A_th_Row(int A) {
        if (A == 1) {
            ArrayList<Integer> v2 = new ArrayList<Integer>();
            v2.add(0);
            return v2;
        }
        ArrayList<Integer> v1 = A_th_Row(A - 1);
        ArrayList<Integer> v2 = new ArrayList<Integer>();
        for (int i = 0; i < v1.size(); i++) {
            if (v1.get(i) == 0) {
                v2.add(0);
                v2.add(1);
            } else {
                v2.add(1);
                v2.add(0);
            }
        }
        return v2;
    }


    /**
     * #Question :
     * On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each
     * occurrence of 0 with 01, and each occurrence of 1 with 10.
     * Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
     * ---------------------
     * #Problem Constraints:
     * ---------------------
     * #Logic :
     * ---------------------
     * #ITR:
     * #TC: O()
     * #SC: O()
     */
    private static int q3solve(int A, long B) {
        return q3Assist(A, B);
    }

    public static int q3Assist(int n, long k) {
        if (k == 0) {
            return 0;
        }
        int val = q3Assist(n - 1, k / 2);
        if (k % 2 == 0) {
            return val;
        }
        return 1 - val;
    }

    /**
     * #Question :
     * Given the total number of person A and a number B which indicates that B-1 persons are skipped and the Bth
     * person is killed in a circle. Find the last person standing in the circle.
     * ---------------------
     * #Problem Constraints:
     * 1 <= A <= 105
     * 2 <= B <= A
     * ---------------------
     * #Logic :
     * After the first person (B-th from the beginning) is killed,
     * A-1 persons are left. So we call Josephus(A – 1, B) to get the
     * position with A-1 persons. But the position returned by
     * Josephus(A – 1, B) will consider the position starting from B%A + 1.
     * So, we must make adjustments to the position returned by Josephus(A – 1, B).
     * <p>
     * Time Complexity : O(A)
     * Space Complexity : O(A)
     * ---------------------
     * #ITR:
     * #TC: O(A)
     * #SC: O(A)
     */
    private static int q4solve(int A, int B) {
        return josephus(A , B);
    }

    public static int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        }
        return (josephus(n - 1, k) + k - 1) % n + 1;
    }

}
