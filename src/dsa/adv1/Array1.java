package dsa.adv1;

import java.util.ArrayList;
import java.util.List;

class Array1 {
    public static void main(String[] args) {
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        q1ExtraFindMaxSubArrayStandEndPoint(A);
    }

    /**
     * Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.
     */
    public static int maxSubArray(final int[] A) {
        int sum = 0, ans = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            ans = Math.max(sum, ans);

            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }


    /**
     * Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.
     */
    public static ArrayList<Integer> q1ExtraFindMaxSubArrayStandEndPoint(final int[] A) {
        int sum = 0, ans = Integer.MIN_VALUE;
        int stIndex = 0, endIndex = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
//            ans = Math.max(sum, ans);
            if (ans < sum) {
                ans = sum;
                endIndex = i;
            }
            if (sum < 0) {
                sum = 0;
                if (i == A.length - 1) stIndex = i;
                else stIndex = i + 1;
            }
        }
        System.out.println("Max Sum: "+ans);

        //extracting sub array
        ArrayList<Integer> maxSubArray = new ArrayList<>();
        for (int i = stIndex; i <= endIndex; i++) {
            System.out.print(A[i] +", ");
            maxSubArray.add(A[i]);
        }

        return maxSubArray;
    }

}