package dsa.intrermediate2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {

    }

    ///////////////////////////////////////////////////////////////////////////
    // Ques 1
    ///////////////////////////////////////////////////////////////////////////

    /**
     * #Question 1:
     * Given an integer array A of size N. You can remove any element from the array in one operation.
     * The cost of this operation is the sum of all elements in the array present before this operation.
     * Find the minimum cost to remove all elements from the array.
     * ---------------------
     * #Problem Constraints:
     * ---------------------
     * #Logic :
     * 1. we shall remove highest number at first so it won't be getting sum again, this way it become minimum result
     * 2. as it getting sum many times, whoever id getting fetched will be summed only omce, whoever is getting at last
     * will be summed by n-1
     * 3. so finally we can run to sorting array  from 0 to n-1 and multiply by (n-i) * elemnets
     * ---------------------
     * #ITR:
     * #TC: O()
     * #SC: O()
     */
    private static int q1solve(int[] A) {
        Arrays.sort(A);//array is in ascending order
        int n = A.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (n - i) * A[i];
        }
        return sum;
    }


    ///////////////////////////////////////////////////////////////////////////
    // Ques 4
    ///////////////////////////////////////////////////////////////////////////

    /**
     * #Question 4:
     * ---------------------
     * #Problem Constraints:
     * ---------------------
     * #Logic :
     * ---------------------
     * #ITR:
     * #TC: O()
     * #SC: O()
     */
    private static String q2largestNumber(final int[] A) {
        StringBuffer strBuf = new StringBuffer();
        Node num[];
        int i = 0;
        num = new Node[A.length];
        for (int n : A) {
            num[i] = new Node(n);
            i++;
        }
        // sorts the array lexicographically
        Arrays.sort(num);
        for (Node n : num) {
            if (n.number == 0 && strBuf.length() != 0) {
                continue;
            }
            strBuf.append(n.number);
        }
        return strBuf.toString();
    }

    static class Node implements Comparable<Node> {
        int number;

        public Node(int number) {
            this.number = number;
        }

        @Override
        public int compareTo(Node o) {
            String first = String.valueOf(this.number) + o.number;
            String second = String.valueOf(o.number) + this.number;
            return second.compareTo(first);
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // Ques 5
    ///////////////////////////////////////////////////////////////////////////
    /**
     * #Question 5: What is the time complexity of the following code snippet?
     * ArrayList v = new ArrayList();
     * //for loop O(N)
     * for(int i = 0; i &lt; n; i++){
     *     v.append(i); O(1)
     * }
     * Collections.sort(v); //O(NLogN)
     * ---------------------
     * #Problem Constraints:
     * ---------------------
     * #Logic :
     * ---------------------
     * #ITR:
     * #TC: O(N) + O(NLogN) -> O(NLogN)
     * #SC: O()
     */


}

