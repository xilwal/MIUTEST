public class Main {

    public static void main(String[] args) {
        int[] array1 = {-1, 0, 1, 0, 0, 0};
        int[] array2 = {};
        int[] array3 = {2147483647, 1, -2147483648};

        System.out.println(isTrivalent(array1)); // Output: 1
        System.out.println(isTrivalent(array2)); // Output: 0
        System.out.println(isTrivalent(array3)); // Output: 1
    }

    static int isTrivalent(int[] a) {
        if (a.length < 3) {
            return 0; // Empty array is not trivalent
        }

        // Initialize variables to store the three distinct values
        int value1 = a[0];
        int value2 = a[0];
        int value3 = a[0];

        // Count the occurrences of each value
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < a.length; i++) {
            
            int current = a[i];

            if (current == value1) {
                count1++;
            } else if (current == value2) {
                count2++;
            } else if (current == value3) {
                count3++;
            } else {
                // If a new distinct value is found, check if there are already three distinct values
                if (count1 == 0) {
                    value1 = current;
                    count1++;
                } else if (count2 == 0) {
                    value2 = current;
                    count2++;
                } else if (count3 == 0) {
                    value3 = current;
                    count3++;
                } else {
                    return 0; // More than three distinct values found
                }
            }
        }

        // Check if exactly three distinct values are found
        return (count1 > 0 && count2 > 0 && count3 > 0) ? 1 : 0;
    }
}
