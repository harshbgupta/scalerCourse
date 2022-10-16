package dsaBasic1;

public class PrefixSum {
    public static void main(String[] args) {
        int[] A = {1, 2, 5, 1, 2};
        System.out.println(q4EquilibriumIndexOfArray(A));
    }

    /**
     * q1: The prefix sum formula for an array A of N integers is given by :-
     *
     * ans: prefSum[i] = prefSum[i - 1] + A[i]
     */

    /**
     * What is the time complexity of creating the prefix sum array of an array A of N integers ?
     *
     * and: O(N)
     */

    /**
     * TODO: Prefix Sum code
     * Given an array A of N integers. Construct prefix sum of the array in the given array itself.
     */
    private static int[] q3PrefixSum(int[] A) {
        int[] prefixSum = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (i == 0) prefixSum[0] = A[0];
            else {
                prefixSum[i] = prefixSum[i - 1] + A[i];
            }
        }
        return prefixSum;
    }

    /**
     * it's not working for the case int[] A = {1, 2, 5, 1, 2}; equilibrium index 0
     * TC: O(N)
     * SC: O(N)
     */
    private static int q4EquilibriumIndexOfArray(int[] A) {
        int[] prefixSumArray = q3PrefixSum(A);

        //prefixSumArray.length == 0 and A.length ==0 both are same as both have same length always
        int n = prefixSumArray.length;
        if (n < 3) return -1;
        for (int i = 2; i < n; i++) {

            if (prefixSumArray[i - 1] == prefixSumArray[n - 1] - prefixSumArray[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * it's working
     * TC: O(N)
     * SC: O(N)
     */
    private static int q4(int[] A) {
        int[] prefixSumArray = q3PrefixSum(A);
        int[] suffixSumArray = q3SuffixSum(A);
        for (int i = 0; i < prefixSumArray.length; i++) {
            if (prefixSumArray[i] == suffixSumArray[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param A
     * @return
     */
    private static int[] q3SuffixSum(int[] A) {
        int[] suffixSum = new int[A.length];
        for (int i = A.length - 1; i >= 0; i--) {
            if (i == A.length - 1) suffixSum[A.length - 1] = A[A.length - 1];
            else {
                suffixSum[i] = suffixSum[i + 1] + A[i];
            }
        }
        return suffixSum;
    }


}
