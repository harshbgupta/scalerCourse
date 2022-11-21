package dsa.intrermediate2;

public class Recursion1 {
    public static void main(String[] args) {
        q4Print1ToADec(9);
        System.out.println();
    }

    /**
     * Question : 1
     * <p>
     * The Fibonacci numbers are the numbers in the following integer sequence.
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
     * <p>
     * In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation:
     * Fn = Fn-1 + Fn-2
     * Given a number A, find and return the Ath Fibonacci Number.
     * Given that F0 = 0 and F1 = 1.
     * <p>
     * TC: O(N)  ==> O(n) if we consider the function call stack size, otherwise O(1).
     * SC: O(N)
     */
    private static int findAthFibonacci(int A) {
        if (A <= 1) return A;

        return findAthFibonacci(A - 1) + findAthFibonacci(A - 2);
    }

    /**
     * Question 2 :
     * Write a program to find the factorial of the given number A.
     * <p>
     * Logic : Use Recuerion and put the condition for 0! =1
     * <p>
     * ITR:
     * TC:
     * SC:
     */
    private static int q2Fact(int A) {
        if (A == 0) return 1;
        return A * q2Fact(A - 1);
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
    private static int q3palindrome(String A){
        return palindromeRecursive(0,A.length()-1, A);
    }

    /**
     * Question : support method of q3palindrome
     *
     * ITR: length/2
     * TC: O(N)
     * SC: O(N)
     */
    private static int palindromeRecursive(int i, int j, String A){
        if(i >= j){
            return 1;
        }
        if(A.charAt(i) != A.charAt(j)){
            return 0;
        }
        return palindromeRecursive(i+1, j-1, A);
    }
    
    
    /**
     * Question : You are given an integer A, print 1 to A using using recursion.
     *
     * Logic :
     *
     * ITR:
     * TC: 
     * SC: 
     */
    private static void q4Print1ToAInc(int A){
        if(A==1) {
            System.out.print(1+" ");
            System.out.println();
            return;
        }
        q4Print1ToAInc(A-1);
        System.out.print(A+" ");
    }


    private static void q4Print1ToADec(int A){
        if(A==1) {
            System.out.print(1+" ");
            return;
        }
        System.out.print(A+" ");
        q4Print1ToADec(A-1);
    }
}
