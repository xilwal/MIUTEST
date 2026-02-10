public class Main {

    public static void main(String[] args) {
        int[] array1 = {2};
        System.out.println(isOddHeavy(array1)); // Output: 0

        int[] array2 = {11, 4, 9, 2, 8};
        System.out.println(isOddHeavy(array2)); // Output: 1

        int[] array3 = {1, 1, 1, 1, 1, 1};
        System.out.println(isOddHeavy(array3)); // Output: 1

        int[] array4 = {11, 4, 9, 2, 3, 10};
        System.out.println(isOddHeavy(array4)); // Output: 0

        int[] array5 = {-2, -4, -6, -8, -11};
        System.out.println(isOddHeavy(array5)); // Output: 0
    }

    public static int isOddHeavy(int[] a) {
        
        int hasOdd = 0;

        for (int i = 0; i < a.length; i++) {
            
            if (a[i] % 2 != 0) {
                hasOdd = 1;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0 && a[j] > a[i]) {
                        return 0; 
                    }
                }
            }
        }
        return hasOdd == 1 ? 1 : 0;
    }
}
