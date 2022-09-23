package dsaBasic;

import java.util.Scanner;

public class ProblemSolving {

    public static void main(String[] args) {
//        q1();
        q2();
        main(args);
    }

    /**
     * count factors of given number (Optimized Code)
     * <p>
     * Time Complexity is sqrt(n)
     */
    private static String q1() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(q1Assist(n));
        return "";
    }

    /**
     * Assist method of q1
     */
    private static int q1Assist(int A) {
        int counter = 0;
        for (int i = 1; i <= Math.sqrt(A); i++) {
            if (A % i == 0) {
                if (i == Math.sqrt(A)) counter++;
                else counter += 2;
            }
        }
        return counter;
    }

    /**
     * Given an Integer A. Return 1 if A is prime and return 0 if not.
     */
    private static String q2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(q2Assist(scanner.nextLong()));
        return "";
    }

    /**
     *
     */
    private static int q2Assist(long A) {
        if (A==1)
            return 0;
        //TODO: for prime number run loop till i <= Math.sqrt(A)
        // as you can get all factor till sqrt(A)
        for (int i = 2; i <= Math.sqrt(A); i++) {
            if (A % i == 0) {
                return 0;
            }
        }
        return 1;
    }

}