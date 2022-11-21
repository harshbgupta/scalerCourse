package dsa.intrermediate2;

import java.util.*;

public class Hashing1HW {
    public static void main(String[] args) {
        colorful(236);
    }

    /**
     * Question : Given an array A of N integers.
     *
     * Find the count of the subarrays in the array which sums to zero. Since the answer can be very large,
     * return the remainder on dividing the result with 109+7
     *
     * Logic :
     *
     * ITR:
     * TC: O(N)
     * SC: 
     */
    private static int q1CountOfSubArraySumZero(int[] A){
        int count =0;
        return count;
    }

    /**
     * Question : Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.
     * NOTE:
     * Each element in the result should appear as many times as it appears in both arrays.
     * The result can be in any order.
     * <p>
     * Logic :
     * <p>
     * ITR:
     * TC:
     * SC:
     */
    private static ArrayList<Integer> q2solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> b = new HashMap<Integer, Integer>();
        for (int x : A) {
            a.put(x, a.getOrDefault(x, 0) + 1);//vlaue stored incremrnt or default 0 + 1
        }
        for (int x : B) {
            b.put(x, b.getOrDefault(x, 0) + 1); //vlaue stored incremrnt or default 0 + 1
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        //TODO: did not understand this code
        for (int k : a.keySet()) {
            if (b.containsKey(k)) {
                for (int i = 0; i < Math.min(a.get(k), b.get(k)); ++i) {
                    ans.add(k);
                }
            }
        }
        return ans;
    }
    
    /**
     * Question :
     *
     * Logic :
     *
     * ITR:
     * TC: 
     * SC: 
     */
    private static int colorful(int A){
        //creating array of digits but it'll be in reverse order as we taking last digits first
        ArrayList < Integer > digitsArray = new ArrayList < > ();
        while (A != 0) {
            int num = A % 10;
            digitsArray.add(num);
            A /= 10;
        }

        //reversing the array so that it becomes the real(the Given) number
        Collections.reverse(digitsArray);

        //reversing the array so that it becomes the real(the Given) number
        HashSet < Integer > products = new HashSet < > ();
        int n = digitsArray.size();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int prod = 1;
                // prod stores the product of every digit in the range [i..j]
                for (int k = i; k <= j; k++) {
                    prod *= digitsArray.get(k);
                }
                // check if the product is unique
                if (products.contains(prod))
                    return 0;
                products.add(prod);
            }
        }
        return 1;
    }

    /**
     * Question : You are given an array A of N integers. Return the count of elements with frequncy 1 in the
     * given array.
     * <p>
     * Logic :
     * <p>
     * ITR:
     * TC:
     * SC:
     */
    private static int q4solve(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        // creating a map for frequency for elements
        for (int a : A) {
            if (map.containsKey(a)) {
                int freq = map.get(a);
                map.put(a, freq + 1);
            } else {
                map.put(a, 1);
            }
        }

        //counting the element of frequency 1
        int count  = 0;
        for (int a : A) {
            if (map.get(a)==1) {
                count++;
            }
        }
        return count;

    }


}
