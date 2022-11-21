package dsa.intrermediate2;

import java.util.Scanner;

public class ClassObjectHW {
    static class Matrix {
        // Define properties here
        int row, column;
        int[][] mat;

        // Define constructor here
        Matrix(int r, int c){
            this.row = r;
            this.column = c;
            this.mat = new int[r][c];
        }

        void input(Scanner sc){
            // Use the Scanner object passed as argument for taking input and not a new Scanner object
            // Complete the function
            for(int i = 0 ; i < this.row ; i++){
                for(int j = 0 ; j < this.column ; j++){
                    mat[i][j] = sc.nextInt();;
                }
            }
        }

        Matrix add(Matrix x){
            // Complete the function
            Matrix res = new Matrix(this.row , this.column);
            for(int i = 0 ; i < this.row ; i++){
                for(int j = 0 ; j < this.column ; j++){
                    res.mat[i][j] = this.mat[i][j] + x.mat[i][j];
                }
            }
            return res;
        }

        Matrix subtract(Matrix x){
            // Complete the function
            Matrix res = new Matrix(this.row , this.column);
            for(int i = 0 ; i < this.row ; i++){
                for(int j = 0 ; j < this.column ; j++){
                    res.mat[i][j] = this.mat[i][j] - x.mat[i][j];
                }
            }
            return res;
        }

        Matrix transpose(){
            // Complete the function
            Matrix res = new Matrix(this.column , this.row);
            for(int i = 0 ; i < this.row ; i++){
                for(int j = 0 ; j < this.column ; j++){
                    res.mat[j][i] = this.mat[i][j];
                }
            }
            return res;
        }

        void print(){
            // Complete the function
            for(int i = 0 ; i < this.row ; i++){
                for(int j = 0 ; j < this.column ; j++){
                    System.out.print(this.mat[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
    }


    /**
     * ques 2
     *
     */

    int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    class Fraction {
        int numerator, denominator;

        // Define constructor here
        Fraction(int u, int v){
            this.numerator = u;
            this.denominator = v;
        }

        Fraction add(Fraction a){
            // Complete the function
            int denom = this.denominator * a.denominator;
            int num = this.denominator * a.numerator + this.numerator * a.denominator;
            int temp = gcd(Math.abs(num) , Math.abs(denom));
            num /= temp;
            denom /= temp;
            return new Fraction(num, denom);
        }

        Fraction subtract(Fraction a){
            // Complete the function
            int denom = this.denominator * a.denominator;
            int num = this.numerator * a.denominator - this.denominator * a.numerator;
            int temp = gcd(Math.abs(num) , Math.abs(denom));
            num /= temp;
            denom /= temp;
            return new Fraction(num, denom);
        }

        Fraction multiply(Fraction a){
            // Complete the function
            int denom = this.denominator * a.denominator;
            int num = this.numerator * a.numerator;
            int temp = gcd(Math.abs(num) , Math.abs(denom));
            num /= temp;
            denom /= temp;
            return new Fraction(num, denom);
        }
    }
}
