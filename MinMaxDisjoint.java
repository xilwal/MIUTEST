public class Main {

    public static void main(String[] args) {
        int[] array1 = {5, 4, 1, 3, 2};
        int[] array2 = {18, -1, 3, 4, 0};
        int[] array3 = {9, 0, 5, 9};
        int[] array4 = {0, 5, 18, 1, 9};
        int[] array5 = {7, 7, 7, 7};
        int[] array6 = {};
        int[] array7 = {1, 2, 3};

        System.out.println(isMinMaxDisjoint(array1)); // Output: 1
        System.out.println(isMinMaxDisjoint(array2)); // Output: 0
        System.out.println(isMinMaxDisjoint(array3)); // Output: 0
        System.out.println(isMinMaxDisjoint(array4)); // Output: 0
        System.out.println(isMinMaxDisjoint(array5)); // Output: 0
        System.out.println(isMinMaxDisjoint(array6)); // Output: 0
        System.out.println(isMinMaxDisjoint(array7)); // Output: 0
    }

    public static int isMinMaxDisjoint(int[] a) {
        if (a.length < 3) {
            return 0; // There must be at least three elements for min and max
        }

        int minIndex = -1;
        int maxIndex = -1;
        int minCount = 0;
        int maxCount = 0;

        for (int i = 0; i < a.length; i++) {
            if (minIndex == -1 || a[i] < a[minIndex]) {
                minIndex = i;
                minCount = 1;
            } else if (a[i] == a[minIndex]) {
                minCount++;
            }

            if (maxIndex == -1 || a[i] > a[maxIndex]) {
                maxIndex = i;
                maxCount = 1;
            } else if (a[i] == a[maxIndex]) {
                maxCount++;
            }
        }
		
        if(minCount > 1 || maxCount > 1 || minIndex == maxIndex || minIndex - maxIndex == 1 || maxIndex - minIndex == 1 )
        	return 0;
      return 1;
    }
}
