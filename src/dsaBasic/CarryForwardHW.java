package dsaBasic;

public class CarryForwardHW {
    public static void main(String[] args) {

    }

    /**
     * TC:
     * SC:
     */
    private static void q1() {

    }

    /**
     * You are given a string S, and you have to find all the amazing substrings of S.
     * An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
     * <p>
     * TC:
     * SC:
     */
    private static int q3(String A) {
        int count = 0, ans = 0, MOD = 1000 * 1000 * 1000 + 7;
        for (int i = A.length() - 1; i >= 0; i--) {
            if (A.charAt(i) != 'a' && A.charAt(i) != 'e' && A.charAt(i) != 'i' && A.charAt(i) != 'o' && A.charAt(i) != 'u' &&
                    A.charAt(i) != 'A' && A.charAt(i) != 'E' && A.charAt(i) != 'I' && A.charAt(i) != 'O' && A.charAt(i) != 'U') {
                count++;
            } else if (A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u' ||
                    A.charAt(i) == 'A' || A.charAt(i) == 'E' || A.charAt(i) == 'I' || A.charAt(i) == 'O' || A.charAt(i) == 'U') {
                ans = ans + count;
            }
        }
        return ans;
    }
}
