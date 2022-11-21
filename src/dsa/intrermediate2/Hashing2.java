package dsa.intrermediate2;

import java.util.HashSet;

public class Hashing2 {
    public static void main(String[] args) {

    }

    /**
     * Question : Given an Array of integers B, and a target sum A.
     * Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.
     * <p>
     * Logic : USe prefix Sum
     * ITR:
     * TC: O(N)
     * SC: O(N)
     */
    private static int q2solveOptimised(int A, int[] B) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < B.length; i++) {
            if (set.contains(A - B[i])) {
                return 1;
            }
            set.add(B[i]);
        }
        return 0;

    }

    /**
     * Question : Given an Array of integers B, and a target sum A.
     * Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.
     * <p>
     * Logic : Brute force Approch
     * <p>
     * ITR:
     * TC: O(N^2)
     * SC: O(1)
     */
    private static int q2solveNormal(int A, int[] B) {
        for (int i = 0; i < B.length; i++) {
            for (int j = i + 1; j < B.length; j++) {
                if (B[i] + B[j] == A)
                    return 1;
            }
        }
        return 0;
    }
}
