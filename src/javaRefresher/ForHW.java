package javaRefresher;

import java.util.Scanner;

public class ForHW {

    public static void main(String[] args) {
        printPrimeTillN();
    }

    private static void printPrimeTillN() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 2; i <= n; i++) {
            if (checkPrime(i))
                System.out.println(i);
        }
    }


    public static boolean checkPrime(int i) {
        for (int j =2; j<=Math.sqrt(i);j++){
            if (i%j==0){
                return  false;
            }
        }
        return  true;
    }
}
