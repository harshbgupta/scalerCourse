package dsa.intrermediate2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Hashing1 {
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 1};
        int[] B = {1, 2};
        int[] ans = q1solve(A, B);
        for (int a : ans) {
            System.out.println(a);
        }
    }

    /**
     * Question 1 : Given an array A. You have some queries given by the array B.
     * <p>
     * For the i-th query, find the frequency of B[i] in the array A.
     * <p>
     * Logic : Store the array A in a hashmap with key the element of array a
     * itself and the value as the frequency of element of array A
     * <p>
     * ITR:
     * TC: O(|A| + |B|)
     * SC: O(|A|)
     */
    private static int[] q1solve(int[] A, int[] B) {
        int[] ans = new int[B.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], findFrequency(A, i));
            }
        }

        for (int i = 0; i < B.length; i++) {
            if (map.containsKey(B[i])) {
                ans[i] = map.get(B[i]);
            } else {
                ans[i] = 0;
            }
        }
        return ans;
    }

    private static int findFrequency(int[] A, int position) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == A[position]) {
                count++;
            }
        }
        return count;
    }


    /**
     * Question :
     * Given an integer array A of size N, find the first repeating element in it.
     * We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.
     * If there is no repeating element, return -1.
     * <p>
     * Logic : storing last values is repeated as we are running loop back-words so last value becomes the
     * first value  ..... yay
     * <p>
     * ITR:
     * TC: O(N)
     * SC: O(1)
     */
    private static int q2solveOptimised(int[] A) {
        HashMap<Integer, Integer> vis = new HashMap<Integer, Integer>();
        int ans = -1; //storing last values is repeated as we are running loop back-words so last value becomes the
        // first value  ..... yay
        for(int i = A.length-1; i >= 0; --i){
            if(vis.containsKey(A[i])){
                ans = A[i];
            }
            else{
                vis.put(A[i], 1);
            }
        }
        return ans;
    }

    /**
     *
     * TC: O(N^2)
     * SC: O(1)
     */
    private static int q2solve(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (findFrequency(A, i) > 1)
                return A[i];
        }
        return -1;
    }


    /**
     * Question : Given an array of integers A, find and return whether the given array contains a non-empty
     * subarray with a sum equal to 0.
     * If the given array contains a sub-array with sum zero return 1, else return 0.
     *
     * Logic :
     *
     * ITR:
     * TC:
     * SC:
     */
    private static int q3solve(int[] A){
        HashSet < Long > set = new HashSet < Long > ();
        long sum = 0;
        set.add(sum);
        for (int x: A) {
            sum += x;
            if (set.contains(sum)) return 1;
            else {
                set.add(sum);
            }
        }
        return 0;
    }

    /**
     * Question : You are given an array A of N integers. You will have to return number of distinct elements
     * of the array.
     *
     * Logic : use set for unique elements
     *
     * ITR:
     * TC:  O(N)
     * SC:  O(N)
     */
    private static int q5solve(int[] A){
        Set<Integer> set = new HashSet<>();
        for (int a:A) {
            set.add(a);
        }
        return set.size();
    }
}
