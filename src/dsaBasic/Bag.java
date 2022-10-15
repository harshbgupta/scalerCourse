package dsaBasic;

public class Bag {

    public static int[][] createArray(int n, int m) {
        int[][] arr = new int[n][m];
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = counter++;
            }
        }
        printArray(arr);
        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
