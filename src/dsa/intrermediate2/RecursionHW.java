package dsa.intrermediate2;

import java.util.Scanner;

public class RecursionHW {

    public static void main(String[] args) {
        q1ReverseString();
    }

    /**
     * Question :
     * <p>
     * Logic :
     * <p>
     * ITR:
     * TC:
     * SC:
     */
    private static void q1ReverseString() {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(reverseString(s.length(), s));
    }

    /**
     * Question :
     * <p>
     * Logic :
     * <p>
     * ITR:
     * TC:
     * SC:
     */
    private static String reverseString(int i, String s) {
        if (i < 1)
            return "";
        i--;
        return s.charAt(i) + reverseString(i, s);
    }

    /**
     * Question :
     * <p>
     * Logic :
     * <p>
     * ITR:
     * TC:
     * SC:
     */
    private static int q2DigitSum(int A) {
        if (A == 0)
            return 0;
        return A % 10 + q2DigitSum(A / 10);
    }

    /*
    Ques3:
    public class solve {

        static int bar(int x, int y){
            if (y == 0)   return 0;
            return (x + bar(x, y-1));
        }

        static int foo(int x, int y){
            if (y == 0) return 1;
            return bar(x, foo(x, y-1));
        }
        public static void main (String[] args)
        {
             System.out.println(foo(3,5));
        }

    }
       ==============================

    Exp: Recurrence relation for bar(x,y)
        is

        bar(x, y) = x + bar(x, y−1) = 2x + bar(x, y−2) = … = yx + bar(x, 0) = yx
        That is bar(x,y)
        returns the product of x and y

        Now, recurrence relation for foo

        is

        foo(a, b) = a × foo(a, b−1) = a × a × foo(a, b−2) = … = ab × foo(a, 0) = ab × 1 = ab
        The given code returns a^b

        so Ans 3^5 = 243
     */






    /*
        Ques 4:
        public int fun(int x, int n) {
            if (n == 0)
                return 1;
            else if (n % 2 == 0)
                return fun(x * x, n / 2);
            else
                return x * fun(x * x, (n - 1) / 2);
        }
        public void main() {
            int ans = fun(2, 10);
            System.out.println(ans);
        }
        ==================

         The above function performs binary exponentation which returns xn, hence the answer is 2^10 = 1024.
     */
}
