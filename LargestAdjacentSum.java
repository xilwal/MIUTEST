public class Main {

    public static void main(String[] args) {
        // Examples
        int[] array1 = {1, 2, 3, 4};
        System.out.println("Result 1: " + largestAdjacentSum(array1));

        int[] array2 = {18, -12, 9, -10};
        System.out.println("Result 2: " + largestAdjacentSum(array2));

        int[] array3 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("Result 3: " + largestAdjacentSum(array3));

        int[] array4 = {1, 1, 1, 1, 1, 2, 1, 1, 1};
        System.out.println("Result 4: " + largestAdjacentSum(array4));
    }

    public static int largestAdjacentSum(int[] a) {
        
        int largestSum = 0;

        for (int i = 1; i < a.length; i++) {
            int sum = a[i - 1] + a[i];
            if (sum > largestSum) {
                largestSum = sum;
            }
        }

        return largestSum;
    }
}
