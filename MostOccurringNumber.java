public class MostOccurringNumber {

    public static void main(String[] args) {
        // Test cases
        int[] testArray1 = {6, 8, 1, 8, 2};
        int result1 = answerTwo(testArray1);
        System.out.println("Result for test1: " + result1); // Output: 8

        int[] testArray2 = {6, 8, 1, 8, 6};
        int result2 = answerTwo(testArray2);
        System.out.println("Result for test2: " + result2); // Output: 8 or 6
    }

    public static int answerTwo(int[] a) {
        if (a.length == 0) {
            return 0; // You can return any value indicating no most occurring number
        }

        int mostOccurringNumber = a[0];
        int mostOccurringCount = 1;

        for (int i = 0; i < a.length; i++) {
            int currentNumber = a[i];
            int currentCount = 1;

            // Count occurrences of the current number
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == currentNumber) {
                    currentCount++;
                }
            }

            // Update most occurring number if needed
            if (currentCount > mostOccurringCount) {
                mostOccurringNumber = currentNumber;
                mostOccurringCount = currentCount;
            }
        }

        return mostOccurringNumber;
    }
}