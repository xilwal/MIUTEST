public class MeeraArray {

    public static void main(String[] args) {
        // Test cases
        int[] testArray1 = {7, 9, 0, 10, 1};
        int result1 = isMeera(testArray1);
        System.out.println("Result for test1: " + result1); // Output: 1

        int[] testArray2 = {6, 10, 8};
        int result2 = isMeera(testArray2);
        System.out.println("Result for test2: " + result2); // Output: 1

        int[] testArray3 = {7, 6, 1};
        int result3 = isMeera(testArray3);
        System.out.println("Result for test3: " + result3); // Output: 0

        int[] testArray4 = {9, 10, 0};
        int result4 = isMeera(testArray4);
        System.out.println("Result for test4: " + result4); // Output: 0

        int[] testArray5 = {1, 1, 0, 8, 0, 9, 9, 1};
        int result5 = isMeera(testArray5);
        System.out.println("Result for test5: " + result5); // Output: 1
    } 

    public static int isMeera(int[] a) {
        boolean containsOne = false;
        boolean containsNine = false;

        for (int value : a) {
            if (value == 1) {
                containsOne = true;
            } else if (value == 9) {
                containsNine = true;
            }
        }

        return (containsOne && containsNine) || (!containsOne && !containsNine) ? 1 : 0;
    }
}