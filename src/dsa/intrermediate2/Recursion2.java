package dsa.intrermediate2;

public class Recursion2 {
    public static void main(String[] args) {

    }

    /**
     * #Question :
     * Implement pow(A, B) % C.
     * In other words, given A, B and C, Find (AB % C).
     * Note: The remainders on division cannot be negative. In other words, make sure the answer you return is
     * non-negative.
     * ---------------------
     * #Problem Constraints:
     * -109 <= A <= 109
     * 0 <= B <= 109
     * 1 <= C <= 109
     * ---------------------
     * #Logic :
     * ---------------------
     * #ITR:
     * #TC: O()
     * #SC: O()
     */
    private static int pow(int A, int B, int C) {
        if (A == 0)
            return 0;
        if (B == 0)
            return 1;
        long halfAns = pow(A, B / 2, C);
        halfAns = ((halfAns % C) * (halfAns % C)) % C; //for even this is enough but for odd we need multiply Number itself
        // once time
        if (B % 2 == 1)
            halfAns = ((halfAns) * (A % C)) % C; //if B%2 is odd so we need multiply A, i.e-> 3^5 = 3^2 * 3^2 *3
        halfAns = (halfAns + C) % C;//TODO did not understand this line
        return (int) halfAns;
    }

    /**
     * #Question :
     * int function(int n){
     * if(n % 2 == 0){
     * return 0;
     * }
     * return function(n-1) + function(Math.floor(n/2));
     * }
     * ---------------------
     * #Problem Constraints:
     * ---------------------
     * #Logic : for n n becimes half so O(LogN)
     * ---------------------
     * #ITR:
     * #TC: O(LogN)
     * #SC: O()
     */
}
