public class BeanArray {

      public static void main(String[] args) {
        // Test cases
        int[] testArray1 = {4, 9, 8};
        int result1 = isBean(testArray1);
        System.out.println("Result for test1: " + result1); // Output: 1

        int[] testArray2 = {2, 2, 5, 11, 23};
        int result2 = isBean(testArray2);
        System.out.println("Result for test2: " + result2); // Output: 1

        int[] testArray3 = {3, 8, 4};
        int result3 = isBean(testArray3);
        System.out.println("Result for test3: " + result3); // Output: 0
    }

    public static int isBean(int[] a) {
        int found = false;
        for (int value : a) {
            for (int element : a) {
                if (element == value * 2 || element == value * 2 + 1 || element == value / 2) {
                    found = true;
                    break;
                }
            }
            return found;
        }
        return found;
    }

}