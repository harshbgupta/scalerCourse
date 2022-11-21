package dsa.intrermediate2;

public class StringsDataStructure {
    public static void main(String[] args) {
        System.out.println(q7longestPalindrome("aaabaaa"));
    }

    /**
     * You are given a function to_lower() which takes a character array A as an argument.
     * Convert each character of A into lowercase characters if it exists. If the lowercase of a character does not
     * exist, it remains unmodified.
     * The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.
     * Return the lowercase version of the given character array.
     * <p>
     * TC: O(N)
     * SC: O(1)
     */
    private static char[] q1to_lower(char[] A) {
        /*
            Logic:
            'a' = 65 and 'A' = 97 so if check for capital letter and minus 32 that will make it small char
            // now u can just minus 32 normal wat but let's do that smart way
            // 32 -> 0 1 0 0 0 0 or say 1<<5
            // and every capital letter's binary code will have 32 means 6th digit in it's binary code will be set (1)
            // for removing it we need to make unset (0) so lets take xor
         */
        for (int i = 0; i < A.length; i++) {
            char indexChar = A[i];
            if (indexChar >= 'A' && indexChar <= 'Z') {
                char temp = (char) (A[i] ^ (1 << 5));
                A[i] = temp;
            }
        }
        return A;
    }

    /**
     * You are given a function to_lower() which takes a character array A as an argument.
     * Convert each character of A into lowercase characters if it exists. If the lowercase of a character does not
     * exist, it remains unmodified.
     * The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.
     * Return the lowercase version of the given character array.
     * <p>
     * TC: O(N)
     * SC: O(1)
     */
    private static char[] q2to_upper(char[] A) {
        /*
            Logic:
            'a' = 65 and 'A' = 97 so if check for capital letter and add 32 that will make it small char
            // now u can just add 32 normal wat but let's do that smart way
            // 32 -> 0 1 0 0 0 0 or say 1<<5
            // and every small letter's binary code will have 32 means 6th digit in it's binary code will be unset (0)
            // for add it we need to make set (2) so lets take or
         */
        for (int i = 0; i < A.length; i++) {
            char indexChar = A[i];
            if (indexChar >= 'a' && indexChar <= 'z') {
                char temp = (char) (A[i] - 32);
                A[i] = temp;
            }
        }
        return A;
    }

    /**
     * You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.
     * <p>
     * You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.
     * TC: O(N)
     * SC: O(1)
     */
    private static String q3ToggleCase(String A) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            char indexChar = A.charAt(i);
            char toggledChar = (char) (indexChar ^ 1 << 5); // 6th (2^5) is getting toggled by using xor
            ans.append(toggledChar);
        }
        return ans.toString();
    }

    /**
     * Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.
     * <p>
     * TC:
     * SC:
     */
    private static int[] q4solve(int[] A) {
        int n = A.length;
        int mx = -1;
        for(int i = 0 ; i < n ; i++){
            mx = Math.max(mx, A[i]);
        }
        int[] freq = new int[mx + 1];
        for(int i = 0 ; i < n ; i++){
            freq[A[i]] += 1;
        }
        int k = 0;
        for(int i = 0 ; i <= mx ; i++){
            for(int j = 0 ; j < freq[i] ; j++){
                A[k] = i;
                k++;
            }
        }
        return A;
    }

    /**
     * Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.
     * <p>
     * TC:
     * SC:
     */
    private static String q5ReverseStringOptimised(String A) {
        char[] s = A.toCharArray();
        int n = A.length();
        for (int i = 0; i < n / 2; i++) {
            char tmp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = tmp;
        }
        return new String(s);
    }

    /**
     * Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.
     * <p>
     * TC:
     * SC:
     */
    private static String q5ReverseStringNormal(String A) {
        StringBuilder sb = new StringBuilder();
        int e = A.length() - 1;
        while (e >= 0) {
            char temp = A.charAt(e);
            sb.append(temp);
            e--;
        }
        return sb.toString();
    }


    /**
     * You are given a string A of size N.
     * Return the string A after reversing the string word by word.
     * <p>
     * TC: O(N)
     * SC:
     */
    private static String q6ReverseSentence(String A) {
        StringBuilder sb = new StringBuilder();
        String reversedSentence = q5ReverseStringOptimised(A);
        int s1 = 0, e = 0;
        for (int i = 0; i < A.length(); i++) {
            if ((reversedSentence.charAt(i) + "").equals(" ") || i == reversedSentence.length() - 1) {
                if (i == reversedSentence.length() - 1) {
                    e = i + 1;
                } else {
                    e = i;
                }
                sb.append(q5ReverseStringOptimised(reversedSentence.substring(s1, e)));
                if (i != reversedSentence.length() - 1) {
                    sb.append(" ");
                }
                s1 = e + 1;
            }

        }
        return sb.toString().trim();
    }


    /**
     * You are given a string A of size N.
     * Return the string A after reversing the string word by word.
     * TC: O(N)
     * SC:
     */
    private static String q5Optimised(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != ' ') temp.append(c);
            else create(ans, temp);
        }
        create(ans, temp);
        return ans.toString();
    }

    private static void create(StringBuilder ans, StringBuilder temp) {
        int i = temp.length() - 1;
        while (i >= 0) {
            if (i == temp.length() - 1 && ans.length() > 0) ans.append(' ');
            ans.append(temp.charAt(i));
            i--;
        }
        temp.setLength(0);
    }


    /**
     * Given a string A of size N, find and return the longest palindromic substring in A.
     * <p>
     * Substring of string A is A[i...j] where 0 <= i <= j < len(A)
     * <p>
     * Palindrome string:
     * A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
     * <p>
     * In case of conflict, return the substring which occurs first ( with the least starting index).
     * <p>
     * TC: O(N^2)
     * SC: O(1)
     */
    private static String q7longestPalindrome(String A) {
        String longestPalindrome = A.charAt(0) + "";
        for (int i = 0; i < A.length(); i++) {
            for (int j = i + 1; j < A.length(); j++) {
                String temp = A.substring(i, j + 1);
//                System.out.println("temp ==> " + temp);
                if (temp.equals(q5ReverseStringOptimised(temp)) && longestPalindrome.length() < temp.length()) {
                    longestPalindrome = temp;
//                    System.out.println("longestPalindrome temp ==> " + temp);
                }
            }
        }
//        System.out.println("longestPalindrome final ==> " + longestPalindrome);
        return longestPalindrome;
    }


    ///////////////////////////////////////////////////////////////////////////
    // palindrome optimised
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Given a string A of size N, find and return the longest palindromic substring in A.
     * <p>
     * Substring of string A is A[i...j] where 0 <= i <= j < len(A)
     * <p>
     * Palindrome string:
     * A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
     * <p>
     * In case of conflict, return the substring which occurs first ( with the least starting index).
     * <p>
     * TC: O(N)
     * SC: O(1)
     */
    public static String q7longestPalindromeOptimised(String A) {
        int n = A.length();
        if (n == 0)
            return "";
        String longest = A.substring(0, 1); // a single char itself is a palindrome
        for (int i = 0; i < n - 1; i++) {
            //we are taking i and now we are checking its neighbours weather they are equal or not
            String p1 = expandAroundCenter(A, i, i); // assuming palindrome string length odd
            if (p1.length() > longest.length())
                longest = p1;
            String p2 = expandAroundCenter(A, i, i + 1); // assuming palindrome string length even
            if (p2.length() > longest.length())
                longest = p2;
        }
        return longest;
    }

    public static String expandAroundCenter(String s, int c1, int c2) {
        int l = c1, r = c2;
        int n = s.length();
        while (l >= 0 && r <= n - 1 && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}
