public class Main {

    public static void main(String[] args) {
        // Test cases
        System.out.println(largestDifferenceOfEvens(new int[]{1, 0, 5, 9})); // -1
        System.out.println(largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33})); // -1
        System.out.println(largestDifferenceOfEvens(new int[]{-2, 3, 4, 9})); // 6
        System.out.println(largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4})); // 4
    }

    // Function to find the largest difference between even elements in the array
    public static int largestDifferenceOfEvens(int[] a) {
        
        if(a.length < 2)
            return -1;
            
        int maxEven = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        int evenCount = 0;

        for (int num : a) {
            if (num % 2 == 0) {
                maxEven = maxEven > num ? maxEven : num;
                minEven = minEven < num ? minEven : num;
                evenCount++;
            }
        }

        if (evenCount < 2 || maxEven == Integer.MIN_VALUE || minEven == Integer.MAX_VALUE) {
            return -1;
        }

        return maxEven - minEven;
    }
}
