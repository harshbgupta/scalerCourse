import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
    }

    /**
     * TC:
     * SC:
     */
    private static void q1() {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while (T > 0) {
            //array from user
            int n = scn.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scn.nextInt();
            }

            //trying tio figure number of odd or even number in array
            int even = 0;
            int odd = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 != 0) {
                    odd++;
                } else if (array[i] % 2 == 0) {
                    even++;
                }
            }

            //creating and dtoring odd and even ele saprate ky
            int[] oddarray = new int[odd];
            int[] evenarray = new int[even];
            int oddPtr = 0;
            int evenPtr = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 != 0) {
                    oddarray[oddPtr] = array[i];
                    oddPtr++;
                } else if (array[i] % 2 == 0) {
                    evenarray[evenPtr] = array[i];
                    evenPtr++;
                }
            }

            //printing
            for (int i = 0; i < oddarray.length; i++) {
                System.out.print(oddarray[i] + " ");
            }

            for (int i = 0; i < evenarray.length; i++) {
                System.out.print(evenarray[i] + " ");
            }
            System.out.println();
            T--;
        }
    }

    /**
     * TC:
     * SC:
     */
    private static void q2() {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while (T > 0) {
            //array from user
            int n = scn.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scn.nextInt();
            }

            //trying tio figure number of odd or even number in array
            String even = "";
            String odd = "";
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 != 0) {
                    odd = odd + array[i] + " ";
                } else if (array[i] % 2 == 0) {
                    even = even + array[i] + " ";
                }
            }

            System.out.println(odd);
            System.out.println(even);
            T--;
        }
    }


    public static int[] solve(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[] sum = new int[row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i] = A[i][j] + sum[i];
            }
        }
        return sum;
    }


    public static void myAns(String[] args) {
        Scanner scn = new Scanner(System.in);

        //taking array from user
        int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[row][col] = scn.nextInt();
            }
        }

        //crating array to store sum row wise
        int[] sum = new int[row];

        for (int i = 0; i < row; i++) {
            // a temp variable
            int temp = 0;
            for (int j = 0; j < col; j++) {
                //string the row sum in the temp var
                temp = temp + arr[i][j];
            }
            //taking the temp var and storing in storing in ans array
            sum[i] = temp;
        }
    }

    /**
     *
     */
    private static void q3() {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();

        int col = row;
        int[][] arr = new int[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                arr[r][c] = scn.nextInt();
            }
        }

        for (int c = 0; c < col; c++) {
            if (c % 2 == 0) {
                //even
                for (int r =0; r<row;r++){
                    System.out.println(arr[r][c]);
                }

            } else {
                //odd
                for (int r =row-1; r>=0;r--){
                    System.out.println(arr[r][c]);
                }

            }
        }
    }
}


