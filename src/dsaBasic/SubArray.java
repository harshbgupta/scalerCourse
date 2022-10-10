package dsaBasic;

public class SubArray {

    /*
    Q1
    Given an array of size 21, find the total number of subarrays of the array.

    numberOfArrays = n(n+1)/2
    so ans  = 21*22/2 = 231
    */

    /*

     */


    /*
    Q2
    What is the time and space complexity for printing the sum of each subarray?
        void printSums(int ar[]){
            int n = ar.length;
            for(int i = 0 ; i < n ; i++){
                int sum = 0;
                for(int j = i ; j < n ; j++){
                    sum = sum + ar[j];
                    print(sum)
                }
            }
        }

        TC: O(N^2)
        SC: O(1)
    */


    /*
    Q2
    What is the time and space complexity for printing the sum of each subarray?
        void printSums(int ar[]){
            int n = ar.length;
            int pf[N];
            pf[0] = ar[0];
            for(int i = 1 ; i < n ; i++){=
                pf[i] = pf[i - 1] + ar[i];
            }
            for(int i = 0 ; i < n ; i++){
                for(int j = i ; j < n ; j++){
                    if(i == 0){
                        print(pf[j]);
                    } else{
                        print(pf[j] - pf[i - 1]);
                    }
                }
            }
    }

        TC: O(N^2)
        SC: O(N) -> Prefix Sum
    */

    /**
     * Given an array A of length N, return the subarray from B to C.
     * <p>
     * TC:
     * SC:
     */
    private static int[] q3(int[] A, int B, int C) {
        int[] ans = new int[C - B + 1];
        for (int i = B; i <= C; i++) {
            ans[i - B] = A[i];
        }
        return ans;
    }

}
