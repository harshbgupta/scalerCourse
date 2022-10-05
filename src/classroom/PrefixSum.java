package classroom;

public class PrefixSum {

    public static void main(String[] args) {

    }

    /**
     * Given an array A of N integers. Count the number of elements that have at least 1
     * elements greater than itself.
     */
    private static int q1(int[] A) {
        int maxValue = 0, maxValueFrequency = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > maxValue) {
                //found new max value
                maxValue = A[i];
                maxValueFrequency = 1;
            } else if (A[i] == maxValue) {
                maxValueFrequency++;
                //found same max value again so increase the counter
            }
        }
        //as the required ia all elements except max Value
        //so removing the frequency of max value will bee the remaining number which are smaller than max value
        // and that's the answer
        return A.length - maxValueFrequency;
    }
}
